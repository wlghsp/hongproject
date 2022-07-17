package com.example.hongproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        String name = "Jiho";
        model.addAttribute("username", name);
        return "greetings"; // templates/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        String nickname = "지호네";
        model.addAttribute("nickname", nickname);
        return "goodbye";
    }
}