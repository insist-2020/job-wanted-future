package com.base.job.controller;

import com.base.job.model.Subjects;
import com.base.job.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping("selectSubjectAll")
    public List<Subjects> selectSubjectAll(){
        return subjectService.selectSubjectAll();
    }

    @RequestMapping("/openSubject")
    public String openSubject(){
        return "subject";
    }

    @GetMapping("/openDeleteSubject")
    public String openDeleteSubject(){
        return "";
    }

}
