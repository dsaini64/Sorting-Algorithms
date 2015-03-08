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
		
		for(int j = 0; j < a.length; j++){
			
			for(int i = j; i > 0 && a[i] < a[i-1]; i--){
				int iValue = a[i];
				a[i] = a[i-1];
				a[i-1] = iValue;
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
	
	
	public int[] mergeSort(int[] a){
		
		if(a.length < 2){
			return a;
		}
		
		int[] firstHalf = new int[a.length/2];
		int[] secondHalf = new int[(a.length+1)/2];
				
		for(int i = 0; i < firstHalf.length;i++){
			firstHalf[i] = a[i];	
		}		
		
		for(int i = 0; i < secondHalf.length;i++){
			secondHalf[i] = a[i + firstHalf.length];	
		}
		
		mergeSort(firstHalf);
		mergeSort(secondHalf);
		
		int ind1 = 0;
		int ind2 = 0;
		
		for(int i = 0; ind1 < firstHalf.length && ind2 < secondHalf.length ; i++){
			
			if(firstHalf[ind1] <= secondHalf[ind2]){
				a[i] = firstHalf[ind1];
				ind1++;
			}
			else{
				a[i] = secondHalf[ind2];
				ind2++;
			}
		}
		
		if(ind1 != firstHalf.length){
			for(int i = ind1; i < firstHalf.length;i++){
				a[i + secondHalf.length] = firstHalf[i];
			}
		}else{
			for(int i = ind2; i < secondHalf.length;i++){
				a[i + firstHalf.length] = secondHalf[i];
			}
		}
		
		return a;
		
		
		
	}
		
	
	public void printSorted(int[] a){
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
	}
}
