package com.example.spring_postgres;

import org.jspecify.annotations.Nullable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenarationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //this tell Hibernate to make a table out of this class (Similar to models in DJANGO)
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private @Nullable Integer id;
    private String name;
    private String email;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}


// Hibernate automatically translates the entity into a table.
//Hibernate is the default ORM for Springboot, similar to Django ORM.