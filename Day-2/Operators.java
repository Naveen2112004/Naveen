import java.util.Scanner;

public class Operators {

    public static String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else if (marks >= 35) return "E";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 35;

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Register Number: ");
        String regNo = scanner.nextLine();

        System.out.println("\nEnter marks for each subject:");
        System.out.print("Maths: ");
        int maths = scanner.nextInt();
        System.out.print("Science: ");
        int science = scanner.nextInt();
        System.out.print("English: ");
        int english = scanner.nextInt();
        System.out.print("Social: ");
        int social = scanner.nextInt();
        System.out.print("Telugu: ");
        int telugu = scanner.nextInt();

        System.out.println("\nStudent Name     : " + name);
        System.out.println("Register Number  : " + regNo);

        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println("| Subject  | Marks     | Type   | Result     | Grade |");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("| %-9s| %-10d| %-7s| %-11s| %-6s|\n", "Maths", maths, checkEvenOdd(maths), (maths >= pass ? "Pass" : "Fail"), getGrade(maths));
        System.out.printf("| %-9s| %-10d| %-7s| %-11s| %-6s|\n", "Science", science, checkEvenOdd(science), (science >= pass ? "Pass" : "Fail"), getGrade(science));
        System.out.printf("| %-9s| %-10d| %-7s| %-11s| %-6s|\n", "English", english, checkEvenOdd(english), (english >= pass ? "Pass" : "Fail"), getGrade(english));
        System.out.printf("| %-9s| %-10d| %-7s| %-11s| %-6s|\n", "Social", social, checkEvenOdd(social), (social >= pass ? "Pass" : "Fail"), getGrade(social));
        System.out.printf("| %-9s| %-10d| %-7s| %-11s| %-6s|\n", "Telugu", telugu, checkEvenOdd(telugu), (telugu >= pass ? "Pass" : "Fail"), getGrade(telugu));
        System.out.println("---------------------------------------------------------------------------------");

        boolean isOverallPass = maths >= pass && science >= pass && english >= pass && social >= pass && telugu >= pass;
        System.out.printf("| %-10s| %-60s|\n", "Overall", (isOverallPass ? "PASS" : "FAIL"));
        System.out.println("---------------------------------------------------------------------------------");

        double total = maths + science + english + social + telugu;
        double average = total / 5.0;

        System.out.printf("\n| %-10s| %-10.2f | %-10s| %-7.2f |\n", "Total", total, "Average", average);

        scanner.close();
    }
}
