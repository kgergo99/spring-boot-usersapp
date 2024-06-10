package com.gergo.exercise.users_web_app.controllers;

import com.gergo.exercise.users_web_app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private static final List<User> users = new ArrayList<>();
    static {
        for (int i = 0; i<10; i++){
            users.add(new User(i+"th user", i+"th language", (100 + i) + "", i+"th bio", (i+0.3F) + "" ));
        }
//        List<User> users = List.of(
//                new User("Adeel Solangi", "Sindhi", "V59OF92YF627HFY0",
//                        "Donec lobortis eleifend condimentum. Cras dictum dolor lacinia lectus vehicula rutrum. Maecenas quis nisi nunc. Nam tristique feugiat est vitae mollis. Maecenas quis nisi nunc.",
//                        "6.1")
//                // Add more users if needed
//        );
    }

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("users", users);
        return "users";
    }
}
