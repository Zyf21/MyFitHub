package com.myfithub.controllers;


import com.myfithub.entities.BranchEntity;
import com.myfithub.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/clubs/{clubId}/branches")
public class BranchController {


    @Autowired
    private BranchService branchService;

    @GetMapping
    public List<BranchEntity> getBranchesByClub(@PathVariable Long clubId) {
        return branchService.getAllBranchesByClub(clubId);
    }

    @GetMapping("/{id}")
    public BranchEntity getBranch(@PathVariable Long id, @PathVariable Long clubId) {
        return branchService.getOne(id, clubId);
    }

    @PostMapping
    public Long save(@RequestBody BranchEntity branch, @PathVariable Long clubId) {
        branchService.insert(clubId, branch);
        return  branch.getId();
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Long id, @PathVariable Long clubId) {
        branchService.delete(id, clubId);
    }

    @PutMapping("/{id}")
    public void update( @RequestBody BranchEntity branch, @PathVariable Long clubId,@PathVariable Long id) {
        branchService.update(id, clubId, branch);

    }
}

