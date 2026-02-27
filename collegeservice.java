package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.Collgrepo;

@Service

public class Collegeservice {
	
	
	@Autowired
    private Collgrepo crepo;

    // inserting the data
    public College addcollege(College csvfile) {
        return crepo.save(csvfile);
    }

    // getting the data
    public List<College> getCollege() {
        return crepo.findAll();
    }

    // delete the data
    public void deleteCollege(Long cid) {
        crepo.deleteById(cid);
    }


}
