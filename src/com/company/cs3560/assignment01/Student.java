package com.company.cs3560.assignment01;

public class Student {
    private String studentID;
    private String answer;

    Student(String s, String a){
        studentID = s;
        answer = a;

    }
    public void addStudentID(String s){
        studentID = s;
    }
    public void addStudentAns(String a){
        answer = a;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAnswer() {
        return answer;
    }


}
