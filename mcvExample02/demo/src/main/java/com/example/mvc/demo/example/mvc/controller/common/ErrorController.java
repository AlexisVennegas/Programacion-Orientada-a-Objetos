package com.example.mvc.demo.example.mvc.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/error")
public class ErrorController {

        // ErrorController
        @GetMapping
        public String error() {
            return "t_error";
        }



    }
