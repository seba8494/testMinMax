package MinMaxTestCajaNegra;

import static org.junit.Assert.*;

import org.junit.Test;
import minMax.MinMax;

public class MinMaxTestCajaNegra {
	@Test
	public void pasarArrayDevuelveMinimoYMaximoCorrectamente() {
		int array [] = {4,13,51,4};
		assertArrayEquals( new int []{4,51} , MinMax.minMax(array));
	}
	
	@Test
	public void pasarArrayConNumerosNegativosDevuelveMinimoYMaximo(){
		int array [] = {-4,-13,-51,-4};
		assertArrayEquals( new int []{-51,-4} , MinMax.minMax(array));
	
	}
	
	@Test
	public void MinimoYMaximoCoinciden() {
		int array [] = {1,1,1,1};
		assertArrayEquals( new int []{1,1} , MinMax.minMax(array));
	}
	
	@Test
	public void pasarArrayVacioDevuelveArrayNulo() {
		int array [] = null;
		assertEquals(null, array);
	}
	
	@Test
	public void pasarArrayConUnElementoDevuelveElElementoComoMaxYMin(){
		int array [] = {-1};
		assertArrayEquals( new int []{-1,-1} , MinMax.minMax(array));
	}
	
}
