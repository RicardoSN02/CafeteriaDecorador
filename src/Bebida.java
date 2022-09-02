/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricardosn saavedra
 */
public class Bebida implements IBebida{
    private String descripcion;
    private float cost;
    
    public Bebida() {
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public float cost() {
        return cost;
    }
}
