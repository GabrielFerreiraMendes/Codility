package com.codility.lessons;

public class BinaryGap {

	public int solution(int N) {
        // write your code in Java SE 8
        
        String bin = Integer.toBinaryString(N);
        
        int fIndex = bin.indexOf('1');
        int lIndex = bin.lastIndexOf('1');
        
        if (fIndex != lIndex) {
        	
        	bin = bin.substring(fIndex + 1, lIndex);
        	String[] binArray = bin.split("1");
        	int max = 0;
        	
        	for(int i = 0; i < binArray.length; i++) {
        		
        		if (binArray[i].length() > max) {
        			max = binArray[i].length();
        		} 	        		
        	}
        	
        	return max;
        }
        
        return 0;
    }

}
