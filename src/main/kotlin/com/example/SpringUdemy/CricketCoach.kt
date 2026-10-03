package com.example.SpringUdemy

import org.springframework.stereotype.Component

@Component
open class CricketCoach : Coach {

    override fun getDailyWorkout(): String {
        return "Practice fast bowling for 15 minutes"
    }
}

