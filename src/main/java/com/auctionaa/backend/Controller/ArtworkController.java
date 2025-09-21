package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.Artwork;
import com.auctionaa.backend.Service.ArtworkService;
import com.auctionaa.backend.Service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ArtworkController {
    @Autowired
    private ArtworkService artworkService;

    @Autowired
    private CloudinaryService cloudinaryService;

    // Lấy danh sách 6 tác phẩm có giá cao nhất
    @GetMapping("/featured")
    public List<Artwork> getFeaturedArtworks() {
        return artworkService.getFeaturedArtworks();
    }

    // Lấy tất cả tác phẩm
    @GetMapping("/all")
    public List<Artwork> getAll() {
        return artworkService.getAllArtwork();
    }

    //Lấy tác phẩm theo id

    @GetMapping("/owner/{ownerid}")
    public List<Artwork> getArtworksByOwner(@PathVariable String ownerid) {
        return artworkService.getByOwnerId(ownerid);
    }
    // Upload ảnh và tạo Artwork
    // http://localhost:8081/upload Post
    @PostMapping("/upload")
    public Artwork uploadArtwork(
            @RequestParam("file") MultipartFile file,
            @RequestParam("title") String title,
            @RequestParam("description") String description,
            @RequestParam("price") double price
    ) throws IOException {

        // Upload ảnh lên Cloudinary
        String imageUrl = cloudinaryService.uploadFile(file);
<<<<<<< HEAD
//nhớ xóa dòng 52
=======

>>>>>>> origin/main
        // Tạo Artwork mới
        Artwork artwork = new Artwork();
        artwork.setTitle(title);
        artwork.setDescription(description);
        artwork.setPrice(price);
        artwork.setImageUrl(imageUrl);

        return artworkService.saveArtwork(artwork);
    }


<<<<<<< HEAD
}
=======
}

>>>>>>> origin/main
