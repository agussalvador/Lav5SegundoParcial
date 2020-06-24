package com.utn.rest.service.integration;

import com.utn.rest.model.ClientCallsParcial;
import com.utn.rest.model.ClientView;
import com.utn.rest.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/pets/1";
    private static String urlParcial = "http://localhost:8080/Parcial/?phone={phone}";


    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }


    public  List<ClientCallsParcial> getCallsByPhone(String phone) {
        return rest.getForObject(urlParcial,List.class,phone);
    }

}
