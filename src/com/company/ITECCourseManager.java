package com.company;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        // Declare an empty list of courses.
        ArrayList<ITECCourse> courseList = new ArrayList<>();

        // Create the course objects like before, but add them to the list as well.
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, "T3010");
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        maintenanceCourse.setName("PC Maintenance");
        courseList.add(maintenanceCourse);

        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, "T3050");
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.removeStudent("Ed");
        datacomCourse.removeStudent("Clara");
        courseList.add(datacomCourse);

        ITECCourse javaProgramming = new ITECCourse("Java Programming", 2545, 24, "T3010");
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Izzy");
        courseList.add(javaProgramming);

        ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        infoTechConcepts.addStudent("Max");
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");
        courseList.add(infoTechConcepts);

        // A for loop that shows the number of open spots in each course.
        for (int x = 0; x < courseList.size(); x++)
        {
            ITECCourse course = courseList.get(x);
            System.out.println(course.getName() + ": " + course.getNumberOfOpenSpots() + " spots open.");
        }

    }
}
