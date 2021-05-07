package StringCalculator;

import java.util.*;

public class StringCalculator {
    
    public int Add(String numbers) {
        if (numbers.length()==0){
            return 0;
        }

        int sum = 0;
        String[] numberListWithCommas = numbers.split("\n");
        
        ArrayList<String> numberList = new ArrayList<String>();
        
        for(String num: numberListWithCommas) {
        	String[] numbersWithoutCommas = num.split(",");
        	List<String> stringList = new ArrayList<String>(Arrays.asList(numbersWithoutCommas));
        	numberList.addAll(stringList);
        }
        
        for(String num: numberList) {
        	sum += Integer.parseInt(num);
        	
        }
        
        return sum;
    }
}
