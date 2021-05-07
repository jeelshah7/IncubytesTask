package StringCalculator;

import java.util.*;

public class StringCalculator {
    
    public int Add(String numbers) {
        if (numbers.length()==0){
            return 0;
        }

        int sum=0;
        int firstComma = numbers.indexOf(",");
        
        if(firstComma != -1){
            int firstNumber = Integer.parseInt(numbers.substring(0, firstComma));
            sum += firstNumber;
            int secondNumber = Integer.parseInt(numbers.substring(firstComma+1, numbers.length() - 1));
            sum += secondNumber; 
        }else{
            sum += Integer.parseInt(numbers);
        }
        return sum;
    }
}
