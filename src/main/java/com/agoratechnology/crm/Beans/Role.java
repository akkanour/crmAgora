package com.agoratechnology.crm.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String libelle_role;
    private String description_role;

}
