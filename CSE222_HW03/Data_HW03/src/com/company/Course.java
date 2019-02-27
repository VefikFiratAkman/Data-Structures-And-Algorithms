package com.company;



/**
 * Course class for hold information of courses in a package.
 * Have 6 public field.
 */
public class Course {
    /**
     * Constructor for Course Class. All field initialized.
     */
    Course(){
        semester = 0;
        courseCode = "";
        courseTitle = "";
        ects = 0;
        gtuCredits = 0;
        HTL = "";
    }

    public int semester;
    public String courseCode;
    public String courseTitle;
    public int ects;
    public int gtuCredits;
    public String HTL;

    /**
     * toString method for Course class.
     */
    public String toString(){
        String s;

        s = "Semester   " + "Course Code   " + "Course Title ";
        for (int a = 55; a >= 0; --a){
            s +=" ";
        }
        s+= "ECTS_CS   " + "GTUCS   " + "H+T+L  \n" + "   " + semester + "        ";

        s += courseCode;
        for (int a = 13 - courseCode.length(); a >= 0; --a){
            s +=" ";
        }

        s += courseTitle;
        for (int a = 70 - courseTitle.length(); a >= 0; --a){
            s +=" ";
        }
        s += ects  + "        " + gtuCredits  + "     " + HTL  + "\n";
        return s;
    }
}
