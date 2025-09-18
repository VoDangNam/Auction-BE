package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Repository.ArtworkRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    public List<Artwork> getFeaturedArtworks(){
        return artworkRepository.findTop6ByOrderByPriceDesc();
    }
    public List<Artwork> getAllArtwork(){
        return artworkRepository.findAll();
    }

    //Chỉ đẩy test PostMan
    public Artwork saveArtwork(Artwork artwork) {
        artwork.setCreatedAt(LocalDateTime.now());
        artwork.setUpdatedAt(LocalDateTime.now());
        return artworkRepository.save(artwork);
    }

}
