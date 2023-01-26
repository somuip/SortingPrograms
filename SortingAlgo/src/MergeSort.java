
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 7, 8, 15, 25};
		int arr2[] = {6, 8, 15, 35, 45, 50};
		
		mergeSort(arr1, arr2);

	}
	public static void mergeSort(int arr1[], int arr2[]) {
		int m = arr1.length;
		int n = arr2.length;
		int ans[] = new int[m+n];
		int i=0, j=0,k=0;
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			}
			else {
				ans[k++] = arr2[j++];
			}
		}
		// if any one array is empty
		while(i<m) {
			ans[k++] = arr1[i++];
		}
		while(j<n) {
			ans[k++] = arr2[j++];
		}
		
		// print ans array
	    print(ans);
	}
	public static void print(int ans[]) {
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}

// TC = O(NlogN);
// SC = O(N+M);
// it is the most optimized sorting algo compare to other sorting algo's
