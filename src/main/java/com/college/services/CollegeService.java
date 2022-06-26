package com.college.services;

import com.college.models.College;
import com.college.repositories.CollegeRepository;

public class CollegeService {
    private CollegeRepository collegeRepository;


    public Boolean updateCollegeName(College collegeWithUpdatedName){
        this.collegeRepository.save(collegeWithUpdatedName);
        return null;
    }

    public Boolean updateCollegeAddress(College collegeWithUpdatedAddress){
        this.collegeRepository.save(collegeWithUpdatedAddress);
        return null;
    }
}
