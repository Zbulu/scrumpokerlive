package com.zbulu.scumpokerlive.backend.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zbulu.scumpokerlive.backend.model.Vote;

@RestController
@RequestMapping(value = "api/")
public class VoteRestServices {

    @RequestMapping(value = "vote", method = RequestMethod.GET)
    @ResponseBody
    public String getVote() {
        return "vote get method called ";
    }

    @RequestMapping(value = "vote", method = RequestMethod.POST)
    public String receiveVote(@RequestBody Vote vote) {
        return "vote accepted";
    }
}
