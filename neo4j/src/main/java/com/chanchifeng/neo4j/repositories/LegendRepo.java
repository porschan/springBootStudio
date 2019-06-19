package com.chanchifeng.neo4j.repositories;

import com.chanchifeng.neo4j.model.Legend;
import org.springframework.data.repository.CrudRepository;

public interface LegendRepo extends CrudRepository<Legend, Long> {
    Legend findByName(String name);
}
