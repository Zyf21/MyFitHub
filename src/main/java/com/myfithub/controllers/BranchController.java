package com.myfithub.controllers;


import com.myfithub.entities.BranchEntity;
import com.myfithub.mapper.BranchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class BranchController {


    @Autowired
    private BranchMapper BranchMapper;

    @RequestMapping("/getBranches")
    public List<BranchEntity> getBranches() {
        List<BranchEntity> branches=BranchMapper.getAll();
        return branches;
    }

    @RequestMapping("/getBranch")
    public BranchEntity getBranch(Long id) {
        BranchEntity branch=BranchMapper.getOne(id);
        return branch;
    }

    @RequestMapping("/addBranch")
    public void save(BranchEntity branch) {
        BranchMapper.insert(branch);
    }
}

