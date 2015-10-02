package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSudokuVerifier {
	
	String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public int isFirstNumberPositive(){
		
		char first = candidateSolution.charAt(0);
		
		if (first > 0){
			
			return 1;
			
		}else
			
		    return -1;

		
	}
	
	
	}
