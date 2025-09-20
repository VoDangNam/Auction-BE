package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

<<<<<<< Updated upstream

=======
import java.util.Optional;

@Repository
>>>>>>> Stashed changes
public interface UserRepository extends MongoRepository<User,String> {
    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
