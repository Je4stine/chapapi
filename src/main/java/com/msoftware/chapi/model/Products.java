package com.msoftware.chapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @Id
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal Price;
    private String category;
    private boolean availability;
    private Date releaseDate;
}
