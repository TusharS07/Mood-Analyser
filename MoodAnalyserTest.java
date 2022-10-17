package com.bridgelabz.moodAnalyzerProblem;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    /*//TC1.1=Given “I am in Sad Mood” message Should Return SAD
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
    }*/


    //Repeat TC 1.1 = Given “I am in Sad Mood” message in Constructor Should Return SAD
    @Test
    public void checkWhenMessageSADThenShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }



    //Repeat TC 1.2 = Given “I am in Happy Mood” message in Constructor Should Return HAPPY

    @Test
    public void checkWhenMessageHAPPYThenShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }


    //UC = Handle Exception if User Provides Invalid Mood - Like NULL
    //TC-2.1 = Given Null Mood Should Return Happy

    @Test
    public void giveNUllMoodItShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }



}
