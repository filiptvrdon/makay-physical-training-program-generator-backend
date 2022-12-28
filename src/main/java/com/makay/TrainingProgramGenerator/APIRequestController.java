package com.makay.TrainingProgramGenerator;

import com.makay.TrainingProgramGenerator.Abstract.TrainingProgram;
import com.makay.TrainingProgramGenerator.Abstract.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class APIRequestController {

    @GetMapping("/trainingProgramGenerator/{squat1RM}/{deadlift1RM}/{bench1RM}/{pullupMaxReps}/{bodyweight}/{metrics}/{primaryGoal}/")
    // e.g.  http://localhost:8080/trainingProgramGenerator/185/200/120/15/86/kg/strength/

    // TODO: change return type to TrainingProgram
    public String buildTrainingProgram (@PathVariable int squat1RM, @PathVariable int deadlift1RM, @PathVariable int bench1RM, @PathVariable int pullupMaxReps, @PathVariable int bodyweight, @PathVariable String metrics, @PathVariable String primaryGoal) {
        String result;

        // get specific generator based on goals //
        TrainingProgramGenerator trainingProgramGenerator =  TrainingProgramGenerator.getTrainingProgramGenerator(primaryGoal);
        assert trainingProgramGenerator != null : "Invalid training program generator type!";

        // resulting training program is a simple data structure - no need for specific classes for different goals //
        // from now on, all logic is encapsulated in the trainingProgamGenerator class which will return a final program to be send to frontend //

        // TODO: decide what format will be used to deliver the program to the user (plain text, later html/pdf?) //

        TrainingProgram resultStrengthTrainingProgram = trainingProgramGenerator.generateProgram(squat1RM, deadlift1RM, bench1RM, pullupMaxReps, bodyweight, metrics);

        // TODO: make sure to send the actual program :)
        result = " TRAINING PROGRAM GENERATOR FOR squat: " + squat1RM + ", deadlift: " + deadlift1RM  + ", bench: " + bench1RM + ", pullup max: " + pullupMaxReps + ", bodyweight: " + bodyweight + ", using " + metrics + " with primary goal being " + primaryGoal;
        return result;
    }

}