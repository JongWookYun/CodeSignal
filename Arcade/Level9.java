package Arcade;

public class Level9 {
	String[] allLongestStrings(String[] inputArray) {
	    
	    int sLength=0,count=0;
		String sCountArr[];
			
		for(int i=0;i<inputArray.length;i++){
		    if(inputArray[i].length() > sLength){
		        sLength = inputArray[i].length();
		    }
		}

		for(int i=0;i<inputArray.length;i++){
		    if(inputArray[i].length() == sLength){
		        count++;
		    }
		}
	    
		sCountArr = new String[count];
		count = 0;
	    
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i].length() == sLength) {
				sCountArr[count] = inputArray[i];
				count++;
			}
		}
	    
	    return sCountArr;
	}
}