package com.example.sdatneo4.domain;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type="VALUES")
public class Value {
    @Id @GeneratedValue private Long relationshipid;
    @Property private Long amount;
    @StartNode private Person person;
    @EndNode private Item item;
}
