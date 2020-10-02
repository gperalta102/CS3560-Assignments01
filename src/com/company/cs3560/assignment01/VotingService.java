package com.company.cs3560.assignment01;

public class VotingService {
    private Student[] students;
    private Question questionGenerated;

    private int correctCount =0;
    private int incorrectCount = 0;

    public VotingService(Student s[], Question q){
            questionGenerated = q;
            students = s;

    }

    public void runVotingService(){
        //put thing there
        votingService();
    }

    private void votingService(){
        System.out.println("Type of question"+questionGenerated.getType());

        switch (questionGenerated.getType()) {
            case 0:
                multiQtype();
                break;
            case 1:
                twoQtype();
                break;
            default:
                System.out.println("there was an error in the voting service");

        }


        /*for (Student stud : students) {
            if (stud.getAnswer().equals(questionGenerated.getAnswer())){
                correctCount++;

            }else{
                incorrectCount++;
            }


        }*/

        System.out.println("Correct number: "+correctCount+" Incorrect: "+incorrectCount);
    }

    private void multiQtype(){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;


        for (Student stud : students) {
            if (stud.getAnswer().equals(questionGenerated.getAnswer())){
                correctCount++;
                switch (stud.getAnswer()){
                    case "A":
                        a++;
                        break;
                    case "B":
                        b++;
                        break;
                    case "C":
                        c++;
                        break;
                    case "D":
                        d++;
                        break;
                }

            }else{
                switch (stud.getAnswer()){
                    case "A":
                        a++;
                        break;
                    case "B":
                        b++;
                        break;
                    case "C":
                        c++;
                        break;
                    case "D":
                        d++;
                        break;
                }
                incorrectCount++;
            }


        }

        System.out.println("A: "+a + "\n B: "+b+"\nC: "+c+"\nD: "+d);

    }
    private void twoQtype(){
        int right = 0;
        int wrong = 0;


        for (Student stud : students) {
            if (stud.getAnswer().equals(questionGenerated.getAnswer())){
                correctCount++;
                switch (stud.getAnswer()){
                    case "1. Right":
                        right++;
                        break;
                    case "2. Wrong":
                        wrong++;
                }

            }else{
                switch (stud.getAnswer()){
                    case "1. Right":
                        right++;
                        break;
                    case "2. Wrong":
                        wrong++;
                }
                incorrectCount++;
            }


        }

        System.out.println("Right: " + right+"\nWrong: "+wrong);
    }

}
