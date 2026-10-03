package com.example.SpringUdemy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    private lateinit var cricketCoach: CricketCoach

    @Autowired
    fun DemoController(cricketCoach: CricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/dailyworkout")
    fun getDailyWorkout(): String {
        return cricketCoach.getDailyWorkout()
    }
}