public class Batcher {
    // batcher takes 2, and swaps

    public Batcher(){}

    public int[] bOddEvenSort(int[] list){
        //takes pairs of two and see if they flip
        int sorttime = 0;

        //even ind
        for(int i = 0; i<list.length-1;i=i+2){
            //if former is greater than latter, flip
            if(list[i]>list[i+1]){
                int temp = list[i+1];
                list[i+1] = list[i];
                list[i] = temp;
                sorttime++;
            }
        }
        //odd ind
        for(int i = 1; i<list.length-1;i=i+2){
            if(list[i]>list[i+1]){
                int temp = list[i+1];
                list[i+1] = list[i];
                list[i] = temp;
                sorttime++;
            }
        }
        //if no sorts happen, return
        if(sorttime==0) return list;
        else return bOddEvenSort(list);
    }
}
