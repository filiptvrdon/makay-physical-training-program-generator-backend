package com.makay.TrainingProgramGenerator.Strength;

import com.makay.TrainingProgramGenerator.Abstract.TrainingProgram;
import com.makay.TrainingProgramGenerator.Abstract.TrainingProgramGenerator;

public class StrengthProgramGenerator extends TrainingProgramGenerator {
    public StrengthProgramGenerator(String primaryGoal) {
        super(primaryGoal);
    }
    public StrengthProgramGenerator() {
        super("strength");
    }


    public TrainingProgram generateProgram(int squat1RM, int deadlift1RM, int bench1RM, int pullupMaxReps, int bodyweight, String metrics) {

        return null;
    }
}
