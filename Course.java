/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author carla
 */
public class Course {
     private String courseName;
    private double credit;
     private double examScore;
    private double assignmentScore;
    
    public Course() {
    this.courseName = null;
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }
        public Course(String courseName , double credit){
            this.courseName = courseName;
            this.credit = credit;
                    
        }
        public Course(String courseName , double credit , double examScore , double assignmentScore){
           this.courseName = courseName;
            this.credit = credit;
            this.examScore = examScore;
            this.assignmentScore = assignmentScore;
        }
        public Course(Course course){
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.examScore = course.examScore;
        this.assignmentScore = course.assignmentScore;        
    }
        public static double calcFinalScore(double examScore , double assignmentScore){
            double finalScore = (examScore * 0.6) + (assignmentScore * 0.4);
            return finalScore;
        }
        public static boolean isPassed(double finalScore){
            if(finalScore >= 60){
                return true;
            }
            else{
            return false;
            }
        }
        public boolean equals(Course course) {
        return this.courseName == course.courseName &&
                this.credit == course.credit && this.examScore==course.examScore && 
                this.assignmentScore==course.assignmentScore;
    }
        public String toString() {                          // non-static method
        String str = "";
        
     
        str += String.format("%-10s: %s\n", "Course Name:", courseName);
        str += String.format("%-10s: %s\n", "Credit:", credit);
        str += String.format("%-10s: %d\n", "Exam Score:", examScore);
        str += String.format("%-10s: %s\n", "Assignment Score:", assignmentScore);
        str += String.format("%-10s: %s\n", "Final Score:", calcFinalScore(examScore, assignmentScore));
        
        return str;
    }
        public Course clone(){
            return new Course();
        }
         public String getCourseName() {
        return courseName;
    }
          public double getCredit() {
        return credit;
    }
           public double getExamScore() {
        return examScore;
    }
            public double getAssignmentScore() {
        return assignmentScore;
    }
            public double getFinalScore(){
                return  calcFinalScore(examScore, assignmentScore);
            }
            public void setCourseName(String courseName){
                this.courseName = courseName;
            }
            public void setCredit(double credit) {
        this.credit = credit;
}
            public void setExamScore(double examScore) {
        this.examScore = examScore;
            }
            public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
            }
}