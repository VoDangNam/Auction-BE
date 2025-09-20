package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Service.AuctionRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.auctionaa.backend.Entity.AuctionRoom;

import java.util.List;

@RestController
public class AuctionRoomController {
    @Autowired
    private AuctionRoomService auctionRoomService;


    @GetMapping("/getRooms/{userId}")
    public List<AuctionRoom> getAutionRooms(@PathVariable String userId)
    {
        return auctionRoomService.getAuctionRoomByUserId(userId);
    }


}
