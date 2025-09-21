package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.AuctionRoom;
import com.auctionaa.backend.Repository.AuctionRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuctionRoomService {
    @Autowired
    private AuctionRoomRepository auctionRoomRepository;

    public List<AuctionRoom> getAuctionRoomByUserId(String userId)
    {
        return auctionRoomRepository.findByUser_Id(userId);
    }
}
