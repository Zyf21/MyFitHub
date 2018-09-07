package com.myfithub.entities;

import java.io.Serializable;
import java.sql.Time;

public class BranchEntity implements Serializable {

    private Long id;
    private  String adress;
    private Time beginningOfWork;
    private Time endOfWork;
    private Long fitnessClubsId;

    public BranchEntity() {
        super();
    }

    public BranchEntity(Long id, String adress, Time beginningOfWork, Time endOfWork, Long fitnessClubsId) {
        this.id = id;
        this.adress = adress;
        this.beginningOfWork = beginningOfWork;
        this.endOfWork = endOfWork;
        this.fitnessClubsId = fitnessClubsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Time getBeginningOfWork() {
        return beginningOfWork;
    }

    public void setBeginningOfWork(Time beginningOfWork) {
        this.beginningOfWork = beginningOfWork;
    }

    public Time getEndOfWork() {
        return endOfWork;
    }

    public void setEndOfWork(Time endOfWork) {
        this.endOfWork = endOfWork;
    }

    public Long getFitnessClubsId() {
        return fitnessClubsId;
    }

    public void setFitnessClubsId(Long fitnessClubsId) {
        this.fitnessClubsId = fitnessClubsId;
    }

    @Override
    public String toString() {
        return "BranchEntity{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", beginningOfWork=" + beginningOfWork +
                ", endOfWork=" + endOfWork +
                ", fitnessClubsId=" + fitnessClubsId +
                '}';
    }
}
