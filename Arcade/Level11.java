package Arcade;

public class Level11 {
	boolean isLucky(int n) {
	    String s = String.valueOf(n);
		int firstIndex = 0,
			lastIndex = s.length() - 1;
		int sum = 0;
			
		while(lastIndex > firstIndex) {
			sum += s.charAt(firstIndex) - s.charAt(lastIndex);
			firstIndex++;
	        lastIndex--;
		}
		return sum == 0;
	}
}
