package com.management.student.studentresult.vo;

public class MarksVO {
    private String rollNo;
    private String subjectCode;
    private String subjectName;
    private int year;
    private int term;
    private int totalMarks;
    private double marksObtained;
    private String grade;

    public MarksVO() {
    }

    public MarksVO(String rollNo, String subjectCode, String subjectName, int year, int term, int totalMarks, double marksObtained, String grade) {
        this.rollNo = rollNo;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.year = year;
        this.term = term;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
        this.grade = grade;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
