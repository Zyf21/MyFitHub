package com.myfithub.mapper;

import com.myfithub.entities.FitnessClubEntity;

import java.util.List;

public interface FitnessClubMapper {

    List<FitnessClubEntity> getAll();

    FitnessClubEntity getOne(Long id);

    Long insert (FitnessClubEntity FitnessClub);

    void  delete(Long id);

    void  update (FitnessClubEntity FitnessClub);

}
