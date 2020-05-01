package ex;

public class NumCurto {

	private static final int VALORBASE=0;
	
	public NumCurto() {
		
	}
	
	public int start(int[] array) {
		System.out.println("Start");
		int resposta=array[0];
		for(int i=1; i!= array.length;i++) {
			if(array[i] < resposta) {
				if(array[i]>=0) {
					resposta=array[i];
				}else {
					if(array[i]*(-1) == resposta) {
						
					}else {
						resposta = (array[i]*(-1) < resposta) ? array[i]*(-1) : resposta;
					}
				}
			}
		}
		System.out.println(resposta);
		return resposta;
	}
	
	public int start2(int[] array) {
		int resposta = array[0];
		for(int i=1; i!= array.length; i++) {
			if(array[i]<resposta) {
				if(array[i]>=0) {
					resposta=array[i];
				}else {
					if(array[i]*(-1) != resposta) {
						if(array[i]*(-1)<resposta) {
							resposta=array[i];
						}
					}
				}
				
			}
		}
		
		System.out.println(resposta);
		return resposta;
	}
	
}
