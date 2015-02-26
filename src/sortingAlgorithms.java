import java.util.Arrays;


public class sortingAlgorithms {
	
	
	public int[] bubbleSort(int[] a){
	
			for(int j = 0; j < a.length - 1; j++){
			
				for(int i = 0; i < a.length - 1; i++){
				
					if(a[i] > a[i+1]){
						int iPlus1Value = a[i+1];
						a[i+1] = a[i];
						a[i] = iPlus1Value;
					}
				
				}
			
			}
			
			return a;
	}
	
	public int[] insertionSort(int[] a){
		
		for(int j = 0; j < a.length - 1; j++){
			
			for(int i = a.length - 2; i > -1; i--){
				
				if(a[i] > a[i+1]){
					int iPlus1Value = a[i+1];
					a[i+1] = a[i];
					a[i] = iPlus1Value;
				}
			}
		}
		
		return a;
	}
	
	public int[] selectionSort(int [] a){
		
		for(int j = 0; j < a.length - 1; j++){
			
			int smallest = a[a.length - 1];
			int index = a.length - 1;
			
			
			for(int i = j; i < a.length - 1; i++){
			
				if(a[i] < smallest){
					
					smallest = a[i];
					index = i;
					
				}
			}
			
			
			a[index] = a[j];
			a[j] = smallest;
			
		}
		
		return a;
	}
		
	
	public void printSorted(int[] a){
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		
		
	}

}
