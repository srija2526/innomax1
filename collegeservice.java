package com.tns.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.project.entity.college;
import com.tns.project.repository.collgrepo;

@Service
public class collegeservice {

    @Autowired
    private collgrepo crepo;

    // inserting the data
    public college addcollege(college clg) {
        return crepo.save(clg);
    }

    // getting the data
    public List<college> getCollege() {
        return crepo.findAll();
    }

    // delete the data
    public void deleteCollege(Long cid) {
        crepo.deleteById(cid);
    }

    // update the data
    public college updateCollege(college clg) {

        long clgid = clg.getCid();
        college clg1 = crepo.findById(clgid).get();

        clg1.setCollegename(clg.getCollegename());
        clg1.setCollegeadmin(clg.getCollegeadmin());
        clg1.setLocation(clg.getLocation());

        return crepo.save(clg1);
    }
}
