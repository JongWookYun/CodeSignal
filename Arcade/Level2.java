package Arcade;

public class Level2 {
	int centuryFromYear(int year) {
	    int century = 0;
	    century = year / 100;
	    if(year % 100 > 0){
	        century++;
	    }
	    return century;
	}
}
