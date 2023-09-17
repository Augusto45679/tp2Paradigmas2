package Inmueble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Escritura implements Serializable {
    public Integer numero;
    public int superficie; 
    String domicilio;
     
    //metodo constructor
    public Escritura(Integer numero, int superficie,String domicilio){
     this.domicilio = domicilio; 
     this.numero = numero; 
     this.superficie = superficie;
    } 

    public void guardar() throws IOException {
      
       try{
        
        FileOutputStream f1 = new FileOutputStream("archivo2.txt"); //creamos el archivo 
        ObjectOutputStream o1 = new ObjectOutputStream(f1);  

        o1.writeObject(this);    //El método writeObject() serializa el objeto y lo escribe en el archivo
             // no puedo llamar al objeto de la clase main porque están encapsulados 
                 /*
             * el ObjectOutputStream se utiliza para escribir objetos Java en un flujo de salida, y el FileOutputStream se utiliza para escribir datos en un archivo.
             */
        o1.close(); //cerramos el archivo  
 
       } 
       catch (FileNotFoundException e){ 
        e.printStackTrace(); /* este catch lo hacemos en caso de que no cree el archivo
         * 
            El método printStackTrace() es un método de la clase Throwable que imprime una pila de seguimiento de la excepción.
            Una pila de seguimiento es una lista de las llamadas a métodos que llevaron a la excepción.
         */
       } 
       catch (IOException e){ //en caso de que suceda otro error
        e.printStackTrace(); 
       } 
    } 

    public static Escritura recuperar() throws ClassNotFoundException, IOException { //lo hacemos estatico porque no es necesario crear objetos
        Escritura instanciaRecuperada = null;
        try {
            FileInputStream f2 = new FileInputStream("archivo2.txt"); 
            ObjectInputStream o2 = new ObjectInputStream(f2); 
            
           instanciaRecuperada = (Escritura) o2.readObject(); //el metodo readObject() recupera al archivo  
            o2.close();
        } 
        catch(FileNotFoundException e){
            e.printStackTrace(); 
        } 
        catch(IOException e){
        e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();    
        }
         return instanciaRecuperada;
    }
}