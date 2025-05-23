package com.cpdias.oauth2.backend.autenticacao;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateController {

    @GetMapping("/messages")
    public String privateMessages(Model model, @AuthenticationPrincipal OAuth2User principal) {
        model.addAttribute("body", principal.getAttribute("name"));

        return "autenticacao/response";
    }
}
