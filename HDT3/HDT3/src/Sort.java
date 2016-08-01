
/**
 * Clase Sort
 * @author Ramón Samayoa, Diego Valdez, Mario Lara, Sang Wo Shin Ji
 * @version 31.07.2016
 */
public class Sort{
    
    /**
     * Constructor
     */
    public Sort(){
    }
    
  
    //Sacado de http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
   /* public void InsertionSort(){
      int i, j, nuevoValor;
      for (i=1; i < numerosArray.length; i++) {
            nuevoValor = numerosArray[i];
            for (j=i -1; j>=0 && nuevoValor<numerosArray[j]; j--) {
                  numerosArray[j+1] = numerosArray[j];
            }
            numerosArray[j+1] = nuevoValor;
      } 
    }*/
    
    
    /**
     * 
     * @param lis : Lista
     * @return lis, temp : Lista
     * MergeSort
     */
    public Lista<Integer> mergeSort(Lista<Integer> lis){
        int tam=lis.getLargo();
        if (lis.getLargo() <= 1){
            return lis;
        }else{
            Nodo nTemp= lis.getTop();
            Lista<Integer> lis1 = new Lista();
            Lista<Integer> lis2 = new Lista();
            for (int i=0; (i<lis.getLargo()/2);  i++){
                lis1.addNodo((Integer)nTemp.getValor());
                nTemp= nTemp.getSiguiente();
            }
            while (nTemp!=null){
                lis2.addNodo((Integer)nTemp.getValor());
                nTemp= nTemp.getSiguiente();
            }
            lis1=mergeSort (lis1);
            lis2=mergeSort (lis2);
            
            Lista<Integer> temp = new Lista();
            Nodo nod1= lis1.getTop();
            Nodo nod2= lis2.getTop();
            while ((nod1!=null)&&(nod2!=null)){
                if ((nod1.getValor().compareTo(nod2.getValor()))<0){
                    temp.addNodo((Integer)nod1.getValor());
                    nod1=nod1.getSiguiente();
                }else{
                    temp.addNodo((Integer)nod2.getValor());
                    nod2=nod2.getSiguiente();
                }
            }
            while (nod1!=null){
                temp.addNodo((Integer)nod1.getValor());
                nod1=nod1.getSiguiente();
            }
            while (nod2!=null){
                temp.addNodo((Integer)nod2.getValor());
                nod2=nod2.getSiguiente();
            }
            return temp;
        }
    }
}