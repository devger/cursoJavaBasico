
public class bloque43 {

	static public void main (String[] arg) {
		
		int[] vector = {2,3,4,2,32434,34,4,4,3,233,2,321,1,0};
		int temporal;
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i] +" "); 
		}
		System.out.println("");
		
		for(int i=0; i<vector.length; i++) {
			for(int j=i+1; j<vector.length; j++) {
				if(vector[i]<vector[j]){
					temporal = vector[i];
					vector[i] = vector[j];
					vector[j] = temporal;
				}
			}
		}
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i] +" ");
		}
		System.out.println("");
	}
	
}
