package io.zipcoder;

import java.util.*;

public class Student {


    private String name, firstName, lastName;
    private List<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores){

        this.firstName = firstName;
        this.name = firstName;
        this.lastName= lastName;
        this.examScores = Arrays.asList(testScores);

    }

    public int getNumberOfExamsTaken(){

        return examScores.size();
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getExamScores() {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < examScores.size(); i++){
            sb.append("Exam " + (i + 1) + " -> " + examScores.get(i) + "\n");
        }


        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addExamScore(Double examScore){

        examScores.add(examScore);

    }

    public void setExamScore(int examNumber, double newScore){

        //setExamScore is trying to change the score in the list

        examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore(){

        Double sum = 0.0;

        for(Double score : examScores){
            sum += score;
        }

        return sum / examScores.size();
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Student Name: " + name  + " " + lastName + "\n");
        sb.append("Average Score: " + getAverageExamScore() + "\n");
        sb.append(getExamScores());

        return sb.toString();
    }


    public String getFirstName() {

        return firstName;
    }
}
