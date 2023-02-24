package com.stanslaus.countries.Services;

import com.stanslaus.countries.DTO.CountryResponseEntity;
import com.stanslaus.countries.DTO.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CapitalService {
    @Value("${url_country}")
    private String urlToFetch;
    public String fetchCapital (String country){
    try {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryResponseEntity> responseEntity = restTemplate.getForEntity(urlToFetch+country, CountryResponseEntity.class);
        System.out.println(responseEntity);
        Data capital = responseEntity.getBody().getData().get(0);
        return capital.getCapital();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    return null;

    }
}
