package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Entity.AuctionRoom;
import com.auctionaa.backend.Repository.ArtworkRepository;
import com.auctionaa.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;
<<<<<<< Updated upstream
import java.util.Optional;
=======
>>>>>>> Stashed changes

@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;
    private final CloudinaryService cloudinaryService; // service tự viết để upload

<<<<<<< Updated upstream
    public ArtworkService(ArtworkRepository artworkRepository, CloudinaryService cloudinaryService) {
=======
    @Autowired
    private UserRepository userRepository;

    public ArtworkService(ArtworkRepository artworkRepository) {
>>>>>>> Stashed changes
        this.artworkRepository = artworkRepository;
        this.cloudinaryService = cloudinaryService;
    }

    public List<Artwork> getFeaturedArtworks() {
        return artworkRepository.findTop6ByOrderByPriceDesc();
    }

    public List<Artwork> getAllArtwork() {
        return artworkRepository.findAll();
    }

    public List<Artwork> getByOwnerId(String ownerId) {
        return artworkRepository.findByOwner_Id(ownerId);
    }

    public Artwork saveArtwork(Artwork artwork) {
        artwork.setCreatedAt(LocalDateTime.now());
        artwork.setUpdatedAt(LocalDateTime.now());
        return artworkRepository.save(artwork);
    }

<<<<<<< Updated upstream
    // ✅ Hàm mới thêm
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
=======
    public List<Artwork> getArtworkById(String ownerId) {
        return artworkRepository.findByOwnerId(ownerId);
    }

    public List<AuctionRoom> getAuctionRoomsByUser(String userId) {
        return artworkRepository.findByUserId(userId);
>>>>>>> Stashed changes
    }
}
