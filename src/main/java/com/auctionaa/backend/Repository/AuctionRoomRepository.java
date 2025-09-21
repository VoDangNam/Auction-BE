package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.AuctionRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AuctionRoomRepository extends MongoRepository<AuctionRoom,String> {
    List<AuctionRoom> findByUser_Id(String userId);
}
