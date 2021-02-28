package com.chebnevdev.iprogr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CallingCardController {

    @GetMapping("/callingcard")
    public String callingCardPage(
            @RequestParam(name = "name", required = false, defaultValue = "Василий") String name,
            @RequestParam(name = "surname", required = false, defaultValue = "Пупкин") String surname,
            @RequestParam(name = "email", required = false, defaultValue = "vaspupkin@rea.ru") String email,
            @RequestParam(name = "telephone", required = false, defaultValue = "8-800-555-35-35") String telephone,
            @RequestParam(name = "lines", required = false, defaultValue = "6") int lines,
            @RequestParam(name = "columns", required = false, defaultValue = "3") int columns,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("email", email);
        model.addAttribute("telephone", telephone);
        model.addAttribute("lines", lines);
        model.addAttribute("columns", columns);

        return "callingcard";
    }
}
