
package week2inheritance;

class Student{
    String name;
    int studID;
    String gender;
    int age;
    
}

class ElemStudent extends Student{
    String allergies;
    int emergencyContactPhone;
}

class HighSchoolStudent extends Student{
    String absences;
    int afterSchoolActs;
}

class CollegeStudent extends Student{
    String parties;
    int studyAllTheTime;
}



public class ParentalPrac {
    public static void main(String[] args){
        Student stud = new Student();
        ElemStudent elemStud = new ElemStudent();
        elemStud.name = "Crusoe";
        elemStud.allergies = "email,homework, peanut, math";
        elemStud.emergencyContactPhone = 123456789;
        // I can store a subclass in a variable type
        // to the superclass! Handy because I can write
        // code that operates on the superclass before
        // the subclass has even been written
        stud = elemStud;
        ElemStudent anotherElemStudVar;
        anotherElemStudVar = (ElemStudent)stud;
       
        HighSchoolStudent highStud = new HighSchoolStudent();
        highStud.name = "Max";
        highStud.absences = "Turn in notes to office";
        highStud.afterSchoolActs = 5;
        
        stud = highStud;
        HighSchoolStudent anotherHighSchlStudVar;
        anotherHighSchlStudVar = (HighSchoolStudent)stud;
        
       CollegeStudent collegeStud = new CollegeStudent() ;
       collegeStud.name = "Kelly";
       collegeStud.parties = "Party all night and all day ";
       collegeStud.studyAllTheTime = 4;
       
       stud = collegeStud;
       CollegeStudent anotherColleStudVar;
       anotherColleStudVar = (CollegeStudent)stud;
    
    make a for loop and a array look at page 224-231
       
    }
    
}