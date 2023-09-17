package Inmueble;

import java.util.ArrayList;

public class PH extends Edificio{

    public PH(float avaluoXmtr, float avaluo) {
        super(avaluoXmtr, avaluo);
        //TODO Auto-generated constructor stub
    }
    public byte cantPisos; 
    public ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>(); 
    //esta seria la composicion y solo el tipo de objetos que te va a permitir recirbir son de tipo Departamento
    public ArrayList<Departamento> unidad = new ArrayList<>(); // relacion 1..n

    public void PH(){
        
    }
    public void valuar(){

    }
}
