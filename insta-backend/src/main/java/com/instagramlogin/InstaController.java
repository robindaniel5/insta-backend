package com.instagramlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class InstaController {

    @Autowired
    private InstaService instaService;

    @PostMapping("/vote")
    public String vote(@RequestBody Entity entity) {
        instaService.saveVote(entity);
        return "Vote saved successfully";
    }
}
