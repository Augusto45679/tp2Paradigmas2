package Inmueble;

public class Lote {
    public Integer idPadron; 
    public int superficie;
    public Registro inscripto;
    private String domicilio; 
    private float avaluoxmt; 
    private Edificio construccion;
     //metodo constructor

    public Lote(Integer idPadron, int superficie, String domicilio, float avaluoxmt) {
        this.idPadron = idPadron;
        this.superficie = superficie;
        this.domicilio = domicilio;
        this.avaluoxmt = avaluoxmt;
    }
    
    //metodos 2
    
    public Lote(double d, String string, int i) {
    }

    public void Lote(){
        
    }
    public float valuar(){
        return superficie*avaluoxmt; 
    }

    public Integer getIdPadron() {
        return idPadron;
    }

    public void setIdPadron(Integer idPadron) {
        this.idPadron = idPadron;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }

    public void setAvaluoxmt(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }
    
    public void setConstruccion(Edificio construccion) throws ErrorLote{
        if(this.construccion == null){
            this.construccion = construccion;
        } else{
           throw new ErrorLote("No se puede asignar más de un edificio a un lote");
        } 
        
    }
}
