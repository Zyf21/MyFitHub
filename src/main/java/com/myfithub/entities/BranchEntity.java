package com.myfithub.entities;

import java.io.Serializable;
import java.sql.Time;

public class BranchEntity implements Serializable {

    private  int id;
    private String adress;
    private Time beginning_of_work;
    private Time end_of_work;
    private  int fitness_clubs_id;

    public BranchEntity() {
        super();
    }

    public BranchEntity(int id, String adress, Time beginning_of_work, Time end_of_work, int fitness_clubs_id) {
        this.id = id;
        this.adress = adress;
        this.beginning_of_work = beginning_of_work;
        this.end_of_work = end_of_work;
        this.fitness_clubs_id = fitness_clubs_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Time getBeginning_of_work() {
        return beginning_of_work;
    }

    public void setBeginning_of_work(Time beginning_of_work) {
        this.beginning_of_work = beginning_of_work;
    }

    public Time getEnd_of_work() {
        return end_of_work;
    }

    public void setEnd_of_work(Time end_of_work) {
        this.end_of_work = end_of_work;
    }

    public int getFitness_clubs_id() {
        return fitness_clubs_id;
    }

    public void setFitness_clubs_id(int fitness_clubs_id) {
        this.fitness_clubs_id = fitness_clubs_id;
    }

    @Override
    public String toString() {
        return "BranchEntity{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", beginning_of_work=" + beginning_of_work +
                ", end_of_work=" + end_of_work +
                ", fitness_clubs_id=" + fitness_clubs_id +
                '}';
    }
}
