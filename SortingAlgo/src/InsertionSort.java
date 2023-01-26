
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 5, 7, 3, 9, 1, 4};	
		int n = arr.length;
		
		insertionSort(arr);
		// print 
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
// TC = O(n^2);
// no of comparison = n(n-1)/2;
// SC = O(1);
// (n-1)passes required 
