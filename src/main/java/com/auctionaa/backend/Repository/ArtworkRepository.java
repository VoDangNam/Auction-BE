package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Entity.AuctionRoom;
import com.auctionaa.backend.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;
import java.util.Optional;

public interface ArtworkRepository extends MongoRepository<Artwork,String> {
    List<Artwork> findTop6ByOrderByPriceDesc();
<<<<<<< Updated upstream
    List<Artwork> findByOwner_Id(String ownerId);
=======
    List<Artwork> findAll();

    @Query("{ 'owner.$id' : ?0 }")
    List<Artwork> findByOwnerId(String ownerId);

    @Query("{ 'user.$id' : ?0 }")
    List<AuctionRoom> findByUserId(String userId);
>>>>>>> Stashed changes
}
