package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.AuctionRoom;
import com.auctionaa.backend.Service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class GetAuctionRoom {

    @Autowired
    private ArtworkService artworkService;

    @GetMapping("/getAuctionRoom/{userId}")
    public List<AuctionRoom> getAuctionRoomsByUser(@PathVariable String userId) {
        return artworkService.getAuctionRoomsByUser(userId);
    }
}
