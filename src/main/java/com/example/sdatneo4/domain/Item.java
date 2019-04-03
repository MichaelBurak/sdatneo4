package com.example.sdatneo4.domain;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Item {

    private Long id;
    private String name;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
