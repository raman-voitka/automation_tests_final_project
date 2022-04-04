package by.it_academy.homework9_final.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Objects;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnlinerSushiVeslaProduct {
    private int id;
    private String key;
    private String name;
    private String full_name;
    private String name_prefix;
}