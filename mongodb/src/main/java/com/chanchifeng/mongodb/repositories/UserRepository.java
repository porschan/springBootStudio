package com.chanchifeng.mongodb.repositories;

import com.chanchifeng.mongodb.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(String username);

}
