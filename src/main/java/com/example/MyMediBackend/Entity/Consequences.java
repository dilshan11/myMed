package com.example.MyMediBackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Consequences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String conseq;

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

    public Consequences() {
    }

    public Consequences(String conseq) {
        this.conseq = conseq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConseq() {
        return conseq;
    }

    public void setConseq(String conseq) {
        this.conseq = conseq;
    }

    @Override
    public String toString() {
        return "Consequences{" +
                "id=" + id +
                ", conseq='" + conseq + '\'' +
                ", medicine=" + medicine +
                '}';
    }
}

