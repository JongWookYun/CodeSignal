package Arcade;

public class Level10 {
	int commonCharacterCount(String s1, String s2) {
	    int[] arr1 = new int[26],
	          arr2 = new int[26];
	    int sum = 0;

	        for(int alphabet : s1.toCharArray()){
	        	arr1[alphabet - 97]++;
	        }
	        for(int alphabet : s2.toCharArray()){
	        	arr2[alphabet - 97]++;
	        }
	        
	        for(int i=0;i<arr1.length;i++){
	        	sum += Math.min(arr1[i], arr2[i]);
	        }
	    return sum; 
	}
}