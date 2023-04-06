package com.agoratechnology.crm.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id ;
    private String nom;
    private String prenom;
    private String email;
    private String gsm;
    private String username;
    private String password;

}
