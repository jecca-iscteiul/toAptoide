package testeUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import ex.NumCurto;

public class Testing {

	@Test
	public void test1() {
		int[] array = new int[4];
		array[0]=1;
		array[1]=3;
		array[2]=7;
		array[3]=0;
		
		NumCurto ex = new NumCurto();
		int output_espera=0;
		assertEquals(output_espera,ex.start2(array));
	}
	
	@Test
	public void test2() {
		int[] array = new int[4];
		array[0]=2;
		array[1]=3;
		array[2]=-1;
		array[3]=10;
		
		NumCurto ex = new NumCurto();
		int output_espera=-1;
		assertEquals(output_espera,ex.start2(array));
	}
	
	@Test
	public void test3() {
		int[] array = new int[4];
		array[0]=1;
		array[1]=3;
		array[2]=-1;
		array[3]=10;
		
		NumCurto ex = new NumCurto();
		int output_espera=1;
		assertEquals(output_espera,ex.start2(array));
	}

}
