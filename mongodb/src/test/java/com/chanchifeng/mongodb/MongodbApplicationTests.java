package com.chanchifeng.mongodb;

import com.chanchifeng.mongodb.models.User;
import com.chanchifeng.mongodb.repositories.UserRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {DataSourceConfig.class})
@FixMethodOrder
public class MongodbApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(MongodbApplicationTests.class);

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    UserRepository userRepository;

    @Before
    public void setup() {
        Set<String> roles = new HashSet<>();
        roles.add("manage");
        User user = new User("1", "user", "12345678", "name", "email@com.cn", new Date(), roles);
        userRepository.save(user);
    }

    @Test
    public void findAll() {
        List<User> users = userRepository.findAll();
        Assert.notNull(users);
        for (User user : users) {
            logger.info("===user=== userid:{}, username:{}, pass:{}, registrationDate:{}",
                    user.getUserId(), user.getName(), user.getPassword(), user.getRegistrationDate());
        }
    }

}
