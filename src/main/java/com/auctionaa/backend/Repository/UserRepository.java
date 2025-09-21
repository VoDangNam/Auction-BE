package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
<<<<<<< HEAD


import java.util.Optional;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
=======
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    boolean existsByEmail(String email);
>>>>>>> origin/main
}
