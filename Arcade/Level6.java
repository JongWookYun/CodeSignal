package Arcade;

public class Level6 {
	int makeArrayConsecutive2(int[] statues) {
	    int min=statues[0],
			max=statues[0];
			
		for(int i=0;i<statues.length;i++) { 
			if(min > statues[i]){	//Find Minimum Value
				min = statues[i];
			}
			if(max < statues[i]) {	//Find Maximum Value
				max = statues[i];
			}
		}
	    return (max-min+1)-statues.length;
	}
}
