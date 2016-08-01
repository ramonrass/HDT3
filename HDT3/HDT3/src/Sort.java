
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ramón Samayoa
 */
public class Sort implements Comparable<Sort>{
    
    private int[] numerosArray;
    
    public Sort(){
       numerosArray = new int[2000]; 
    }
    
        public void setList(int Array[]) {
       numerosArray = Array;
          
    }
    
//Metodo para obtener lista
    public int[] getList(){
        return numerosArray;
    }


    //Sacado de http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
    public void InsertionSort(){
      int i, j, nuevoValor;
      for (i=1; i < numerosArray.length; i++) {
            nuevoValor = numerosArray[i];
            for (j=i -1; j>=0 && nuevoValor<numerosArray[j]; j--) {
                  numerosArray[j+1] = numerosArray[j];
            }
            numerosArray[j+1] = nuevoValor;
      } 
    }
    //Sacado de http://www.programcreek.com/2012/11/quicksort-array-in-java/
    public void QuickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
                return;

        if (low >= high)
                return;
        //busca el pivote
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        //busca y compara entre las particiones con el pivote
        int i = low, j = high;
        while (i <= j) {
                while (arr[i] < pivot) {
                        i++;
                }

                while (arr[j] > pivot) {
                        j--;
                }

                if (i <= j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                }
        }
        //Recursiva de listas mas pequeñas
        if (low < j)
                QuickSort(arr, low, j);

        if (high > i)
                QuickSort(arr, i, high);

        numerosArray = arr;
    }
    
    public int compareTo(Sort list){
        for (int i=1;i<list.getList().length;i++){
            if (list.getList()[i]<list.getList()[i-1]){
                return 0;
            }
        }
        return 1;
    }
}