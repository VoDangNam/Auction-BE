package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class GetListArtwork {
    @Autowired
    private ArtworkService artworkService;

    public GetListArtwork(ArtworkService artworkService) {
        this.artworkService = artworkService;
    }

    //Lấy danh sách tác phẩm tiêu biểu (6 tác phẩm có giá cao nhất)
    @GetMapping("/FeaturedAw")
     public List<Artwork> getFeaturedArtworks(){
        return artworkService.getFeaturedArtworks();
    }

    //Lấy danh sách tất cả tác phẩm
    @GetMapping("/allArtwork")
    public List<Artwork> getAll(){
        return artworkService.getAllArtwork();
    }

    //Chỉ đẩy test PostMan
    @PostMapping("/addArtwork")
    public Artwork createArtwork(@RequestBody Artwork artwork){
        return artworkService.saveArtwork(artwork);
    }
}

