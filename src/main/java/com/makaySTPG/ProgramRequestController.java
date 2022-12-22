package com.makaySTPG;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProgramRequestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // @GetMapping("/processInput/{squat}/{deadlift}/{bench}/{pullup}")
    @GetMapping("/STPG/{squat}/{deadlift}/{bench}/{pullup}/{bodyweight}/{metrics}/{programType}")

    public TrainingProgram getTrainingProgram(
            @PathVariable long squat1RM,
            @PathVariable long deadlift1RM,
            @PathVariable long bench1RM,
            @PathVariable long pullupMaxReps,
            @PathVariable long bodyweight,
            @PathVariable String metrics
            @PathVariable String programType) {

        TrainingProgram trainingProgram = new TrainingProgram(squat1RM, deadlift1RM, bench1RM, pullupMaxReps, bodyweight, metrics, programType);
        trainingProgram.



    }
}