package Inmueble;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
             //creamos registro
             Registro  registro1 = new Registro(2223,"San MArtin",33);
             Registro registro2 = new Registro(2234,"Rivadavia",34);  
              //creamos lotes
          Lote lote1 = new Lote(20202,21,"Alvarez 80 ",23); 
          Lote lote2 = new Lote(20200,34,"Rodriguez 20",24);
          //Integer idPadron, int superficie, String domicilio, float avaluoxmt
          Lote lote3 = new Lote(212.2,"alaa",23);
          //creo una escritura
          
          Escritura escritura1 = new Escritura(1, lote1.superficie,lote1.getDomicilio());
          Escritura escritura2 = new Escritura(2,lote2.superficie,lote2.getDomicilio()); 
                
           registro1.registrar(lote1); 
           registro2.registrar(lote2); 
           registro2.registrar(lote3); 
        
           registro1.emitirBoletos(); 
           registro2.emitirBoletos(); 
           
           //edificio creatiooon 

           Edificio edificio1 = new Edificio(100f,2000f); 
            Edificio edificio2 = new Edificio(200f,55f );
           try{
            lote1.setConstruccion(edificio1 ); 
            lote1.setConstruccion(edificio2);

           } catch(ErrorLote e) {
            System.out.println("Error: "+ e.getMessage()); //  e.getMessage() es un metodo de la clase Throwable
            
           } 

           //acá guardamos un archivo 

           try{
            escritura1.guardar(); 
            System.out.println(" ");
            System.out.println("Se guardo un archivo bonito");
           } catch(IOException e){
            e.printStackTrace(); 
           } 
           
           //acá recuperamos una escritura
           Escritura escrituraRecuperada = null; 

           try{
            escrituraRecuperada = Escritura.recuperar();
            if(escrituraRecuperada != null){
                System.out.println("Instancia de Escritura recuperada con éxito:");
                System.out.println("Número: " + escrituraRecuperada.numero);
                System.out.println("Superficie: " + escrituraRecuperada.superficie);
                System.out.println("Domicilio: "+ escrituraRecuperada.domicilio);
               
            } else{
                System.out.println("No se pudo recuperar la instancia de Escritura.");
            } 

           } 
           catch(IOException | ClassNotFoundException e){
            e.printStackTrace(); 
            System.out.println("Error al recuperar la instancia de Escritura."); 
           }
           

    }
}
