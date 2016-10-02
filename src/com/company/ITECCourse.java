package com.company;

import java.util.ArrayList;

public class ITECCourse {

    //Variables to store information about an ITEC course
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    // Added getter and setter for the room.
    public String getRoom() { return room; }

    public void setRoom(String newRoom) { room = newRoom; }



    public ITECCourse(String name, int courseCode, int courseMaxStudents, String room) {
        this.name = name;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.room = room;
    }


    public void addStudent(String studentName) {

        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }


    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Classroom: " + this.room);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    // A class method to get the number of open spots remaining in the class.
    public int getNumberOfOpenSpots() { return this.maxStudents - this.students.size(); }
}
