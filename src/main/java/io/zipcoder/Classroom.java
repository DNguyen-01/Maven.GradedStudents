package io.zipcoder;

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

        for

    }

}
