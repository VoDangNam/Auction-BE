package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.Artwork;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
<<<<<<< HEAD

public interface ArtworkRepository extends MongoRepository<Artwork,String> {
    List<Artwork> findTop6ByOrderByPriceDesc();
    List<Artwork> findAll();
=======
import java.util.Optional;

public interface ArtworkRepository extends MongoRepository<Artwork,String> {
    List<Artwork> findTop6ByOrderByPriceDesc();
>>>>>>> origin/main
    List<Artwork> findByOwner_Id(String ownerId);
}
