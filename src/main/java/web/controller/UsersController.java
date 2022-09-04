package web.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UserService service;

    @Autowired
    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping("")
    public String showAllUsers(Model model) {
        model.addAttribute("users", service.listUsers());
        return "users";
    }

    @GetMapping("/new")
    public String createUser(@ModelAttribute("user") User user) {
        return "addUser";
    }

    @PostMapping()
    public String addUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "addUser";


        service.save(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", service.userById(id));
        return "editUser";
    }

    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, @PathVariable("id") Long id) {
        if (bindingResult.hasErrors())
            return "editUser";


        service.update(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/users";
    }


}
