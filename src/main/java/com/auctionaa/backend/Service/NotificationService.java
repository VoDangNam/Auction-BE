package com.auctionaa.backend.Service;

import com.auctionaa.backend.Entity.Notification;
import com.auctionaa.backend.Repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {
    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getNotificationBy_OwnerId(String owner_id){
        return notificationRepository.findByUser_Id(owner_id);
    }

    public Notification addNotification(Notification notification){
        notification.setNotificationTime(LocalDateTime.now());
        return notificationRepository.save(notification);
    }

}
