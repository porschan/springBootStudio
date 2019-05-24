package com.chanchifeng.activemq.repository;

import com.chanchifeng.activemq.model.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author:porschan
 * @description:
 * @date: Created in 13:15 2019/3/4
 * @modified By:
 */

public interface MoodRepository extends JpaRepository<Mood,String> {
}
