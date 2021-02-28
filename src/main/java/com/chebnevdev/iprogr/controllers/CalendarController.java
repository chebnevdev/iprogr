package com.chebnevdev.iprogr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class CalendarController {

    @GetMapping("/calendar")
    public String calendar(
            Model model,
            @RequestParam(name = "year", required = false) Integer year
    ) {
        year = year == null ? LocalDate.now().getYear() : year;
        model.addAttribute("year", year);
        return "calendar";
    }

    @GetMapping("/now")
    public String now() {
        return "now";
    }
}
