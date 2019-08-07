package Arcade;

public class Level4 {
	int adjacentElementsProduct(int[] inputArray) {
	    int max = 0;
	    max = inputArray[0]*inputArray[1];
	    
	    for(int i=0;i<inputArray.length;){
	        if(i != 0 && inputArray[i-1]*inputArray[i] > max){
	            max = inputArray[i-1]*inputArray[i];
	        }
	        i++;
	    }
	    return max;
	}
}
