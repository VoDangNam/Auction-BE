package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User,String> {
    boolean existsByEmail(String email);
}
