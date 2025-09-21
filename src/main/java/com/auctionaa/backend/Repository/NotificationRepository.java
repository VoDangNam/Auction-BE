package com.auctionaa.backend.Repository;

import com.auctionaa.backend.Entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface NotificationRepository extends MongoRepository<Notification,String> {
    List<Notification>findByUser_Id(String ownerId);
}
