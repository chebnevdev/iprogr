package com.chebnevdev.iprogr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextFormattingController {

    @GetMapping("/text-formatting")
    public String textFormat() {
        return "text-formatting";
    }
}
