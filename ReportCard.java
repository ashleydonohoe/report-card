package com.example.android.miwok;

/**
 * Created by ashleydonohoe on 7/7/17.
 */

public class ReportCard {
    // Private variables
    private String mStudentName;
    private int mMathGrade;
    private int mEnglishGrade;
    private int mScienceGrade;
    private int mHistoryGrade;
    private int mArtGrade;

    // Constructor
    public ReportCard(String studentName, int mathGrade, int englishGrade, int scienceGrade, int historyGrade, int artGrade) {
        mStudentName = studentName;
        mMathGrade = mathGrade;
        mEnglishGrade = englishGrade;
        mScienceGrade = scienceGrade;
        mHistoryGrade = historyGrade;
        mArtGrade = artGrade;
    }

    // Setters
    public void setStudentName(String name) {
        this.mStudentName = name;
    }

    public void setMathGrade(int mathGrade) {
        this.mMathGrade = mathGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.mEnglishGrade = englishGrade;
    }

    public void setScienceGrade(int scienceGrade) {
        this.mScienceGrade = scienceGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.mHistoryGrade = historyGrade;
    }

    public void setArtGrade(int artGrade) {
        this.mArtGrade = artGrade;
    }

    // Getters
    public String getStudentName() {
       return mStudentName;
    }

    public int getMathGrade() {
        return mMathGrade;
    }

    public int getEnglishGrade() {
        return mEnglishGrade;
    }

    public int getScienceGrade() {
        return mScienceGrade;
    }

    public int getHistoryGrade() {
        return mHistoryGrade;
    }

    public int getArtGrade() {
        return mArtGrade;
    }

    // returns a string representation of the report card for the given student
    @Override
    public String toString() {
        //Your code here!  Return a representation of
        //the report card rather than the empty string
        return "ReportCard{" +  "Name: " + this.getStudentName() + "\n Math Grade: " + this.getMathGrade() + "\n English Grade: " + this.getEnglishGrade() + "\n Science Grade: " + this.getScienceGrade() + "\n History Grade: " + this.getHistoryGrade() + "\n Art Grade: " + this.getArtGrade() + "}";
    }

}
