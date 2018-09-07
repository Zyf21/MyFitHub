package com.myfithub.controllers;


import com.myfithub.entities.FitnessClubEntity;
import com.myfithub.mapper.FitnessClubMapper;
import com.myfithub.services.FitnessClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/clubs")
public class FitnessClubController {

   @Autowired
   private FitnessClubService fitnessClubService;



    @GetMapping
    public List<FitnessClubEntity> getFitnessClubs(){
        return fitnessClubService.getAll();
    }

    @GetMapping("/{id}")
    public FitnessClubEntity getFitnessClub (@PathVariable Long id) {
        return fitnessClubService.getOne(id);
    }

    @PostMapping()
    public Long save ( @RequestBody FitnessClubEntity fitnessClub){
      return   fitnessClubService.insert(fitnessClub);
    }

    @DeleteMapping("/{id}")
    public void  delete (@PathVariable Long id){
        fitnessClubService.delete(id);
    }

    @PutMapping("/{id}")
    public void update (FitnessClubEntity fitnessclab){
        fitnessClubService.update(fitnessclab);
    }



}
