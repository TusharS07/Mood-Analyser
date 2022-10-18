package com.bridgelabz.moodAnalyzerProblem;

public class MoodAnalyser {


    private String message;

    //default constructor
    public MoodAnalyser() {

    }

    //parameterize constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTER_EMPTY,"Please enter valid Message...");

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTER_NULL,"Please enter valid Message...");
        }
    }
}
