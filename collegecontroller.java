package com.tns.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tns.project.entity.college;
import com.tns.project.service.collegeservice;

@RestController
public class collegecontroller {

    @Autowired
    private collegeservice cser;

    @PostMapping("/addcollege")
    // localhost:8080/url pattern --> addcollege
    public college addCollege(@RequestBody college clg) {
        return cser.addcollege(clg);
    }

    @GetMapping("/getcollege")
    public List<college> getCollege() {
        return cser.getCollege();
    }

    @DeleteMapping("/deletecid/{cid}")
    public void deleteCollege(@PathVariable Long cid) {
        cser.deleteCollege(cid);
    }

    @PutMapping("/updatecollege")
    public void updateCollege(@RequestBody college clg) {
        cser.updateCollege(clg);
    }
}
