package com.utn.rest.service;

import com.utn.rest.model.ClientCallsParcial;
import com.utn.rest.model.ClientView;
import com.utn.rest.model.Pet;
import com.utn.rest.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;


    public List<ClientCallsParcial> getCallsByPhone(String phone) {
        return integrationComponent.getCallsByPhone(phone);
    }
}
