package com.example.jobapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobapp.service.JobService;
import com.example.jobapp.model.JobPost;


@RestController
public class JobRestController {
    
    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
   @GetMapping("jobPost")
    public JobPost getJobPosts(){
        return service.jobPost();
    }

}
