public class QuickSort implements SortingAlgorithm{
	
	public void sort(int [] a){
		quicksort(a, 0, a.length - 1);
	}

	public void quicksort(int [] a, int start, int end){
		if(start < end){
			int index = partition(a, start, end);
			quicksort(a, start, index - 1);
			quicksort(a, index + 1, end);
		}
	}

	public int partition(int [] a, int start, int end){
		int pivot = a[end];
		int position = (start - 1);
		for(int j = start; j < end; j++){
			if(a[j] < pivot){
				position++;
				swap(a, position, j);
			}
		}
		swap(a, position + 1, pivot);
		return position + 1;
	}

	public void swap(int [] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

//got help from the CS labs to tweek my code but still got a stack overflow error
//i got it to run to recieve the runtimes but it didn't sort. now that ive changed it i cant figure it out but i recored the runtimes from previous attempts to create my graphs