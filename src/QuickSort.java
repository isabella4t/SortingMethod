public class QuickSort {

    int[] sortme = new int[0];

    public QuickSort(int arr[]){sortme=arr;}

//recursive method to keep sorting
    public int[] QuickSorter(int low, int high){
        if(low>high){
            int pi = Partition(low,high);
            QuickSorter(low,pi-1);
            QuickSorter(pi+1,high);

        }
        return sortme;
    }


    public int Partition(int low, int high){
        int pivot = sortme[high];
        int i = low-1;
        for(int j =0; j<sortme.length;j++){
            //if element is smaller than pivot
            if(sortme[j]<pivot){
                i++; // swap places
                int temp = sortme[j];
                sortme[j] = sortme[i];
                sortme[i] = temp;
            }
        }
        int tmp = sortme[high];
        sortme[high] = sortme[i+1];
        sortme[i+1]= tmp;
        return (i+1);

//https://www.geeksforgeeks.org/quick-sort/
    }

    public void printArr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}
