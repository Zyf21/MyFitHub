package com.myfithub.services;


import com.myfithub.entities.FitnessClubEntity;
import com.myfithub.mapper.FitnessClubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class FitnessClubService {

    @Autowired
    public FitnessClubMapper fitnessClubMapper;


    public List<FitnessClubEntity> getAll() {
        return  fitnessClubMapper.getAll();
    }

    public FitnessClubEntity getOne(Long id) {
        return  fitnessClubMapper.getOne(id);
    }

    public Long insert(FitnessClubEntity fitnessClub) {

        fitnessClubMapper.insert(fitnessClub);
        return   fitnessClub.getId();

    }

    public void delete(Long id) {
        fitnessClubMapper.delete(id);
    }


    public void update(FitnessClubEntity fitnessclab) {
        fitnessClubMapper.update(fitnessclab);
    }
}
