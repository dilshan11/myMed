package com.example.MyMediBackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class WhyThisMed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String whyCause;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name ="medicine_Id")
    @JsonBackReference
    private Medicine medicine;

    public WhyThisMed() {
    }

    public WhyThisMed(String whyCause) {
        this.whyCause = whyCause;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhyCause() {
        return whyCause;
    }

    public void setWhyCause(String whyCause) {
        this.whyCause = whyCause;
    }


}
