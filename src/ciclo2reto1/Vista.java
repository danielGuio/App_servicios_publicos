package ciclo2reto1;

import java.util.Scanner;

public class Vista {
 
    Scanner leer = new Scanner(System.in);
    private int servicio;
 
    public int menu(){
        System.out.println("PAGO DE SERVICIOS PÚBLICOS");
        System.out.println("Seleccione el servicio público:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");        
        servicio = leer.nextInt();
        return servicio;
    }
    
    public int estrato(){
        int estrato;  
        System.out.println("Estrato del inmueble:");
        estrato = leer.nextInt();
        return estrato;
    }
    
    public int consumo(){
        int consumo;
        System.out.println("Consumo del inmueble:");
        consumo = leer.nextInt();
        return consumo;
    }
    
    public void imprimirconsumo(int consumo){
        System.out.println("El consumo fue: " + consumo);
    }
    
    public void imprimirvalorUnidad(double valorUnidad){
        System.out.println("Valor unidad: " + valorUnidad);
    }
    
    public void imprimirestrato(int estrato){
        System.out.println("Estrato del inmueble: " + estrato);
    }
    
    public void imprimircostototal(double costototal){
        System.out.println("Costo total: " + costototal);
    }
    
    public void imprimirDescSobrec(double descSobr){
        System.out.println("Descuento o sobrecosto: " + descSobr);
    }
    
    public void impImpInfr(double ImpPorInfr){
        System.out.println("Impuesto por infraestructura: " + ImpPorInfr);
    }
    
    public void ImprTotalPagar(double totalpagar){
        System.out.println("TOTAL A PAGAR: " + totalpagar+"\n");
    }
    
}
