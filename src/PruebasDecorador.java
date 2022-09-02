/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ricardosn saavedra
 */
public class PruebasDecorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bebida bebida= new Expresso();
        bebida = new Milk(bebida);
        bebida = new Mocha(bebida);
        
        System.out.println(bebida.cost());
        System.out.println(bebida.getDescripcion());
        
        Bebida bebida2= new Decaf();
        bebida2 = new Soy(bebida2);
        bebida2 = new Mocha(bebida2);
        
        System.out.println(bebida2.cost());
        System.out.println(bebida2.getDescripcion());

        Bebida bebida3= new HouseBlend();
        bebida3 = new Soy(bebida3);
        bebida3 = new Mocha(bebida3);
        
        System.out.println(bebida3.cost());
        System.out.println(bebida3.getDescripcion());         
        
        
    }
    
}
