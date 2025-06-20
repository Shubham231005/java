import java.util.Scanner;

public class Marks {

    void Student_Details(String Firstname, String Lastname, int Rollno, String Department) {
        System.out.println("\n📘 Student Personal Information:");
        System.out.println("First Name: " + Firstname);
        System.out.println("Last Name: " + Lastname);
        System.out.println("Roll No: " + Rollno);
        System.out.println("Department: " + Department);
    }

    void marks(float marks) {
        System.out.print("📊 Grade: ");
        if (marks >= 80) {
            System.out.println("O");
        } else if (marks >= 70) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Failed 😢");
        }
    }

    float Average(int Maths, int English, int Java, int Science) {
        float marks = (Maths + English + Java + Science) / 4.0f;
        System.out.println("📈 Average Marks: " + marks);
        return marks;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Marks student1 = new Marks();

        System.out.println("🎓 Welcome! This is your 4th Semester Result");

        // Personal Info Input
        System.out.println("\nEnter your First Name:");
        String fname = sc.nextLine();

        System.out.println("Enter your Last Name:");
        String lname = sc.nextLine();

        System.out.println("Enter your Roll No:");
        int rollno = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter your Department:");
        String department = sc.nextLine();

        // Subject Marks Input
        System.out.println("\n📝 Enter your Subject Marks (out of 100):");
        System.out.print("Maths: ");
        int maths = sc.nextInt();

        System.out.print("English: ");
        int english = sc.nextInt();

        System.out.print("Java: ");
        int javaMarks = sc.nextInt();

        System.out.print("Science: ");
        int science = sc.nextInt();

        sc.close();

        // Output
        student1.Student_Details(fname, lname, rollno, department);
        float avg = student1.Average(maths, english, javaMarks, science);
        student1.marks(avg);
    }
}
