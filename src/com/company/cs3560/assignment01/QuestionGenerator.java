package com.company.cs3560.assignment01;

import java.util.Random;

class Question {
    private String question;
    private String answer;


    public Question(String q, String a){
        question = q;
        answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

public class QuestionGenerator {
    private int questionType;
    private String Answer;
    private String [] randQuestions = {"random question 1","random question 2", "random question 3", "random question 4"};
    private String [] twoChoiceAns = {"1. Right", "2. Wrong"};
    private String[] multiChoiceAns = {"A", "B", "C","D"};
    private Random rand = new Random();
    private Question mQuestion = new Question(randQuestions[rand.nextInt(4)],multiChoiceAns[rand.nextInt(4)]);
    private Question tQuestion = new Question(randQuestions[rand.nextInt(4)], twoChoiceAns[rand.nextInt(2)]);

    public QuestionGenerator(int qType) {
        questionType = qType;

        //decide what question type it is going to be
        // 0 -> multiple choice
        // 1 -> Right or Wrong

    }
    /*prviate int  getQtype(){
        return questionType;
    }*/
    public Question getQuestion(){
        if (questionType == 0){
            return  mQuestion;
        }else{
            return tQuestion;
        }
    }



}