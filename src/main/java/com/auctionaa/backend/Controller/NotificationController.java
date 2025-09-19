package com.auctionaa.backend.Controller;

import com.auctionaa.backend.Entity.Notification;
import com.auctionaa.backend.Service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notification")
@CrossOrigin(origins = "http://localhost:5173")
public class NotificationController {
    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @GetMapping("/{id}")
    public List<Notification> getNotificationById(@PathVariable String id){
        return notificationService.getNotificationBy_OwnerId(id);
    }

    @PostMapping("/addNotification")
    public Notification creatNotification(@RequestBody Notification notification){
        return notificationService.addNotification(notification);
    }
//http://localhost:8081/api/notification/u001
    //http://localhost:8081/api/notification/addNotification
}
