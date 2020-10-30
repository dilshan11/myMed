package com.example.MyMediBackend.Dao;

import com.example.MyMediBackend.Entity.Consequences;
import com.example.MyMediBackend.Entity.HowToStore;
import com.example.MyMediBackend.Entity.HowToUse;
import com.example.MyMediBackend.Entity.WhyThisMed;

import java.util.List;

public class FullMedDetailsDao {

    private int id;
    private String mname;
    private  List<WhyThisMed> whyMedFor;
    private  List<HowToUse> howtouse;
    private  List<Consequences> consequences;
    private List<HowToStore> howTosStoreList;

    public FullMedDetailsDao() {
    }

    public FullMedDetailsDao(int id, String mname, List<WhyThisMed> whyMedFor, List<HowToUse> howtouse, List<Consequences> consequences, List<HowToStore> howTosStoreList) {
        this.id = id;
        this.mname = mname;
        this.whyMedFor = whyMedFor;
        this.howtouse = howtouse;
        this.consequences = consequences;
        this.howTosStoreList = howTosStoreList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public List<WhyThisMed> getWhyMedFor() {
        return whyMedFor;
    }

    public void setWhyMedFor(List<WhyThisMed> whyMedFor) {
        this.whyMedFor = whyMedFor;
    }

    public List<HowToUse> getHowtouse() {
        return howtouse;
    }

    public void setHowtouse(List<HowToUse> howtouse) {
        this.howtouse = howtouse;
    }

    public List<Consequences> getConsequences() {
        return consequences;
    }

    public void setConsequences(List<Consequences> consequences) {
        this.consequences = consequences;
    }

    public List<HowToStore> getHowTosStoreList() {
        return howTosStoreList;
    }

    public void setHowTosStoreList(List<HowToStore> howTosStoreList) {
        this.howTosStoreList = howTosStoreList;
    }
}
