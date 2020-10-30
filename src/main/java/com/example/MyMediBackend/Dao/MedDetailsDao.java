package com.example.MyMediBackend.Dao;

import java.util.Arrays;

public class MedDetailsDao {
   private int id;
   private String mname;
   private String[] whyMedFor;
   private String[] howtouse;
   private String[] consequences;
   private String[] howTosStore;

   public MedDetailsDao() {
   }

   public MedDetailsDao(int id, String mname, String[] whyMedFor, String[] howtouse, String[] consequences, String[] howTosStore) {
      this.id = id;
      this.mname = mname;
      this.whyMedFor = whyMedFor;
      this.howtouse = howtouse;
      this.consequences = consequences;
      this.howTosStore = howTosStore;
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

   public String[] getWhyMedFor() {
      return whyMedFor;
   }

   public void setWhyMedFor(String[] whyMedFor) {
      this.whyMedFor = whyMedFor;
   }

   public String[] getHowtouse() {
      return howtouse;
   }

   public void setHowtouse(String[] howtouse) {
      this.howtouse = howtouse;
   }

   public String[] getConsequences() {
      return consequences;
   }

   public void setConsequences(String[] consequences) {
      this.consequences = consequences;
   }

   public String[] getHowTosStore() {
      return howTosStore;
   }

   public void setHowTosStore(String[] howTosStore) {
      this.howTosStore = howTosStore;
   }

   @Override
   public String toString() {
      return "MedDetailsDao{" +
              "id=" + id +
              ", mname='" + mname + '\'' +
              ", whyMedFor=" + Arrays.toString(whyMedFor) +
              ", howtouse=" + Arrays.toString(howtouse) +
              ", consequences=" + Arrays.toString(consequences) +
              ", howTosStore=" + Arrays.toString(howTosStore) +
              '}';
   }
}
