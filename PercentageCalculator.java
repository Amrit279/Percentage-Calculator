import java.util.InputMismatchException;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, subjects = 0, maxMarks = 0, check = 0;
        double marks = 0.0, percentage, sum = 0.0;
        System.out.print("Enter total number of subjects: ");
        try{subjects = sc.nextInt();} catch (InputMismatchException e){
            System.out.println("This type of value is not allowed here!");
            System.exit(0);
        }


        if (subjects < 0){
        while (subjects < 0){
            System.out.println("Number of subjects cannot be negative!");
            System.out.print("Re-enter number of subjects: ");
                try{subjects = sc.nextInt();} catch (InputMismatchException e){
                    System.out.println("This type of value is not allowed here!");
                    System.exit(0);
                }
        }
    }
        System.out.print("Enter maximum marks that can be attained in a subject (like 100, 80, 70 etc.): ");
        try{maxMarks = sc.nextInt();} catch (InputMismatchException e){
            System.out.println("This type of value is not allowed here!");
            System.exit(0);
        }
        System.out.println();
        if (maxMarks < 0){
            while (maxMarks < 0){
                System.out.println("Maximum marks cannot be neagtive");
                System.out.print("Re-enter maximum marks that can be attained in a subject: ");
                    try{maxMarks = sc.nextInt();} catch (InputMismatchException e){
                        System.out.println("This type of value is not allowed here!");
                        System.exit(0);
                    }
            }
        }

        for(i=0; i<subjects; i++){
            if (check == i)
                System.out.print("Enter marks in subject " + (i+1) + ": ");
            else
                System.out.print("Re-enter marks in subject " + (i+1) + ": ");
            try{marks = sc.nextDouble();} catch (InputMismatchException e){
                System.out.println("This type of value is not allowed here!");
                System.exit(0);
            }
            System.out.println();
            if (marks > maxMarks){
                System.out.println("Marks in a subject cannot be greater than maximum marks");
                i--; // i is decreased so that it do not go to the next iteration
                /*
                if i = 2 then after i-- i becomes 1 and when the iteration is ended the control back to the starting of the loop which makes i = 2
                Since i was 2 before the starting of the iteration and it is still 2 at the end of the iteration it can be assumed that the iteration has not taken place.
                */

            }
            else if (marks < 0){
                System.out.println("Marks cannot be negative");
                i--;
            }
            else
                sum += marks;
            check++;
        }
        sc.close();
        percentage = 100.0/maxMarks * sum/subjects;
        System.out.println("Percentage in " + subjects + " subjects is " + percentage);
    }
    
}
