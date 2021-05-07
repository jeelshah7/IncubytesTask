package StringCalculator;

import java.util.*;

public class StringCalculator {
    
    public int Add(String numbers) {
        if (numbers.length()==0){
            return 0;
        }
        String delimiter = "";
        int sum = 0;
        
        if(numbers.startsWith("//")) {
        	String delimeter = numbers.substring(2);
        	delimeter = delimeter.substring(0, delimeter.indexOf("\n"));
        	numbers = numbers.substring(numbers.indexOf("\n")+1,numbers.length());
        	sum = addWithDelimeter(numbers,delimeter);
   
        }else {
        	sum = addWithDelimeter(numbers,",");
        }
        
        return sum;
    }
    
    public int addWithDelimeter(String numbers,String delimeter) {
    	int sum = 0;
    	String[] numberListWithDelimeter = numbers.split("\n");
    	
        ArrayList<String> numberList = new ArrayList<String>();
        for(String num: numberListWithDelimeter) {
        	String[] numbersWithoutDelimeter = num.split(delimeter);
        	List<String> stringList = new ArrayList<String>(Arrays.asList(numbersWithoutDelimeter));
        	numberList.addAll(stringList);
        }
        
        for(String num: numberList) {
        	sum += Integer.parseInt(num);
        }
        return sum;
    }
}
