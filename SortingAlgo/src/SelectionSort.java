
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 5, 7, 3, 9, 1, 4};	
		int n = arr.length;
		
		selectionSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[minIndex]) minIndex = j;
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}

// TC = O(n^2);
// SC = O(1);
// no of comparison = n(n-1)/2;
// it is not stable algorithm
//  it is non adaptive