public class HeapSort {
    int[] heap;

    public void BinaryHeap(int n){
        heap = new int[n];
    }
    public void insert(int m){
        int[] temp = new int[heap.length+1];
        int acc = 0;
        for(int i = 0; i<heap.length; i++){
            temp[i] = heap[i];
            acc++;
        }
        temp[acc++] = m;
        heap = temp;

    }

    public void delete(){

    }

}
