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

<<<<<<< Updated upstream
}
=======
    //  Hàm mới thêm
    public Artwork createArtworkWithImage(Artwork artwork, MultipartFile imageFile) {
        try {
            // Upload ảnh lên Cloudinary
            String imageUrl = cloudinaryService.uploadFile(imageFile);

            // Set thông tin cho artwork
            artwork.setImageUrl(imageUrl);
            artwork.setCreatedAt(LocalDateTime.now());
            artwork.setUpdatedAt(LocalDateTime.now());

            return artworkRepository.save(artwork);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi tạo Artwork với ảnh: " + e.getMessage());
        }
    }
}
>>>>>>> Stashed changes
