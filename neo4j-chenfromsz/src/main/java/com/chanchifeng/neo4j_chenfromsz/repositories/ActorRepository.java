package com.chanchifeng.neo4j_chenfromsz.repositories;

import com.chanchifeng.neo4j_chenfromsz.model.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends CrudRepository<Actor,Long> {
}
