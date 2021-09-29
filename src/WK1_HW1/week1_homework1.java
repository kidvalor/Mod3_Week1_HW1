package WK1_HW1;
import java.util.Scanner;

//#1

public class week1_homework1 {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        int grade;
        System.out.println("What was the Grade?");
        grade = Obj.nextInt();

        if (grade < 55){
            System.out.println("Grade: F");
        }
        else if (grade < 70) {
            System.out.println("Grade : D");
        }
        else if (grade < 80) {
            System.out.println("Grade : C");
        }
        else if (grade < 90) {
            System.out.println("Grade : B");
        }
        else if (grade < 100) {
            System.out.println("Grade : A");
        }
    }
}

//#2

public class week1_homework1 {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        int day;
        String dayString;
        System.out.println("What day is it?");
        day = Obj.nextInt();
        //Using switch case, do the following:
        //Store a number between 1-7
        //If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
       //Anything other than 1-7 would default to "Invalid Input"
      switch (day) {
            case 1:
               dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
               break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
               dayString = "Sunday";
                break;
            default:
                dayString = "Invalid Input";
                break;

        }
        System.out.println(dayString);
    }
}


public class week1_homework1 {

    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        int num;
        System.out.println("Choose a number");
        num = Obj.nextInt();

//    Store a number in a variable called num and write an if statement:


        //If num is odd, display "Cool"
        if (num % 2 != 0) {
            System.out.println("Cool");
        }
//If num is even and between 2-5, display "Not Cool"
        if (num % 2 == 0 && num >= 2 && num <= 5) {
            System.out.println("Not Cool");
        }
//If num is even and between 6-20, display "Cool"
        if (num % 2 == 0 && num >= 6 && num <= 20) {
            System.out.println("Cool");
        }
//If num is even and greater than 20, display "Not Cool
        if (num % 2 == 0 && num > 20) {
            System.out.println("Not Cool");
        }
    }

}