package com.makay.TrainingProgramGenerator;

import org.springframework.web.bind.annotation.*;

@RestController
public class APIRequestController {
    @GetMapping("/hello/{name}")
    public void hello(
            @PathVariable String name
    ) {
        System.out.println("hello " + (!(name.isEmpty()) ? name : "motherfucker") + "!");
    }
    @GetMapping("/trainingProgramGenerator/{squat1RM}/{deadlift1RM}/{bench1RM}/{pullupMaxReps}/{bodyweight}/{metrics}/{primaryGoal}/")
    public String test (
            @PathVariable int squat1RM,
            @PathVariable int deadlift1RM,
            @PathVariable int bench1RM,
            @PathVariable int pullupMaxReps,
            @PathVariable int bodyweight,
            @PathVariable String metrics,
            @PathVariable String primaryGoal

    ){
        TrainingProgram trainingProgram = new TrainingProgram(squat1RM, deadlift1RM, bench1RM, pullupMaxReps,
                bodyweight, metrics, primaryGoal);
        System.out.println(trainingProgram);

        String result = " TRAINING PROGRAM GENERATOR FOR squat: " + squat1RM + ", deadlift: " + deadlift1RM  + ", bench: " + bench1RM + ", pullup max: " + pullupMaxReps + ", bodyweight: " + bodyweight + ", using " + metrics + " with primary goal being " + primaryGoal;
        System.out.println(result);




        return result;
    }

}