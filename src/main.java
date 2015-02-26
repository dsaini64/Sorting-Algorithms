
public class main {
	
	public static void main(String[] args){
		
		int[] a = {9, 60, 100, 3, 45, 56, 32, 31, 63, 26, 16};
		
		sortingAlgorithms s = new sortingAlgorithms();
		
		//s.printSorted(s.bubbleSort(a));
		//s.printSorted(s.insertionSort(a));
		s.printSorted(s.selectionSort(a));
	}

}
