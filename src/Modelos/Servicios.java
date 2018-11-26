
package Modelos;

import java.io.Serializable;

public class Servicios implements Serializable{
    
    private String terminal;
    private String motonave;
    private String lloydEscala;
    private String UVI;
    private String referencia;
    private String muelle;
    private String grua;
    private String fechacitacion;
    private String horacitacion;
    private String fechafinal;
    private String horafinal;
    private String horasOperacion;
    private String servicio;


    public Servicios() {
    }

    public Servicios(String terminal, String motonave, String lloydEscala, String UVI, String referencia, String muelle, String grua, String fechacitacion, String horacitacion, String fechafinal, String horafinal, String horasOperacion, String servicio) {
        this.terminal = terminal;
        this.motonave = motonave;
        this.lloydEscala = lloydEscala;
        this.UVI = UVI;
        this.referencia = referencia;
        this.muelle = muelle;
        this.grua = grua;
        this.fechacitacion = fechacitacion;
        this.horacitacion = horacitacion;
        this.fechafinal = fechafinal;
        this.horafinal = horafinal;
        this.horasOperacion = horasOperacion;
        this.servicio = servicio;
    }

    /**
     * @return the terminal
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    /**
     * @return the motonave
     */
    public String getMotonave() {
        return motonave;
    }

    /**
     * @param motonave the motonave to set
     */
    public void setMotonave(String motonave) {
        this.motonave = motonave;
    }

    /**
     * @return the lloydEscala
     */
    public String getLloydEscala() {
        return lloydEscala;
    }

    /**
     * @param lloydEscala the lloydEscala to set
     */
    public void setLloydEscala(String lloydEscala) {
        this.lloydEscala = lloydEscala;
    }

    /**
     * @return the UVI
     */
    public String getUVI() {
        return UVI;
    }

    /**
     * @param UVI the UVI to set
     */
    public void setUVI(String UVI) {
        this.UVI = UVI;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the muelle
     */
    public String getMuelle() {
        return muelle;
    }

    /**
     * @param muelle the muelle to set
     */
    public void setMuelle(String muelle) {
        this.muelle = muelle;
    }

    /**
     * @return the grua
     */
    public String getGrua() {
        return grua;
    }

    /**
     * @param grua the grua to set
     */
    public void setGrua(String grua) {
        this.grua = grua;
    }

    /**
     * @return the fechacitacion
     */
    public String getFechacitacion() {
        return fechacitacion;
    }

    /**
     * @param fechacitacion the fechacitacion to set
     */
    public void setFechacitacion(String fechacitacion) {
        this.fechacitacion = fechacitacion;
    }

    /**
     * @return the horacitacion
     */
    public String getHoracitacion() {
        return horacitacion;
    }

    /**
     * @param horacitacion the horacitacion to set
     */
    public void setHoracitacion(String horacitacion) {
        this.horacitacion = horacitacion;
    }

    /**
     * @return the fechafinal
     */
    public String getFechafinal() {
        return fechafinal;
    }

    /**
     * @param fechafinal the fechafinal to set
     */
    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    /**
     * @return the horafinal
     */
    public String getHorafinal() {
        return horafinal;
    }

    /**
     * @param horafinal the horafinal to set
     */
    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    /**
     * @return the horasOperacion
     */
    public String getHorasOperacion() {
        return horasOperacion;
    }

    /**
     * @param horasOperacion the horasOperacion to set
     */
    public void setHorasOperacion(String horasOperacion) {
        this.horasOperacion = horasOperacion;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public boolean empiezaPor(String inicio){
        
        if(inicio.isEmpty() || inicio.length()>referencia.length())
            return false;
        for (int i = 0; i < inicio.length(); i++) 
            if(inicio.charAt(i) != referencia.charAt(i))
               return false;
        return true;
        
    }
    
    public boolean empiezaPor2(String inicio){
        
        if(inicio.isEmpty() || inicio.length()>servicio.length())
            return false;
        for (int i = 0; i < inicio.length(); i++) 
            if(inicio.charAt(i) != servicio.charAt(i))
               return false;
        return true;
        
    }
    
    
}
