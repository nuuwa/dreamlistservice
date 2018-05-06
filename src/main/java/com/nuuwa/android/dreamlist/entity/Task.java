package com.nuuwa.android.dreamlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
/*    private Date date;
    private boolean solved;
    private String suspect;*/

    protected Task() {
    }

    public Task(Long id, String title/*, Date date, String suspect*/) {
        this.id = id;
        this.title = title;
/*        this.date = date;
        this.suspect = suspect;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }*/

    @Override
    public String toString() {
        return String.format("Task[id='%s', title='%s']", id, title);
    }
}
