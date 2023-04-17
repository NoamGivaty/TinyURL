package com.tinyurl.repository;

import com.tinyurl.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findFirstByName(String name);

}