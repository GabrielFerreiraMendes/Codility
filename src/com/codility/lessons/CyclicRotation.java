package com.codility.lessons;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
    	if (A == null || A.length <= 0) {int [] emptyArray = {}; return emptyArray;}		    	
    	
    	for (int cont = 0; cont < K; cont ++) {    	
	    	
    		int aux = A.length;
	    	int[] B = new int[aux];
	    	
	    	B[0] = A[aux - 1];
	    	
	    	for(int i = 0; i < aux; i++) {   		
	    		if (i + 1 < aux) {
	    			B[i + 1] = A[i];
	    		}
	    	}
	    	
	    	A = B.clone();
    	}
    	
    	return A;
    }	
	
}
