package com.makay.TrainingProgramGenerator;

public class TrainingProgram {
    private int squat1rm;
    private int deadlift1rm;
    private int bench1rm;
    private int pullupMaxReps;
    private int bodyweight;
    private String metrics;

    public TrainingProgram(int squat1rm, int deadlift1rm, int bench1rm, int pullupMaxReps, int bodyweight, String metrics) {
        this.squat1rm = squat1rm;
        this.deadlift1rm = deadlift1rm;
        this.bench1rm = bench1rm;
        this.pullupMaxReps = pullupMaxReps;
        this.bodyweight = bodyweight;
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "squat1rm=" + squat1rm +
                ", deadlift1rm=" + deadlift1rm +
                ", bench1rm=" + bench1rm +
                ", pullupMaxReps=" + pullupMaxReps +
                ", bodyweight=" + bodyweight +
                ", metrics='" + metrics + '\'' +
                '}';
    }
}