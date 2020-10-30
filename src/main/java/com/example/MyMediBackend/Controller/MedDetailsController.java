package com.example.MyMediBackend.Controller;

import com.example.MyMediBackend.Dao.MedDetailsDao;
import com.example.MyMediBackend.Entity.Medicine;
import com.example.MyMediBackend.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class MedDetailsController {

    //getAllDetails
    //getOneDetails
    //addDetails
    //updateDetails
    //deleteDetails

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/AllMedDetails/{pageId}")
    public List<Medicine> getAllDetails(@PathVariable int pageId){
        return this.medicineService.getAllMedicine(pageId);
    }

    @GetMapping("/MedDetails/{id}")
    public Medicine getOneDetails(@PathVariable int id){
        return this.medicineService.getMedicine(id);
    }

    @PostMapping("/admin/MedDetails")
    public Medicine addDetails(@RequestBody MedDetailsDao medDetailsDao){
        return this.medicineService.addMedicine(medDetailsDao);
    }

    @PutMapping("/admin/MedDetails")
    public Medicine updateDatails(@RequestBody MedDetailsDao medDetailsDao){
        return this.medicineService.updateMedicine(medDetailsDao);
    }
    @DeleteMapping("/admin/MedDetails/{id}")
    public Boolean deleteDetails(@PathVariable int id){
        return this.medicineService.deleteMedicine(id);
    }


    @GetMapping("/MedDetailsName/{name}/{pageId}")
    public List<Medicine> getMediNames(@PathVariable(name="name") String name, @PathVariable(name="pageId") int pageId){
        return this.medicineService.getMediNameAry(name,pageId);
    }


    @GetMapping("/OneMedDetails/{name}")
    public Medicine getOneMedFromName(@PathVariable String name){
//        System.out.println(5/0);
        return this.medicineService.getOneMedFromName(name);
    }
}
