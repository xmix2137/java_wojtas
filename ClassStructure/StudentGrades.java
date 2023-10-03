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

 /*18.	Add the constructor StudentGrades(String name, int numberOfGrades) to the StudentGrade class,
  which allows you to randomly create the given number of student grades. Tip: use the random number generator,
   which is available in the Random class. See the manual for more information. */

/*19.	Add the constructor StudentGrades(String name) that allows you to enter student’s grades from the keyboard.
 Tip: use the Scanner class. See the manual for more information. */
   
package ClassStructure;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        double grades1[] = {};
        for(int i = 0; i<numberOfGrades+1; i++){
            double random = ThreadLocalRandom.current().nextDouble(1.0, 5.0);
            grades1[i] = random;
        }
        this.grades = grades1;
    }

    StudentGrades (String name){
        this.studentName = name;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Write the number of grades: ");
        int licznik = myObj.nextInt();
        double grades[] = {};
        for (int i =0; i <licznik; i ++){
            double grade = myObj.nextDouble();
            grades[i] = grade;
        }
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

    public double calculateGrades(){
        double counter = 0;
        for (double grade : grades){
            counter++;
        }
        return counter;
    }

    public double calculateAvg(){
        double liczba = this.calculateGrades();
        double suma = 0;
        for (double grade : grades){
            suma += grade;
        }
        double avg = suma/liczba;
        return avg;
    }

    public void display(){
        System.out.println("Name: "+this.studentName);
        System.out.println("Grades: "+this.grades);
        System.out.println("Number of grades: "+this.calculateGrades());
        System.out.println("Highest grade: "+this.getHighestGrade());
        System.out.println("Lowest grade: "+this.getLowestGrade());
        System.out.println("Avg: "+this.calculateAvg());
    }

    public static void main(String [] args){
        double[] tablica = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] tablica1 = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades Amanda = new StudentGrades("Amanda", tablica);
        System.out.println(Amanda.studentName);
        System.out.println(Amanda.grades);
        System.out.println(Amanda.getHighestGrade());
        System.out.println(Amanda.getLowestGrade());
        System.out.println(Amanda.calculateGrades());
        System.out.println(Amanda.calculateAvg());
        Amanda.display();
        StudentGrades James = new StudentGrades("James", tablica1);
        James.display();
        StudentGrades Tom = new StudentGrades("Tom", 6);
        //Tom.display();
        StudentGrades Nikita = new StudentGrades("Nikita");
    }
}
