package decision_structures;

import java.util.Scanner;

/*
*SWITCH Statement
* Have a user enter their letter grade, and using a switch statement.
* print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = " You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
        }
        System.out.println(message);

        /*
        *SWITCH Expressions -
        *  String message = switch(grade){
              case "A" ->  "Excellent job!";
              case "B" -> "great job!";
              case "C" -> "Good job!";
              case "D" -> " You need to work a bit harder";
              case "F" -> "Uh oh!";
              default -> "Error. Invalid grade";
              };
              * use comma to assign the same message to same grade
         */
    }
}
