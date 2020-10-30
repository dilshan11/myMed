package com.example.MyMediBackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class HowToUse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String howCause;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name ="medicine_Id")
    @JsonBackReference
    private Medicine medicine;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public HowToUse() {
    }

    public HowToUse(String howCause) {
        this.howCause = howCause;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHowCause() {
        return howCause;
    }

    public void setHowCause(String howCause) {
        this.howCause = howCause;
    }

    @Override
    public String toString() {
        return "HowToUse{" +
                "id=" + id +
                ", howCause='" + howCause + '\'' +
                ", medicine=" + medicine +
                '}';
    }
}
