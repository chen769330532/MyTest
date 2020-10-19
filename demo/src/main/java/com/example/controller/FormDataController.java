package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Chenjl
 * @date 2020/10/19 11:07
 */

@RestController
@RequestMapping("/formData")
public class FormDataController {


    //form-data
    @PostMapping("/test")
    public String formDataTest(HttpServletRequest httpServletRequest) {
        httpServletRequest.getParameter("map");
        String test="测试成功";
        return test;
    }
}
