package com.cpdias.oauth2.backend.autenticacao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicController {

    @GetMapping("/public/messages")
    public String publicMessage(Model model) {
        model.addAttribute("body", "nobody");

        return "autenticacao/index";
    }
}
