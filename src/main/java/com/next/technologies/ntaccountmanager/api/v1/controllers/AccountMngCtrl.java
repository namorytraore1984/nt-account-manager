package com.next.technologies.ntaccountmanager.api.v1.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"service/account/management"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountMngCtrl {

    @GetMapping("/sante")
    public String sanityCheck() {
        return "Je suis demarré";
    }
}
