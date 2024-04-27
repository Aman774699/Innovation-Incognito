package com.hackthon.innovationIncognito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Solvedstatus {
    @Id
    private Integer  Question_id;
    private Integer SolvedQustions;
    private Integer UnsolvedQustions;
    private Integer TotalQustions;
    @ManyToOne
    private User user;

    public Integer getQuestion_id() {
        return Question_id;
    }

    public void setQuestion_id(Integer question_id) {
        Question_id = question_id;
    }

    public Integer getSolvedQustions() {
        return SolvedQustions;
    }

    public void setSolvedQustions(Integer solvedQustions) {
        SolvedQustions = solvedQustions;
    }

    public Integer getUnsolvedQustions() {
        return UnsolvedQustions;
    }

    public void setUnsolvedQustions(Integer unsolvedQustions) {
        UnsolvedQustions = unsolvedQustions;
    }

    public Integer getTotalQustions() {
        return TotalQustions;
    }

    public void setTotalQustions(Integer totalQustions) {
        TotalQustions = totalQustions;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Solvedstatus(Integer question_id, Integer solvedQustions, Integer unsolvedQustions, Integer totalQustions, User user) {
        Question_id = question_id;
        SolvedQustions = solvedQustions;
        UnsolvedQustions = unsolvedQustions;
        TotalQustions = totalQustions;
        this.user = user;
    }

    public Solvedstatus() {
    }
}
