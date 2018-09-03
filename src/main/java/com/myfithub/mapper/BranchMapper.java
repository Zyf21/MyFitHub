package com.myfithub.mapper;


import com.myfithub.entities.BranchEntity;

import java.util.List;

public interface BranchMapper {


    List<BranchEntity> getAll();

    BranchEntity getOne(Long id);

    Long insert(BranchEntity branch);

    void delete(Long id);

    void update(BranchEntity branch);
}

