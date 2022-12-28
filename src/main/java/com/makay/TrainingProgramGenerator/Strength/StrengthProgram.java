package com.makay.TrainingProgramGenerator.Strength;

import com.makay.TrainingProgramGenerator.Abstract.TrainingProgram;

public class StrengthProgram extends TrainingProgram {
    public StrengthProgram(int squat1rm, int deadlift1rm, int bench1rm, int pullupMaxReps, int bodyweight, String metrics, String primaryGoal) {
        super(squat1rm, deadlift1rm, bench1rm, pullupMaxReps, bodyweight, metrics, primaryGoal);
    }

}