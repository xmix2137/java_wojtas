/*17.	The following definition of the StudentGrades class allows the storage of a student's grades.
public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
}
Complete the class with methods that:
a.	calculates of the lowest grade
b.	calculates of the highest grade
c.	calculates of the number of grades
d.	calculates of the grade point average
e.	displays student’s record with student’s name, a list of the student's grades, number of grades, 
lowest grade, highest grade, and grade point average

Then, write a program that creates grades for two students:
f.	Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
g.	James: 2.0, 3.0, 2.0, 4.5, 4.5
Tip: pass student's grades to the constructor, as an array, in curly brackets, e.g. StudentGrades({5.0, 3.5}).

 */


package ClassStructure;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

     /*public double lowestGrade(){
        for(int i = 0; i<this.grades.length; i++){

        }
    }*/
    public double getLowestGrade() {
        if (grades.length == 0) {
            return 0.0; // Return 0 if there are no grades
        }
        double lowest = grades[0];
        for (double grade : grades) {                               //?????
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public double getHighestGrade(){
        if (grades.length == 0){
            return 0.0;
        }
        double highest = grades[0];
        for (double grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static void main(String [] args){
        double[] tablica = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades Amanda = new StudentGrades("Amanda", tablica);
        System.out.println(Amanda.studentName);
        System.out.println(Amanda.grades);
        System.out.println(Amanda.getHighestGrade());
        System.out.println(Amanda.getLowestGrade());
    }
}
