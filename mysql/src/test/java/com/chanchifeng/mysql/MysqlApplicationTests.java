package com.chanchifeng.mysql;

import com.chanchifeng.mysql.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM user");
        System.out.println("query result is " + result.size());
        System.out.println("success");
    }

    @Test
    public void testMysqlForUpdate(){
        jdbcTemplate.execute("update user set name='porschan99' where id = 2");
        System.out.println("suc ");
    }

    @Test
    public void mySqlTest(){
        String s = "SELECT * FROM user";
        List<User> userList = jdbcTemplate.query(s, (tempUser, i) -> {
            User user = new User();
            user.setId(tempUser.getString("id"));
            user.setName(tempUser.getString("name"));
            user.setPassword(tempUser.getString("password"));
            return user;
        });
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

}

