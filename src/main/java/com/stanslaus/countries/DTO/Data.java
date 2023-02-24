package com.stanslaus.countries.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class Data {

    private String capital;
}
