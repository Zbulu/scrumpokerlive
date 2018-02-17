package com.zbulu.scumpokerlive.backend.services;

import org.springframework.stereotype.Service;

import com.zbulu.scumpokerlive.backend.model.Vote;

@Service
public interface VotingService {

    public void registerVote(Vote vote);
}
