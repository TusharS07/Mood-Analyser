package com.bridgelabz.moodAnalyzerProblem;

public class MoodAnalyser {


    private String message;

    //default constructor
    public MoodAnalyser(){

    }

    //parameterize constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood () {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }

    }

}
