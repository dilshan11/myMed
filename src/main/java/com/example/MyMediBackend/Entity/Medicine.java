package com.example.MyMediBackend.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "medicine",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<WhyThisMed> whyThisMedList;

    @OneToMany(mappedBy = "medicine",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<HowToUse> howToUseList;

    @OneToMany(mappedBy = "medicine",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Consequences> consequencesList;

    @OneToMany(mappedBy = "medicine",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<HowToStore> howToStoreList;

    public Medicine() {
    }

    public Medicine(String name) {
        this.name = name;
    }

    public Medicine(String name, List<WhyThisMed> whyThisMedList, List<HowToUse> howToUseList, List<Consequences> consequencesList, List<HowToStore> howToStoreList) {
        this.name = name;
        this.whyThisMedList = whyThisMedList;
        this.howToUseList = howToUseList;
        this.consequencesList = consequencesList;
        this.howToStoreList = howToStoreList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WhyThisMed> getWhyThisMedList() {
        return whyThisMedList;
    }

    public void setWhyThisMedList(List<WhyThisMed> whyThisMedList) {
        this.whyThisMedList = whyThisMedList;
    }

    public List<HowToUse> getHowToUseList() {
        return howToUseList;
    }

    public void setHowToUseList(List<HowToUse> howToUseList) {
        this.howToUseList = howToUseList;
    }

    public List<Consequences> getConsequencesList() {
        return consequencesList;
    }

    public void setConsequencesList(List<Consequences> consequencesList) {
        this.consequencesList = consequencesList;
    }

    public List<HowToStore> getHowToStoreList() {
        return howToStoreList;
    }

    public void setHowToStoreList(List<HowToStore> howToStoreList) {
        this.howToStoreList = howToStoreList;
    }

    public void addWhyThisMed(WhyThisMed tempwhyThisMed){
        if(this.whyThisMedList==null){
            this.whyThisMedList=new ArrayList<>();
        }
        this.whyThisMedList.add(tempwhyThisMed);
        tempwhyThisMed.setMedicine(this);
    }

    public void addHowToUse(HowToUse tempHowToUse){
        if(this.howToUseList==null){
            this.howToUseList=new ArrayList<>();
        }
        this.howToUseList.add(tempHowToUse);
        tempHowToUse.setMedicine(this);
    }

    public void addHowToStore(HowToStore tempHowToStore){
        if(this.howToStoreList==null){
            this.howToStoreList=new ArrayList<>();
        }
        this.howToStoreList.add(tempHowToStore);
        tempHowToStore.setMedicine(this);
    }

    public void addConsequences(Consequences tempConsequences){
        if(this.consequencesList==null){
            this.consequencesList=new ArrayList<>();
        }
        this.consequencesList.add(tempConsequences);
        tempConsequences.setMedicine(this);
    }


}
