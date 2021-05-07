package StringCalculator;

import java.util.*;

public class StringCalculator {
    
    public int Add(String numbers) {
        if (numbers.length()==0){
            return 0;
        }

        int sum = 0;
        String[] numberList = numbers.split(",");
        
        for(String num: numberList) {
        	sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}
