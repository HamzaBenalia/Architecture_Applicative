package org.epsi.web_interface_flowerstore.controller;
import org.epsi.web_interface_flowerstore.clients.UserClient;
import org.epsi.web_interface_flowerstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserCotroller {



    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userClient.getAllUsers();
        model.addAttribute("users", users);
        return "user-detail";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Long id, Model model) {
        User user = userClient.getUserById(id);
        model.addAttribute("user", user);
        return "user-detail";
    }

    @GetMapping("/user/new")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/user")
    public String createUser(@ModelAttribute User user) {
        userClient.createOrUpdateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userClient.deleteUser(id);
        return "redirect:/users";
    }
}
