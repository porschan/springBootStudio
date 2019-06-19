package com.chanchifeng.neo4j.model;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@NodeEntity
public class Legend {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Legend() {
    }

    public Legend(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "'s fans => "
                + Optional.ofNullable(this.fans).orElse(
                Collections.emptySet()).stream()
                .map(Legend::getName)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Relationship(type = "FANS", direction = Relationship.UNDIRECTED)
    public Set<Legend> fans;

    public void fansWith(Legend legend) {
        if (fans == null) {
            fans = new HashSet<>();
        }
        fans.add(legend);
    }
}
