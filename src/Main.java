import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    static int pass =0;
    static int fail =0;

    public static void main(String[] args) {
        //testBatcher();
        testQuickSort();
    }

    public static void testQuickSort(){
        int[] ne = {3,1,4,1,5,9,2,6};

        QuickSort be = new QuickSort(ne);

        //start timer
        Long startIn=System.currentTimeMillis();
        be.QuickSorter(0,ne.length-1);
        Long endIn=System.currentTimeMillis();
        double tim=(endIn-startIn)/1000.0;
        //end timer
        System.out.println("QuickSorter time: " + tim);

        be.printArr(be.QuickSorter(0,7));
    }

    public static void testBatcher(){
        int[] ne = {3,1,4,1,5,9,2,6};
        Batcher me = new Batcher();
        for(int i =0; i<me.bOddEvenSort(ne).length;i++){
            System.out.print(me.bOddEvenSort(ne)[i]);
        }
        pass++;
    }
}
