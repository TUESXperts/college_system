package com.college.repositories;

import com.college.models.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends CrudRepository<College, Long> {

}
