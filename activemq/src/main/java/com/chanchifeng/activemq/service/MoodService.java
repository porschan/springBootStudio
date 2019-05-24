package com.chanchifeng.activemq.service;

import com.chanchifeng.activemq.model.Mood;

public interface MoodService {
    Mood save(Mood ayMood);
    String asynSave(Mood mood);
}
