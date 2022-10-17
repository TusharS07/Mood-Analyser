package com.bridgelabz.moodAnalyzerProblem;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //TC1.1=Given “I am in Sad Mood” message Should Return SAD
    @Test
    public void checkIfMessageShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals(result,"SAD");
    }

    //TC1.2 = Given “I am in Any Mood” message Should Return HAPPY
    @Test
    public void checkIfMessageShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals(result,"HAPPY");
    }


}
