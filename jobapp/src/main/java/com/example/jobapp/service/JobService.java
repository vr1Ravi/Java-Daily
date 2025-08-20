package com.example.jobapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobapp.model.JobPost;
import com.example.jobapp.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
    public JobPost jobPost(){
      return repo.getJobPost();
    }
}
