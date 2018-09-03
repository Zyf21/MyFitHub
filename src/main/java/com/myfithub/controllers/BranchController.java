package com.myfithub.controllers;


import com.myfithub.entities.BranchEntity;
import com.myfithub.mapper.BranchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/branches")
public class BranchController {


    @Autowired
    private BranchMapper branchMapper;

    @GetMapping
    public List<BranchEntity> getBranches() {
        List<BranchEntity> branches=branchMapper.getAll();
        return branches;
    }

    @GetMapping("/{id}")
    public BranchEntity getBranch(@PathVariable Long id) {
        BranchEntity branch=branchMapper.getOne(id);
        return branch;
    }

    @PostMapping ()
    public Long save(BranchEntity branch) {
        branchMapper.insert(branch);
        return  branch.getId();
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Long id) {
        branchMapper.delete(id);
    }

    @PutMapping("/{id}")
    public void update(BranchEntity branch) {
        branchMapper.update(branch);

    }
}

