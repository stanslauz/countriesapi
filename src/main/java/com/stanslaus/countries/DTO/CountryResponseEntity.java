package com.stanslaus.countries.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class CountryResponseEntity {

    private String page;
    private String total;
    private String total_pages;
    private List<Data> data;

}
