
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Clase Lista
 * @author Ramón Samayoa, Diego Valdez, Mario Lara, Sang Wo Shin Ji
 * @version 31.07.2016
 * @param <T>
 */
public class Lista<T> {

    private Nodo top;
    private int largo;
    public Lista(){
        top = null;
        largo = 0;
    }
    
    /**
     *
     * @return largo: int
     * returna el largo de la lista
     */
    public int getLargo() {
        return this.largo;
    }
    
    /**
     *
     * @param size : int
     * Le da el tamaño al largo
     */
    public void setLargo(int size) {
        this.largo=size;
    }

    /**
     *
     * @return top: Nodo
     * Regrese el nodo Top
     */
    public Nodo getTop(){
        return this.top;
    }
    
    /**
     *
     * @param node: Nodo
     * Para meter atributo top
     */
    public void setTop(Nodo node){
        this.top=node;
    }
    
    /**
     *
     * @param val : T
     * Aniadir otro elemento a la lista
     */
    public void addNodo(T val){
        if (top== null){
            top = new Nodo((Comparable) val);
            largo++;
        }else{
            Nodo temp;
            temp = top;
            while (temp.getSiguiente()!=null){
                temp = temp.getSiguiente();                
            }
            Nodo neNo = new Nodo((Comparable)val);
            temp.setSiguiente(neNo);
            largo++;
        }
    }
    public void imprimir(){
        if (top== null){
            System.out.println("La lista esta vacia");
        }else{
            Nodo temp;
            temp = top;
            while (temp.getSiguiente()!=null){
                System.out.println(temp);
                temp = temp.getSiguiente();
            }
            System.out.println(temp);
        }
    }
    
    public boolean isEmpty() {
        return  largo==0;
    }
        
}
