package com.chanchifeng.neo4j_chenfromsz.repositories;

import com.chanchifeng.neo4j_chenfromsz.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {

    Movie findByTitle(@Param("title") String title);

}
