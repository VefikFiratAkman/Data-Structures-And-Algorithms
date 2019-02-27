package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class cseCourse {

    private LinkedList<Course> course;
    private static final String COMMA_DELIMITER = ";";

    /**
     * cseCourse Constructor.
     * Read csv file for course data.
     * @throws IOException for file. When program running, Before file must be close.
     */
    cseCourse() throws IOException {
        course = new LinkedList<Course>();

        BufferedReader fileReader;
        String line;
        fileReader = new BufferedReader(new FileReader("src\\com\\Data\\Courses(CSV)(Updated).csv"));
        fileReader.readLine();

        int i = 0;
        while ((line = fileReader.readLine()) != null) {
            Course temp = new Course();

            String[] tokens = line.split(COMMA_DELIMITER);

            temp.semester = Integer.parseInt(tokens[0]);
            temp.courseCode = tokens[1];
            temp.courseTitle = tokens[2];
            temp.ects = Integer.parseInt(tokens[3]);
            temp.gtuCredits = Integer.parseInt(tokens[4]);
            temp.HTL = tokens[5];
            course.add(temp);
        }

        fileReader.close();

    }

    /**
     * getByCode list of found course with given code.
     * @param code is Course Code in csv file.
     * @throws Exception if There  are no matched course
     * Exception message is "There  are no matched course."
     * @return LinkedList it's have a list of found course by given code.
     */
    public LinkedList<Course> getByCode(String code) throws Exception {
        LinkedList<Course> tempCourse = new LinkedList<Course>();

        for(int i=0; i < course.size(); ++i){
            if(( course.get(i)).courseCode.equals(code)){
                tempCourse.add(course.get(i));

            }
        }

        if (tempCourse.isEmpty()){
            throw new Exception("There  are no matched course.");
        }

        return tempCourse;
    }
    /**
     * listSemesterCourses list of found course with given semester.
     * @param semester is Semester in csv file.
     * @throws Exception if There  are no matched course.
     * Exception message is "There  are no matched course."
     * @throws Exception if semester is not between 0-8.
     * Exception message is "Semester is wrong."
     * @return LinkedList it's have a list of found course by given semester.
     */
        public LinkedList<Course> listSemesterCourses(int semester) throws Exception {
        LinkedList<Course> tempCourse = new LinkedList<Course>();

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


        return tempCourse;
    }
    /**
     * listSemesterCourses list of found course with between given indexs in LinkedList.
     * @param start_index is starting index for searching Course LinkedList.
     * @param last_index is ending index for searching Course LinkedList.
     * @throws Exception if There  are no matched course.
     * Exception message is "There  are no matched course."
     * @throws Exception if Start index is wrong.
     * Exception message is "Start index is wrong."
     * @throws Exception if Last index is wrong.
     * Exception message is "Last index is wrong."
     * @return LinkedList it's have a list of found course with between given indexes in LinkedList.
     */
    public LinkedList<Course> getByRange(int start_index, int last_index) throws Exception {
        LinkedList<Course> tempCourse = new LinkedList<Course>();

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


        return tempCourse;
    }

}
