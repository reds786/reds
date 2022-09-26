package com.ettas.reds.controller;

import com.ettas.reds.model.Student;
import com.ettas.reds.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return  studentService.getStudents();

    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);

    }

    @DeleteMapping(path = "{studentId}")
    public void removeStudent(@PathVariable("studentId") Long id) {

        studentService.removeStudent(id);

    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        studentService.updateStudent(studentId, name, email);
    }

}
