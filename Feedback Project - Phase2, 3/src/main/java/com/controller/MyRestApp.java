package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.MyRepo;
import com.entity.Feedback;
import com.service.AppService;

// Used to mark the class as a request handler -supports RESTful API
@RestController
public class MyRestApp {

    // Autowired allows automatic injection and resolving of beans/classes dependencies
    @Autowired
    private AppService appService;

    @Autowired
    private MyRepo newRepo;

    // Handles HTTP Post requests
    @PostMapping("/feedback")

    // Function for user feedbacks
    public String userFeedback(@RequestParam("customerName") String customerName, @RequestParam("customerEmail") String customerEmail, @RequestParam("country") String country, @RequestParam("productQuality") int productQuality, @RequestParam("serviceQuality") int serviceQuality, @RequestParam("orderAccuracy") int orderAccuracy, @RequestParam("valueForMoney") int valueForMoney, @RequestParam("timeliness") int timeliness, @RequestParam("customerSuggestions") String customerSuggestions) {

        // Creating object of Feedback entity
        Feedback f = new Feedback();

        f.setCustomerName(customerName);
        f.setCustomerEmail(customerEmail);
        f.setCountry(country);
        f.setProductQuality(productQuality);
        f.setServiceQuality(serviceQuality);
        f.setOrderAccuracy(orderAccuracy);
        f.setValueForMoney(valueForMoney);
        f.setCustomerSuggestions(customerSuggestions);
        f.setTimeliness(timeliness);
        try {
            // Save the user responses in feedback entity
            newRepo.save(f);
        } catch (Exception e) {
            return "Something went wrong !";
        }
        return "Thankyou !!";
    }

}