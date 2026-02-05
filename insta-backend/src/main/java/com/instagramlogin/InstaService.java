package com.instagramlogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstaService {

    @Autowired
    private InstaRepository instaRepository;

    public void saveVote(Entity entity) {
        instaRepository.save(entity);
    }
}
