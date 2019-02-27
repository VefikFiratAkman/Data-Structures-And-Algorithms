package com.company;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class cseCourseTest {

    @org.junit.Test
    public void getByCode() throws Exception {

    LinkedList<Course> course = new LinkedList<>();
    LinkedList<Course> tempCourse = new LinkedList<>();

    Course x = new Course();
        x.semester = 1;
        x.courseCode = "Cse 107";
        x.courseTitle = "Introduction To Computer Science Laboratory";
        x.ects = 2;
        x.gtuCredits = 1;
        x.HTL = "0+0+2";
    course.add(x);

        for(int i=0; i < course.size(); ++i){
            if(( course.get(i)).courseCode.equals("Cse 107")){
                tempCourse.add(course.get(i));

            }
        }

        if (tempCourse.isEmpty()){
            throw new Exception("There  are no matched course.");
        }


    }

    @org.junit.Test
    public void listSemesterCourses() throws Exception {

        LinkedList<Course> tempCourse = new LinkedList<Course>();
        LinkedList<Course> course = new LinkedList<>();


        Course x = new Course();
            x.semester = 1;
            x.courseCode = "Cse 107";
            x.courseTitle = "Introduction To Computer Science Laboratory";
            x.ects = 2;
            x.gtuCredits = 1;
            x.HTL = "0+0+2";

        course.add(x);

        int semester = 1;


        if(semester<0 || semester > 8){
            throw new Exception("Semester is wrong.\n");
        }

        for(int i=0; i < course.size(); ++i){
            if((course.get(i)).semester == semester){
                tempCourse.add(course.get(i));
            }
        }

        if (tempCourse.isEmpty()){
            throw new Exception("There  are no matched course.\n");
        }

    }

    @org.junit.Test
    public void getByRange() throws Exception {
        LinkedList<Course> tempCourse = new LinkedList<Course>();

        int start_index = 0;
        int last_index = 1;

        LinkedList<Course> course = new LinkedList<>();


        Course x = new Course();
        x.semester = 1;
        x.courseCode = "Cse 107";
        x.courseTitle = "Introduction To Computer Science Laboratory";
        x.ects = 2;
        x.gtuCredits = 1;
        x.HTL = "0+0+2";
        Course y = new Course();
        x.semester = 1;
        x.courseCode = "Cse 101";
        x.courseTitle = "Introduction To Computer Engineering";
        x.ects = 8;
        x.gtuCredits = 3;
        x.HTL = "3+0+0";

        course.add(x);
        course.add(y);


        if(start_index<0 || start_index >= course.size()){
            throw new Exception("Start index is wrong.\n");
        }

        if(last_index<0 || last_index >= course.size()){
            throw new Exception("Last index is wrong.\n");
        }
        if(last_index < start_index){
            throw new Exception("Start index can't bigger than last index.\n");
        }

        for(int i=start_index; i <= last_index; ++i){
            tempCourse.add(course.get(i));
        }

        if (tempCourse.isEmpty()){
            throw new Exception("There  are no matched course.\n");
        }

    }
}