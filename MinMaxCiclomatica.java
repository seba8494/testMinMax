package MinMaxCiclomatica;

import org.junit.Test;

import minMax.MinMax;

public class MinMaxCiclomatica {
/*
 * CAMINOS BÁSICOS:
 * ABI
 * ABCHI
 * ABCDFHI
 * ABCDFGHI
 * ABCDEHI
 * 
 * */
	
	@Test
	public void CaminoABI() {
		int array [] = null;
		MinMax.minMax(array);
	}
	
	@Test
	public void CaminoABCHI() {
		int array [] = {1};
		MinMax.minMax(array);
	}
	
	@Test
	public void caminoABCDFHI() {
		int array [] = {1,1,1,1};
		MinMax.minMax(array);
	}
	
	@Test
	public void CaminoABCDFGHI() {
		int array [] = {4,3,2,1};
		MinMax.minMax(array);
	}
	
	@Test
	public void CaminoABCDEHI() {
		int array [] = {1,2,3,4};
		MinMax.minMax(array);
	}
	
}
