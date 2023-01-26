
public class BubbleSort {

	public static void main(String[] args) {
		
		
		int arr[] = {2, 5, 7, 3, 9, 1, 4};	
		int n = arr.length;
				
		bubbleSort(arr);
		// print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
				
	}
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

// it's TC = O(n^2>;
// it requires n-1 passes
// it is a stable algorithm
// SC = O(1);
