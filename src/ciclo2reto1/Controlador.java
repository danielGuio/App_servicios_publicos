package ciclo2reto1;
/**
 *
 * @author danie
 */
public class Controlador {
    private int servicio = 0;
    private int estrato;
    private int consumo;
    private double valorFacturaBruto;
    private double descuentoSobrecosto;
    private double valorFacturaNeto;
    private double valorUnidad;
    private double valorImpInf;
    
    Vista objVista = new Vista();
    Modelo objModelo = new Modelo();
    
    public void ejecutarvistaModelo(){
        String tiposervicio="";
        while(servicio!=4){
                servicio = objVista.menu();
                if (servicio == 1){
                    tiposervicio = "Energia";
                }else if(servicio == 2){
                    tiposervicio = "Acueducto";
                }else  if(servicio == 3){
                    tiposervicio = "Gas Natural";
                }else  if(servicio == 4){
                    System.out.println("Opción:");
                    tiposervicio = "Hasta pronto";
                    System.out.println(tiposervicio);
                }      
                    if (servicio!=4){
                        System.out.println("Opción:");
                        System.out.println("Pago de Servicio de " + tiposervicio);
                        estrato = objVista.estrato();
                        consumo = objVista.consumo();
                        valorFacturaBruto = objModelo.calcularvalorfactbruto(estrato, servicio, consumo);
                        descuentoSobrecosto = objModelo.calcularDescuentoSobrecosto(estrato, valorFacturaBruto);
                        valorUnidad = objModelo.valorUnidad(servicio);
                        valorImpInf = objModelo.calcValorImpInfraestr(valorFacturaBruto);
                        valorFacturaNeto = objModelo.calcValorFactNeto(valorFacturaBruto, descuentoSobrecosto, valorImpInf);
                        objVista.imprimirconsumo(consumo);
                        objVista.imprimirvalorUnidad(valorUnidad);
                        objVista.imprimirestrato(estrato);
                        objVista.imprimircostototal(valorFacturaBruto);
                        objVista.imprimirDescSobrec(descuentoSobrecosto);
                        objVista.impImpInfr(valorImpInf);
                        objVista.ImprTotalPagar(valorFacturaNeto);
                        
        }
        }
    }
    
}
