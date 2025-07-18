package fr.doceo.artha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("appName", appName);
        return "contact";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("appName", appName);
        return "about";
    }

    @GetMapping("/help")
    public String help(Model model) {
        model.addAttribute("appName", appName);
        return "help";
    }
}
