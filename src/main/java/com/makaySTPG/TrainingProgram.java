package com.makaySTPG;

public class TrainingProgram {
    const int squat1rm;
    const int deadlift1rm;
    const int bench1rm;
    const int pullupMaxReps;
    const int bodyweight;
    const String metrics;
    const String programType;

    public TrainingProgram(int squat1rm, int deadlift1rm, int bench1rm, int pullupMaxReps, int bodyweight, String metrics) {
        this.squat1rm = squat1rm;
        this.deadlift1rm = deadlift1rm;
        this.bench1rm = bench1rm;
        this.pullupMaxReps = pullupMaxReps;
        this.bodyweight = bodyweight;
        this.metrics = metrics;
        this.programType = programType;
    }
}