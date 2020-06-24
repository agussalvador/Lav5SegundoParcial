package com.utn.rest.controller;


import com.utn.rest.model.ClientCallsParcial;

import com.utn.rest.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IntegrationService integrationService;

    @GetMapping("/")
    public List<ClientCallsParcial> getCallsByPhone(@RequestParam String phone) {
        return integrationService.getCallsByPhone(phone);
    }

}
