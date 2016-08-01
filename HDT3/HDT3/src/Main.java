
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

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
        int cantidad=10;//Cantidad de datos que se van a ordenar
        File dir = new File(".");
        int ran;
        Random random = new Random();
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(dir.getCanonicalPath()+File.separator + "Datos.txt"));
                for (int i=0;i<cantidad;i++) {
                    ran=random.nextInt(4000);
                    escritor.write(Integer.toString(ran));
                    escritor.newLine();
                }
                escritor.close();
        }
        catch(Exception e){ 
            System.out.println("Archivo no encontrado");
        }
	try{
            BufferedReader numerosRandom = new BufferedReader(new FileReader(dir.getCanonicalPath()+File.separator + "Datos.txt"));
            for (int i=0;i<cantidad;i++) {
                list.addNodo(Integer.parseInt(numerosRandom.readLine()));
            }
        }
        catch(Exception e){ System.out.println("Archivo no encontrado");}
        Sort orden = new Sort();
        //A conticuacion se encuentra el sort
        System.out.println("--------------------------------------");
        System.out.println("Insertion Sort:");
        listPrint=orden.InsertionSort(list);
        listPrint.imprimir();
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Merge Sort:");
        listPrint=orden.mergeSort(list);
        listPrint.imprimir();
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("Quick Sort:");
        orden.QuickSort(list,0,list.getLargo()-1);
        listPrint=orden.getLista();
        listPrint.imprimir();
        System.out.println("--------------------------------------");
    }
    
}
