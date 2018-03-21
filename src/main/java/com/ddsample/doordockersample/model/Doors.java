package com.ddsample.doordockersample.model;


import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.NoArgGenerator;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Doors {

    private static final NoArgGenerator GENERATOR = Generators.randomBasedGenerator();

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "door_id", columnDefinition = "BYTES(16)")
    private UUID door_id;

    @Column
    private String name;

    public UUID getDoor_id() {
        return door_id;
    }

    public void setDoor_id(UUID door_id) {
        this.door_id = door_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doors(String name) {
        super();
        this.name = name;
    }

    public Doors(){}



}
