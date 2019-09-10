package Arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level12 {
	int[] sortByHeight(int[] a) {

	    int[] temp = a.clone();
	    Arrays.sort(a);
	    List<Integer> list = new ArrayList<Integer>();
	    for(int n: a){
	        if(n != -1){
	            list.add(n);
	        }
	    }
	    for(int i=0,j=0;i<temp.length;i++){
	        if(temp[i] != -1){
	            temp[i] = list.get(j);
	            j++;
	        }
	    }
	    return temp;
	}
}
