package com.myfithub.controllers;


import com.myfithub.entities.FitnessClubEntity;
import com.myfithub.mapper.FitnessClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/fitnessClubs")
public class FitnessClubController {

    @Autowired
    public FitnessClubMapper fitnessClubMapper;

    @GetMapping
    public List<FitnessClubEntity> getFitnessClubs(){
        List<FitnessClubEntity> fitnessClubs = fitnessClubMapper.getAll();
        return fitnessClubs;
    }

    @GetMapping("/{id}")
    public FitnessClubEntity getFitnessClub (@PathVariable Long id) {
        FitnessClubEntity fitnessClub=fitnessClubMapper.getOne(id);
        return fitnessClub;
    }

    @PostMapping()
    public Long save ( @RequestBody FitnessClubEntity fitnessClub){
        fitnessClubMapper.insert(fitnessClub);
        return fitnessClub.getId();
    }

    @DeleteMapping("/{id}")
    public void  delete (@PathVariable Long id){
        fitnessClubMapper.delete(id);
    }

    @PutMapping("/{id}")
    public void update (FitnessClubEntity fitnessclab){
        fitnessClubMapper.update(fitnessclab);
    }



}
