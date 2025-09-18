package com.auctionaa.backend.Service;

import com.auctionaa.backend.DTO.Request.RegisterRequest;
import com.auctionaa.backend.Entity.User;
import com.auctionaa.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public String register(RegisterRequest request){
        if(!request.getPassword().equals(request.getConfirmPassword())){
            return "Mật khẩu không khớp";
        }

        if(userRepository.existsByEmail(request.getEmail())){
            return "Email đã tồn tại";
        }

        User user= new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());

        String encodedPassword = passwordEncoder.encode(request.getPassword());
        user.setPassword(encodedPassword);
        user.setPhonenumber(request.getPhone());

        userRepository.save(user);
        return "Đăng ký thành công";

    }
}
