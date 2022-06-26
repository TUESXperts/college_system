package com.college.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departments")
public class Department {
    private Long id;
    private College college;
    private Teacher departmentChair;
    private List<Course> courses;
    private List<Teacher> teachers;
    private Faculty faculty;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @OneToOne
    @JoinColumn(name="department_chair")
    public Teacher getDepartmentChair() {
        return departmentChair;
    }

    public void setDepartmentChair(Teacher departmentChair) {
        this.departmentChair = departmentChair;
    }

    @OneToMany(mappedBy = "department")
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @OneToMany(mappedBy = "department")
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @ManyToOne
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
