package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Repository.ArtworkRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;

>>>>>>> origin/main
@Service
public class ArtworkService {

    private final ArtworkRepository artworkRepository;
<<<<<<< HEAD

    private CloudinaryService cloudinaryService;

    public ArtworkService(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
=======
    private final CloudinaryService cloudinaryService; // service tự viết để upload

    public ArtworkService(ArtworkRepository artworkRepository, CloudinaryService cloudinaryService) {
        this.artworkRepository = artworkRepository;
        this.cloudinaryService = cloudinaryService;
>>>>>>> origin/main
    }

    public List<Artwork> getFeaturedArtworks() {
        return artworkRepository.findTop6ByOrderByPriceDesc();
    }

    public List<Artwork> getAllArtwork() {
        return artworkRepository.findAll();
    }

<<<<<<< HEAD
    public List<Artwork> getByOwnerId(String ownerId)
    {
        return artworkRepository.findByOwner_Id(ownerId);
    }

    //Chỉ đẩy test PostMan
=======
    public List<Artwork> getByOwnerId(String ownerId) {
        return artworkRepository.findByOwner_Id(ownerId);
    }

>>>>>>> origin/main
    public Artwork saveArtwork(Artwork artwork) {
        artwork.setCreatedAt(LocalDateTime.now());
        artwork.setUpdatedAt(LocalDateTime.now());
        return artworkRepository.save(artwork);
    }

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
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/main
