//WAP a program to input marks of five subjects and cal total marks obtained and their percentage also cal their grade 
import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks  of students");
            System.out.println("Enter English Marks:") ;
            double e=sc.nextDouble();
           System.out.println("Enter Maths Marks:") ;
        double m =sc.nextDouble();
        System.out.println("Enter Hindi Marks:") ;
        double h=sc.nextDouble();
        System.out.println("Enter Science Marks:") ;
        double s=sc.nextDouble();
        System.out.println("Enter Social Study Marks:") ;
        double ss=sc.nextDouble();
        double marks= e+m+s+h+ss;
        System.out.println("The marks you entered is: "+marks);
        double percentage= (marks /500)*100;
        System.out.println("The Percentage obtained by Student  is: "+percentage);

        if (percentage >= 75)
        {
            System.out.println("The Grade is :- A+ ");
        } else if (percentage >= 65) {
            System.out.println("The Grade is :- A ");
        } else if (percentage >= 55) {
            System.out.println("The Grade is :- B");
        } else if (percentage >= 45) {
            System.out.println("The Grade is :- c ");
        } else {
            System.out.println("The Grade is :- Fail");
        }
    }
}

