package com.service;
import org.springframework.stereotype.Service;
import com.dao.MyRepo;
import com.entity.Feedback;

@Service
public class AppService {

    private MyRepo myRepo;
    public boolean userFeedback(Feedback f) {

        // Saves the feedbacks in the database
        myRepo.save(f);
        return true;
    }

}