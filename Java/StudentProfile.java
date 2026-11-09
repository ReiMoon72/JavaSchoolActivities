public class StudentProfile {

    public static void main(String[] args) {

        //Student Name
        String studentName = "Reimone Palama";
        //Student ID of the Student 
        //Additional Due to a error in java the 2026 is not appering it only appear the -1022097 kaya po naka string po siya to input the 2026.
        String studentID = "2026-1022097";
        //Studnt Course
        String studentCourse = "Bachelor Of Science in Information Technology";
        //Student Year Level 
        String studetYearlevel = "Freshman - First Year";
        //Student Section 
        String studentSection = "BSIT-261D";
        //Student Age
        int studentAge = 18;
        //Student Gender
        String studentGender = "Male";
        //Student GPA
        double studentGPA = 4.0;
        //Stduent TutionFee
        int studnetTutionfee = 25000;
        //Scholarship Recipient
        boolean studentScholarship = false;

        //Printing All

        System.out.println("=============== Student Profile ===============");
        System.out.println("Student Name: " + studentName);
        System.out.println("Studnt ID: " + studentID );
        System.out.println("Course: " + studentCourse);
        System.out.println("Year Level: " + studetYearlevel);
        System.out.println("Section: " + studentSection);
        System.out.println("Age: " + studentAge);
        System.out.println("Gender: " + studentGender);
        System.out.println("GPA: " + studentGPA);
        System.out.println("Tution Fee: " + studnetTutionfee);
        System.out.println("Scholarship Recipient: " + studentScholarship);
    }
}