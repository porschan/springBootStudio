package com.chanchifeng.neo4j;

import com.chanchifeng.neo4j.model.Legend;
import com.chanchifeng.neo4j.repositories.LegendRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Neo4jApplicationTests {

    @Autowired
    LegendRepo legendRepo;

    private final static Logger log = LoggerFactory.getLogger(Neo4jApplicationTests.class);

    @Test
    public void contextLoads() {
        legendRepo.deleteAll();

        Legend yangguo = new Legend("杨过");
        Legend dragonGirl = new Legend("小龙女");
        Legend guoxiang = new Legend("郭襄");

        List<Legend> team = Arrays.asList(yangguo, dragonGirl, guoxiang);

        log.info("Before linking up with Neo4j...");
        //java 8 stream
        team.stream().forEach(legend -> log.info("\t" + legend.toString()));

        legendRepo.save(yangguo);
        legendRepo.save(dragonGirl);
        legendRepo.save(guoxiang);

        yangguo = legendRepo.findByName(yangguo.getName());
        yangguo.fansWith(dragonGirl);
        yangguo.fansWith(guoxiang);
        legendRepo.save(yangguo);

        dragonGirl = legendRepo.findByName(dragonGirl.getName());
        dragonGirl.fansWith(guoxiang);
        dragonGirl.fansWith(yangguo);
        legendRepo.save(dragonGirl);


        log.info("Look up yangguo's fans ...");
        log.info(legendRepo.findByName("杨过").toString());
    }


}
