package com.example.MyMediBackend.Service;

import com.example.MyMediBackend.Dao.MedDetailsDao;
import com.example.MyMediBackend.Entity.*;
import com.example.MyMediBackend.Repositery.MedicineRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {

    //getAllMedicine
    //getMedicine
    //addMedicine
    //updateMedicine
    //deleteMedicine

    @Autowired
    private MedicineRepositery medicineRepositery;

    public List<Medicine> getAllMedicine(int pageId) {
        Pageable sortedByName = PageRequest.of(pageId, 12, Sort.by("name"));

        List<Medicine> medicineList = this.medicineRepositery.findAll(sortedByName).toList();
        return medicineList;
    }

    public Medicine getMedicine(int id) {
        Optional<Medicine> optionalMedicine = this.medicineRepositery.findById(id);
        if (optionalMedicine.isPresent()) {
            Medicine medicine = optionalMedicine.get();
            return medicine;
        } else {
            Medicine medicine = new Medicine();
            return medicine;
        }

    }

    public Medicine addMedicine(MedDetailsDao medDetailsDao){


              Medicine tempMedicine=this.medicineRepositery.findByName(medDetailsDao.getMname());
              System.out.println(tempMedicine);
        if(tempMedicine==null) {
            Medicine medicine = new Medicine(medDetailsDao.getMname());

            for (String tag : medDetailsDao.getWhyMedFor()) {
                WhyThisMed whyThisMed = new WhyThisMed(tag);
                medicine.addWhyThisMed(whyThisMed);
            }

            for (String tag : medDetailsDao.getHowtouse()) {
                HowToUse howToUse = new HowToUse(tag);
                medicine.addHowToUse(howToUse);
            }

            for (String tag : medDetailsDao.getHowTosStore()) {
                HowToStore howToStore = new HowToStore(tag);
                medicine.addHowToStore(howToStore);
            }

            for (String tag : medDetailsDao.getConsequences()) {
                Consequences consequences = new Consequences(tag);
                medicine.addConsequences(consequences);
            }
            return this.medicineRepositery.save(medicine);
        }
        else{
            return null;
        }


    }

    public Medicine updateMedicine(MedDetailsDao medDetailsDao){

             this.deleteMedicine(medDetailsDao.getId());

           return this.addMedicine(medDetailsDao);

    }

    public boolean deleteMedicine(int id){
         this.medicineRepositery.deleteById(id);
         return true;
    }



    public List<Medicine> getMediNameAry(String name,int pageId){
        Pageable sortedByName = PageRequest.of(pageId, 10, Sort.by("name"));

        List<Medicine> medicineList=this.medicineRepositery.searchByMname(name,sortedByName).toList();

        return medicineList;
    }




    public Medicine getOneMedFromName(String name){

           return this.medicineRepositery.findByName(name);
    }

}