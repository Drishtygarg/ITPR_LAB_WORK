//program to find out the greatest number among 10 numbers given user
import java.util.Scanner; //importing Scanner class for user input
public class GreatestNumber {
    public static void main(String[] args) {
        int numbers[] = new int[10];//declaring array of 10 numbers
        //creating object of Scanner class for user input
        Scanner sc=new Scanner(System.in);
        
        //Input of elements into the array through keyboard
        System.out.println("Enter any 10 number : ");
        for(int index = 0;index < numbers.length;index++)
        {
            numbers[index] = sc.nextInt(); //Reading user input and storing it in array at given index
        }

        sc.close(); //closing scanner object to avoid resource leak
        
        System.out.println("Numbers are : ");
        for(int index=0;index < numbers.length ; index++)
        {
            System.out.print(numbers[index]+" , ");
        }

        //finding the greatest
        int max = numbers[0];
        for(int index = 1;index < numbers.length;index++)
        {
            if(numbers[index] > max)
            {
                max = numbers[index];
            }
        }
        System.out.println("\n Greatest Number : "+max);
    }
    
}



    

