package com.stanslaus.countries.Controllers;


import com.stanslaus.countries.Services.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CapitalService capitalService;

    @GetMapping("/{country}")
public ResponseEntity<String> getCapital(@PathVariable String country){

        if(capitalService.fetchCapital(country)!= null){
            return new ResponseEntity<>(capitalService.fetchCapital(country), HttpStatusCode.valueOf(200));

        }

        return new ResponseEntity<>("Invalid request", HttpStatusCode.valueOf(403));
    }
}
