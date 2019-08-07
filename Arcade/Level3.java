package Arcade;

public class Level3 {
	public boolean isPalindrome(String arr) {
		int p = 0; //0
		int q = arr.length() - 1; //5
		
		while(p < q) {
			if(arr.charAt(p) == arr.charAt(q)) {
				System.out.println(p+"\n"+q);
				p +=1;
				q -=1;
				continue;
			} else {
				return false;
			}
			
		}
		return true;
	}
}