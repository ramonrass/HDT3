
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Ramón Samayoa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int cantidad=2000;//Cantidad de datos que se van a ordenar
        int[] numeros = new int[cantidad];
	try{
            BufferedReader numerosRandom = new BufferedReader(new FileReader("C:\\Users\\Ramón Samayoa\\Dropbox\\UVG\\2D0 AÑO\\2DO SEMESTRE\\Algoritmos y Estructura de Datos\\HDT3\\Datos.txt"));
            for (int i=0;i<cantidad;i++) {
                //Se almacenan los numeros en una lista
                numeros[i] = Integer.parseInt(numerosRandom.readLine());  
            }}
        catch(Exception e){ System.out.println("Archivo no encontrado");}
        
        // A conticuacion se encuentra el sort
         Sort orden = new Sort();
         orden.setList(numeros);
         orden.InsertionSort();
         
         numeros=orden.getList();
                for (int i=0;i<cantidad;i++){
                System.out.println(numeros[i]); 
            }
    }
    
}
