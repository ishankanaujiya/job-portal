package com.job_portal.job_portal.controller;

import com.job_portal.job_portal.model.AddJob;
import com.job_portal.job_portal.model.ApplyJob;
import com.job_portal.job_portal.model.Frontend;
import com.job_portal.job_portal.model.Fullstack;
import com.job_portal.job_portal.service.ApplyJobService;
import com.job_portal.job_portal.service.FrontendService;
import com.job_portal.job_portal.service.FullstackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fullstackjob")
public class FullstackController
{
    @Autowired
    private FullstackService fullstackService ;

    @PostMapping("/add")
    public Fullstack addUser(@RequestBody Fullstack fullstack) {
        System.out.println("Written into the Database");
        return fullstackService.add(fullstack);
    }

    @GetMapping("/list")
    public List<Fullstack> getValue() {
        System.out.println("Written");
        return fullstackService.getAll();
    }
}
