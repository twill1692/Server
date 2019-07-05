package com.app.player;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class PlayerEntity {

    @Column(name = "FIRST_NAME")
    private String fName;
    @Column(name = "LAST_NAME")
    private String lName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private int id;

    public PlayerEntity(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public PlayerEntity() {
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getFName() {
        return this.fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}