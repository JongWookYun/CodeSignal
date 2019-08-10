package Arcade;

public class Level7 {
	boolean almostIncreasingSequence(int[] sequence) {
		int SeqIntCount = 0;
		  
		for(int i=1;i<sequence.length;i++){
			if(sequence[i-1]>=sequence[i]){
				SeqIntCount++;
				if(SeqIntCount>1){
					return false;
				}
				try{
					if (sequence[i-2] >= sequence[i] && sequence[i-1] >= sequence[i+1]){
						return false;
		        	}
				}catch(Exception e){}
			}
		}
		return true;
	}
}
