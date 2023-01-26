
public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 7, 3, 9, 1, 4};
		int n = arr.length;
		QuickSort(arr, 0, n-1);
		// print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void QuickSort(int arr[], int low, int high) {
		if(low < high) {
			int pidx = partition(arr, low, high);
			
			// recursive call for pidx-1 && pidx+1
			QuickSort(arr, low, pidx-1);
			QuickSort(arr, pidx+1, high);
		}
	}
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// swap pivot
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
}
// TC = O(nlogn); (it is when the pivot is smallest or largest element in an array
// TC = Avg(n)
// SC = O(1)
