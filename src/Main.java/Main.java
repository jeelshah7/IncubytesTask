import java.io.*;
import java.util.*;

import StringCalculator.StringCalculator;
public class Main {

    public static void main(String[] args) throws IOException{
        StringCalculator calculator = new StringCalculator();
        Scanner inputScanner = new Scanner(System.in);
        String userInput = "";

        //Get user string input.
        if(inputScanner.hasNext()){
            userInput = inputScanner.next().trim();
        }

        
        int sum = calculator.Add(userInput);
        System.out.println(sum);
        
    }
}