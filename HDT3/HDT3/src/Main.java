
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase Main
 * @author Ramón Samayoa, Diego Valdez, Mario Lara, Sang Wo Shin Ji
 * @version 31.07.2016
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Lista<Integer> list = new Lista();
        Lista<Integer> listPrint = new Lista();
        int cantidad=2000;//Cantidad de datos que se van a ordenar
	try{
            BufferedReader numerosRandom = new BufferedReader(new FileReader("C:\\Users\\Diego Valdez\\Desktop\\Algoritmos y Estructura de Datos\\HDT3\\Datos.txt"));
            for (int i=0;i<cantidad;i++) {
                list.addNodo(Integer.parseInt(numerosRandom.readLine()));
            }
        }
        catch(Exception e){ System.out.println("Archivo no encontrado");}
        Sort orden = new Sort();
        //A conticuacion se encuentra el sort
        System.out.println("--------------------------------------");
        System.out.println("Insertion Sort:");
        
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Merge Sort:");
        listPrint=orden.mergeSort(list);
        listPrint.imprimir();
        System.out.println("--------------------------------------");
    }
    
}
