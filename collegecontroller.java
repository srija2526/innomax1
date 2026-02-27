package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.service.Collegeservice;

@RestController

public class Collegecontroller {
	
	@Autowired
    private Collegeservice cser;

    @PostMapping("/addcsvfile")
    // localhost:8080/url pattern --> addcollege
    public College addCollege(@RequestBody College csvfile) {
        return cser.addcollege(csvfile);
    }

    @GetMapping("/getcsvfile")
    public List<College> getCollege() {
        return cser.getCollege();
    }

    @DeleteMapping("/deletecid/{cid}")
    public void deleteCollege(@PathVariable Long cid) {
        cser.deleteCollege(cid);
    }



}
