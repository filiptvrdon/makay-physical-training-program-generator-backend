package com.makay.TrainingProgramGenerator;

import com.makay.TrainingProgramGenerator.Strength.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIRequestController {

    @GetMapping("/trainingProgramGenerator/{squat1RM}/{deadlift1RM}/{bench1RM}/{pullupMaxReps}/{bodyweight}/{metrics}/{primaryGoal}/")
    // e.g.  http://localhost:8080/trainingProgramGenerator/185/200/120/15/86/kg/strength/

    public String generateTrainingProgram (@PathVariable int squat1RM, @PathVariable int deadlift1RM, @PathVariable int bench1RM, @PathVariable int pullupMaxReps, @PathVariable int bodyweight, @PathVariable String metrics, @PathVariable String primaryGoal){
        String result;

        if ("strength".equals(primaryGoal)) {
            StrengthTrainingProgramGenerator strengthTrainingProgramGenerator = new StrengthTrainingProgramGenerator(squat1RM, deadlift1RM, bench1RM, pullupMaxReps, bodyweight, metrics);
            strengthTrainingProgramGenerator.generateTrainingProgram();


            result = " TRAINING PROGRAM GENERATOR FOR squat: " + squat1RM + ", deadlift: " + deadlift1RM  + ", bench: " + bench1RM + ", pullup max: " + pullupMaxReps + ", bodyweight: " + bodyweight + ", using " + metrics + " with primary goal being " + primaryGoal;
        } else {
            result =  "Sorry, no other program types are currently available :(";
        }

        System.out.println(result);
        return result;
    }

}