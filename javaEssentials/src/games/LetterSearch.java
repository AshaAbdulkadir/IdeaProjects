package games;

import java.util.Scanner;

/*
Break Statement - end a loop n matter what iteration it's on
Search a string to determine if it contains the letter A
 */
public class LetterSearch {

    public static void main(String[] args){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                System.out.println(true);
                break;
            }
        }
    }

}
