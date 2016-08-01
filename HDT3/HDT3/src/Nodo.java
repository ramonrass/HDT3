
/**
 * Clase Nodo
 * @author Ramón Samayoa, Diego Valdez, Mario Lara, Sang Wo Shin Ji
 * @version 31.07.2016
 * @param <T>
 */
public class Nodo<T extends Comparable>
{
    T Valor;
    
    Nodo Siguiente;
    Nodo Anterior;
    
    public Nodo(T valor)
    {
        this.Valor = valor;
       
    }
    
    /**
     *
     * @param valor: T
     * Recibe para atributo Valor
     */
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    /**
     *
     * @return Valor: T
     * Regresa atributo Valor
     */
    public T getValor()
    {
        return this.Valor;
    }  
    
    /**
     *
     * @param anterior : Nodo
     * mete el nodo anterior
     */
    public void setAnterior(Nodo anterior)
    {
        this.Anterior= anterior;
    }
    
    /**
     *
     * @return Anterior: Nodo
     * Mete el valor del nodoo anterior
     */
    public Nodo getAnterior()
    {
        return this.Anterior;
    }
    
    /**
     *
     * @param siguiente : Nodo
     * mete el nodo siguiente
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    /**
     *
     * @return Siguiente: Nodo
     * Mete el valor del nodo siguiente
     */
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    @Override
    public String toString()
    {
        return  Valor.toString();
    }
    
    public int compareTo(T other)
    {
        return Valor.compareTo(other);
    }
}

