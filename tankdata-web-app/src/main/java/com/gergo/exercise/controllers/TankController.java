package com.gergo.exercise.controllers;

import com.gergo.exercise.service.TankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tanks")
public class TankController {
    private final TankService tankService;

    public TankController(TankService tankService) {
        this.tankService = tankService;
    }

    @GetMapping
    public String getAllTanks(Model model){
        model.addAttribute("tanks", tankService.getAllTanks());
        return "tanks";
    }
}
