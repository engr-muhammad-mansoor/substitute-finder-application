package com.example.subfinder.Controllers;

import com.example.subfinder.Models.GameModel;
import com.example.subfinder.Models.SubRequestInput;
import com.example.subfinder.Services.SubRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sub-finder-application")
public class SubRequestController {

    @Autowired
    private SubRequestService subRequestService;

    @PostMapping("/subRequest")
    public GameModel createSubRequest(@RequestBody SubRequestInput subRequestInput) {
        return subRequestService.createSubRequest(subRequestInput);
    }
}
