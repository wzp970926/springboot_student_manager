package com.qf.controller;

import com.qf.Service.StuService;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author wzp
 * @Date 2019/9/25
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Autowired
    private StuService stuService;

//    学生列表的展示
    @RequestMapping("/list")
    public  String list(Model model){
        List<Student> list=stuService.list();
        model.addAttribute("students",list);
        return "stulist";
    }
//    删除学生
    @RequestMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        stuService.removeById(id);
        return "redirect:/stu/list";
    }
}
