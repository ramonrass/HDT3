
import java.io.*;
import java.util.Random;
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
        int ran;
        Random random = new Random();
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Shin\\Documents\\Life\\College\\Y2 S2\\HDT3\\HDT3-master\\HDT3\\DatosRan.txt"));
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
            BufferedReader numerosRandom = new BufferedReader(new FileReader("C:\\Users\\Shin\\Documents\\Life\\College\\Y2 S2\\HDT3\\HDT3-master\\HDT3\\DatosRan.txt"));
            for (int i=0;i<cantidad;i++) {
                //Se almacenan los numeros en una lista
                numeros[i] = Integer.parseInt(numerosRandom.readLine());  
            }}
        catch(Exception e){ System.out.println("Archivo no encontrado");}
        
        // A conticuacion se encuentra el sort
         Sort orden = new Sort();
         orden.setList(numeros);
         orden.InsertionSort();
         Sort quick = new Sort();
         quick.setList(numeros);
         quick.QuickSort(numeros, 0, numeros.length-1);
         
         numeros=quick.getList();
                for (int i=0;i<cantidad;i++){
                System.out.println(numeros[i]); 
            }
    }
    
}
