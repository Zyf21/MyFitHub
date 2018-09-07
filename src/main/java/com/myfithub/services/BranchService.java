package com.myfithub.services;


import com.myfithub.entities.BranchEntity;
import com.myfithub.mapper.BranchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BranchService {

    @Autowired
    public BranchMapper branchMapper;

    public List<BranchEntity> getAllBranchesByClub(Long clubId) {
        return branchMapper.getAllBranchesByClub(clubId);
    }

    public BranchEntity getOne(Long id, Long clubId) {

        return  branchMapper.getByIdAndClubId(id,clubId);
    }

    public Long insert(Long clubId, BranchEntity branch) {
        branch.setFitnessClubsId(clubId);
        branchMapper.insert(branch);
        return branch.getId();
    }

    public void delete(Long id, Long clubId) {

         branchMapper.deleteByIdAndClubId(id,clubId);
    }

    public void update(Long id, Long clubId, BranchEntity branch) {
        branch.setId(id);
        branch.setFitnessClubsId(clubId);
        branchMapper.updateByIdAndClubId(branch);
    }
}
