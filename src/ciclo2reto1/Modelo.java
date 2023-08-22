package ciclo2reto1;

/**
 *
 * @author danie
 */
public class Modelo {
    private final double valorm3agua = 9256;
    private final double valorm3gas = 5234;
    private final double valorkWenergia = 6200;
    private int estrato;
    private int servicio;
    private int consumo;
    private double descuentoSobrecosto;
    private double valorFacturaBruto;
    private double valorFacturaNeto;
    
    
    public double valorUnidad(int servicio){
        double valorUnidad = 0;
        
        switch (servicio){
            
        case 1:
            valorUnidad = 6200;
        break;
        
        case 2: 
            valorUnidad = 9256;
        break;
        
        case 3: 
            valorUnidad = 5234;
        break;
        
        default:
            valorUnidad = 5234;
    }
        return valorUnidad;
    }
    
    public double calcularDescuentoSobrecosto(int estrato, double valorFacturaBruto){
        this.estrato = estrato;
        this.valorFacturaBruto= valorFacturaBruto;
        if (estrato == 1 || estrato == 2){
            descuentoSobrecosto = -(valorFacturaBruto * 0.5);
        }else if(estrato == 3 || estrato == 4){
            descuentoSobrecosto = -(valorFacturaBruto * 0.1);
        }else if(estrato == 5 || estrato == 6){
            descuentoSobrecosto = (valorFacturaBruto * 0.25);
        }
        return descuentoSobrecosto;
    }
       
    
    public double calcularvalorfactbruto (int estrato, int servicio, int consumo){
        this.estrato = estrato;
        this.consumo = consumo;
        this.servicio = servicio;
        
        switch (servicio){
            case 1:
                valorFacturaBruto = valorkWenergia * consumo;
                break;
                
            case 2:
                valorFacturaBruto = valorm3agua * consumo;
                break;
            
            case 3:
                valorFacturaBruto = valorm3gas * consumo;
                break;
            default: 
                valorFacturaBruto = 0.0;             
        }

        return valorFacturaBruto;
    }
    
    public double calcValorImpInfraestr (double valorfacbruto){
        double valorImpInf = valorfacbruto * 0.01;
        return valorImpInf;
    }
            
    
    public double calcValorFactNeto (double valorFacturaBruto, double descuentoSobrecosto, double impInfr){
        valorFacturaNeto = valorFacturaBruto + (descuentoSobrecosto + impInfr);
        return valorFacturaNeto;
    }
    
        public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getDescuentoSobrecosto() {
        return descuentoSobrecosto;
    }

    public void setDescuentoSobrecosto(int descuentoSobrecosto) {
        this.descuentoSobrecosto = descuentoSobrecosto;
    }

    public double getValorFacturaBruto() {
        return valorFacturaBruto;
    }

    public void setValorFacturaBruto(int valorFacturaBruto) {
        this.valorFacturaBruto = valorFacturaBruto;
    }

    public double getValorFacturaNeto() {
        return valorFacturaNeto;
    }

    public void setValorFacturaNeto(int valorFacturaNeto) {
        this.valorFacturaNeto = valorFacturaNeto;
    }
    
    
}
        