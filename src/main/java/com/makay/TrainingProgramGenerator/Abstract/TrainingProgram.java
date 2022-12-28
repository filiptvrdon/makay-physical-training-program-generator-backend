package com.makay.TrainingProgramGenerator.Abstract;

public class TrainingProgram {
    protected int squat1rm;
    protected int deadlift1rm;
    protected int bench1rm;
    protected int pullupMaxReps;
    protected int bodyweight;
    protected String metrics;
    protected String primaryGoal;

    public TrainingProgram(int squat1rm, int deadlift1rm, int bench1rm, int pullupMaxReps, int bodyweight, String metrics, String primaryGoal) {
        this.squat1rm = squat1rm;
        this.deadlift1rm = deadlift1rm;
        this.bench1rm = bench1rm;
        this.pullupMaxReps = pullupMaxReps;
        this.bodyweight = bodyweight;
        this.metrics = metrics;
        this.primaryGoal = primaryGoal;
    }


}