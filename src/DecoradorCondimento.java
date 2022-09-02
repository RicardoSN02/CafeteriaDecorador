/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricardosn saavedra
 */
public class DecoradorCondimento extends Bebida{
    
    public Bebida bebida;
    public String descripcion;
    
    public DecoradorCondimento(Bebida bebida) {
        this.bebida = bebida;
    }

    protected Bebida getBebida(){
        return this.bebida;
    }    
    
    
    
}
