//WAP to create a array of 5 numbers and display them
import java.util.Scanner;
public class array {
    public static void main(String[]args)
    {
      int numbers[]= new int[5]; //declaration of array
      numbers= new int[10]; //initializing total no of elements
Scanner sc = new Scanner(System.in); //creating object of the scanner class
System.out.println("Enter any 10 number ");

for (int index=0; index<numbers.length;index++)
{
numbers[index] = sc.nextInt();

}
System.out.println("__________________________");
System.out.println("Elements are:");
for(int index=0; index<numbers.length;index++)
{
    System.out.println(numbers[index]+",");
}


    }
   
}
