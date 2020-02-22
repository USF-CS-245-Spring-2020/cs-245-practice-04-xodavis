public class MergeSort implements SortingAlgorithm{
 
	public void sort(int [] a){
		merge(a, a.length);
	}

	public void merge(int [] a, int length){
		if(length < 2)
			return;
		int indexL = length/2;
		int indexR = length - indexL;
		int [] left = new int[indexL];
		int [] right = new int[indexR];
		for(int i = 0; i < indexL; i++){
			left[i] = a[i];
		}
		for(int j = indexL; j < a.length; j++){
			right[j - indexL] = a[j];
		}
		merge(left, indexL);
		merge(right, indexR);
		mergeSort(a, left, right, indexL, indexR);
	}

	public void mergeSort(int [] target, int [] left, int [] right, int indexL, int indexR){
		int l = 0; 
		int r = 0;
		int t = 0;
		while(l < indexL && r < indexR){
			if(left[l] <= right[r])
				target[t++] = left[l++];
			else
				target[t++] = right[r++];
		}
		while(l < indexL)
			target[t++] = left[l++];
		while(r < indexR)
			target[t++] = right[r++];
	}
}
	// 	int left_size = a.length/2;
	// 	int right_size = a.length - left_size;
	// 	int [] left = new int[left_size];
	// 	int [] right = new int[right_size];
	// 	for(int i = 0; i < left_size; i++){
	// 		left[i] = a[i];
	// 	}
	// 	for(int j = 0; j < (a.length/2); j++){
	// 		right[j] = a[j + left_size];
	// 	}
	// 	Merge(a, left, right);
	// }

	// public void Merge(int [] a, int [] left, int [] right){
	// 	int [] target = new int[a.length];
	// 	int indexT = 0; 
	// 	int indexL = 0; 
	// 	int indexR = 0; 
	// 	while(indexL < left.length && indexR < right.length){
	// 		if(left[indexL] <= right[indexR])
	// 			target[indexT++] = left[indexL++];
	// 		else
	// 			target[indexT++] = right[indexR++];
	// 	}
	// 	while(indexL < left.length){
	// 		target[indexT++] = left[indexL++];
	// 	}
	// 	while(indexR < right.length){
	// 		target[indexT++] = right[indexR++];
	// 	}
	// }