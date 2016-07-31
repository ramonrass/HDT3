
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Ramón Samayoa
 */
public class Sort implements Comparable {
    
    private int[] numerosArray;
    
    public Sort(){
       numerosArray = new int[2000]; 
    }
    
    @Override   //Metodo para ingresar la lista
    public void setList(int Array[]) {
       numerosArray = Array;
          
    }
    
    @Override//Metodo para obtener lista
    public int[] getList(){
        return numerosArray;
    }

    @Override
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
}