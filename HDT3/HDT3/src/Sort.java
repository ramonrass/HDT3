
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
        Lista<Integer> lista;
  
   
   public Lista<Integer> InsertionSort(Lista<Integer> lis){
      int i, j, nuevoValor;
      int[] arr = new int[lis.getLargo()];
      Nodo valor = lis.getTop();
      for (i=0; i < lis.getLargo(); i++) {
          arr[i] = (Integer)valor.getValor();
          valor = valor.getSiguiente();
      }
      
      for (i=1; i < arr.length; i++) {
            nuevoValor = arr[i];
            for (j=i -1; j>=0 && nuevoValor<arr[j]; j--) {
                  arr[j+1] = arr[j];
            }
        arr[j+1] = nuevoValor;
        }
      
      Lista orden = new Lista();
      for (i=0; i < lis.getLargo(); i++) {
          orden.addNodo(arr[i]);
      }
      
      return orden;
    }
    
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
    
    public void QuickSort(Lista<Integer> lis,int bajo,int alto){
        int mitad = bajo + (alto - bajo)/2;
        Nodo nTemp=lis.getTop();
        Nodo nBajo=lis.getTop(), nAlto=lis.getTop();
        for (int i=0;i<mitad;i++){
            nTemp=nTemp.getSiguiente();
        }
        
        int i=bajo;
            for (int a=0;a<i;a++){
                nBajo=nBajo.getSiguiente();
            }
        int j=alto;
            for (int a=0;a<j;a++){
                nAlto=nAlto.getSiguiente();
            }
        while(i<=j){
            while (nBajo.getValor().compareTo(nTemp.getValor())<0){
                i++;
                nBajo=nBajo.getSiguiente();
            }
            while (nAlto.getValor().compareTo(nTemp.getValor())>0){
                j--;
                nAlto=nAlto.getAnterior();
            }
            if (i <= j){
                Comparable mov = nBajo.getValor();
                nBajo.setValor(nAlto.getValor());
                nAlto.setValor(mov);
                i++;
                nBajo=nBajo.getSiguiente();
                j--;
                nAlto=nAlto.getAnterior();
            
            }
        
        }
        
        if (bajo < j){
            QuickSort(lis,bajo,j);
        }
        if (alto > i){
            QuickSort(lis,i,alto);
        }
        lista=lis;
    }

    public Lista<Integer> getLista() {
        return lista;
    }

    public void setLista(Lista<Integer> lista) {
        this.lista = lista;
    }
    
    
}