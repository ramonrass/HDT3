
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
    
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
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

