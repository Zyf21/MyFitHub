package com.myfithub.controllers;


import com.myfithub.entities.FitnessClubEntity;
import com.myfithub.mapper.FitnessClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    }



}
