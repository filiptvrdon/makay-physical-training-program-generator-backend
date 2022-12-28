package com.makay.TrainingProgramGenerator.Abstract;

import com.makay.TrainingProgramGenerator.Strength.StrengthProgram;
import com.makay.TrainingProgramGenerator.Strength.StrengthProgramGenerator;

public class TrainingProgramGenerator {
    String primaryGoal;

    public TrainingProgramGenerator(String primaryGoal) {
        this.primaryGoal = primaryGoal;
    }

    public static TrainingProgramGenerator getTrainingProgramGenerator(String primaryGoal){
        if ("strength".equals(primaryGoal)) {
            return new StrengthProgramGenerator();
        }
        return null;
    }

    public TrainingProgram generateProgram (int squat1RM, int deadlift1RM, int bench1RM, int pullupMaxReps, int bodyweight, String metrics){


        return null;
    }

}
