package io.zipcoder;

import java.sql.Array;

public class Classroom {

    private Student[] students;


    public Classroom(int maxNumberOfStudents){

        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){

        this.students = null;
    }

    public Student[] getStudents(){

        return students;
    }


    public Double getAverageExamScore(){

        Double sum = 0.0;

        for(Student student : students){
                sum += student.getAverageExamScore();
            }


        return sum / students.length;

    }

    public void addStudent(Student student){

        for(int i =0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }
    }


    public void removeStudent(String firstName, String lastName){

        //with primitive arrays - we have to find the original length of it
        //and as we remove any elements, we have to create a new array

        int newNumberOfStudents = 0;
        //given the student array - fixed size, requires you to find the size
        for(int i = 0; i<students.length; i++){
            if(!(students[i].getFirstName().equals(firstName) && (students[i].getLastName()).equals(lastName))){
                //we are saying that if the students at the given index does not contain the first and last name
                //keep those students in the new array
                newNumberOfStudents++;
            }

        }
        //this check is if the original array does not have the input needed to be removed - do not copy the array
        if(newNumberOfStudents == students.length){
            return;
        }
        Student[] newStudents = new Student[newNumberOfStudents];
        int currentIndex = 0;
        for(int i = 0; i<students.length; i++){
            if(!(students[i].getFirstName().equals(firstName) && (students[i].getLastName()).equals(lastName))){
                newStudents[currentIndex] = students[i];
                currentIndex++;
            }
        }

        students = newStudents;
    }

    public Student getStudentByScore(){

    }


    public Student getGradeBook(){


    }


}
