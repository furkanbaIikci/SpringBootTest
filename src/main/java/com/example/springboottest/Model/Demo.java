package com.example.springboottest.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_DEMO")
@Data
public class Demo {

    @Id
    private String id;

    @Column(name = "val")
    private String value;
}