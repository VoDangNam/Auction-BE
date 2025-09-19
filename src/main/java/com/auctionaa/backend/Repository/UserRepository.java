package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    boolean existsByEmail(String email);
<<<<<<< Updated upstream
=======
    Optional<User> findByEmail(String email);
>>>>>>> Stashed changes
}
