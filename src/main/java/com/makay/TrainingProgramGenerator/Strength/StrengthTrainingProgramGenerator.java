package com.makay.TrainingProgramGenerator.Strength;

import com.makay.TrainingProgramGenerator.TrainingProgram;
import com.makay.TrainingProgramGenerator.TrainingProgramGenerator;

public class StrengthTrainingProgramGenerator extends TrainingProgram implements TrainingProgramGenerator {

    public StrengthTrainingProgramGenerator(int squat1rm, int deadlift1rm, int bench1rm, int pullupMaxReps, int bodyweight, String metrics, String programType) {
        super(squat1rm, deadlift1rm, bench1rm, pullupMaxReps, bodyweight, metrics, programType);
    }

    @Override
    public void generateProgram() {

    }
}