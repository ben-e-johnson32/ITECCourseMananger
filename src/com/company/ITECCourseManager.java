package com.company;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
        //Add some students.
        //TODO check that we have not exceeded the max number for the class




        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        maintenanceCourse.setName("PC Maintenance");

        maintenanceCourse.writeCourseInfo();



        //Error!
        //System.out.println(maintenanceCourse.name);
        //Erro!
        //System.out.println(maintenanceCourse.maxStudents);


        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.removeStudent("Ed");
        datacomCourse.removeStudent("Clara");

        datacomCourse.writeCourseInfo();


        ITECCourse javaProgramming = new ITECCourse("Java Programming", 2545, 24);
        javaProgramming.addStudent("Harry");
        javaProgramming.addStudent("Gus");
        javaProgramming.addStudent("Izzy");

        javaProgramming.writeCourseInfo();

    }
}
