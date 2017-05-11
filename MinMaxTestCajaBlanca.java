package MinMaxTestCajaBlanca;

import org.junit.Test;
import minMax.MinMax;

public class MinMaxTestCajaBlanca {
	
	@Test
	public void statementeCoverage(){
		MinMax m = new MinMax();
		int array [] = {32,13,33,1};
		MinMax.minMax(array);
	}
	
	@Test
	public void decisionCoverage(){
		MinMax m = new MinMax();
		int array [] = {5,7,2,6};
		int arrayVacio [] = null;
		MinMax.minMax(array);
		MinMax.minMax(arrayVacio);
	}
	
	@Test
	public void conditionCoverage(){
		MinMax m = new MinMax();
		int array [] = {5,7,2,6};
		int arrayVacio [] = null;
		int arrayVacio2 [] = {};
		MinMax.minMax(array);
		MinMax.minMax(arrayVacio);
		MinMax.minMax(arrayVacio2);
	}
	
	@Test
	public void desicionConditionCoverage(){
		MinMax m = new MinMax();
		int array [] = {5,7,2,6};
		int arrayVacio [] = null;
		int arrayVacio2 [] = {};
		MinMax.minMax(array);
		MinMax.minMax(arrayVacio);
		MinMax.minMax(arrayVacio2);
	}
	
}
