package com.example.MyMediBackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class HowToStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String storeCause;

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

    public HowToStore() {
    }

    public HowToStore(String storeCause) {
        this.storeCause = storeCause;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreCause() {
        return storeCause;
    }

    public void setStoreCause(String storeCause) {
        this.storeCause = storeCause;
    }

    @Override
    public String toString() {
        return "HowToStore{" +
                "id=" + id +
                ", storeCause='" + storeCause + '\'' +
                ", medicine=" + medicine +
                '}';
    }
}
