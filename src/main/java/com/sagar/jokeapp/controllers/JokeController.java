package com.sagar.jokeapp.controllers;

import com.sagar.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by sagar on 03-10-2019
 */
@Controller
public class JokeController {
    private JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService=jokeService;
    }
    @RequestMapping({"/",""})
    public String ShowJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
