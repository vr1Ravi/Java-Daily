package com.example.springdatarest.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springdatarest.model.*;;

@Repository
public class JobRepo {
    
   
   List<JobPost> jobPosts = new ArrayList<>(
        Arrays.asList(
            new JobPost("Java Developer"),
            new JobPost("Frontend Engineer"),
            new JobPost("Data Analyst")
        )
    );
    
    public void addJob(JobPost jobPost){
        System.err.println("Added job post");
    }

    public List<JobPost> getAllJobs(){
        System.err.println("Retrurn job posts");

        return jobPosts;
    }
        public JobPost getJobPost(){
        System.err.println("Retrurn job post");

        return null;
    }
}
