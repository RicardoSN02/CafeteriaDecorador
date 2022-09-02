/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricardosn saavedra
 */
public class Mocha extends DecoradorCondimento {
    
    public Mocha(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public float cost(){
        return super.getBebida().cost()+25;
    }
    
    @Override
    public String getDescripcion(){
        return super.getBebida().getDescripcion()+" con mocha";
    }
    
    
}
