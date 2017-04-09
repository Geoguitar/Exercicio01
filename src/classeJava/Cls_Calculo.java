/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeJava;

/**
 *
 * @author geoguitar
 */
public class Cls_Calculo {
    
    private int valorPercentualDesconto;
    private float valorDesconto;
    private float valorFinalAutomovel;
    
    public float calculo(String MarcaAutomovel, String AnoFabricacao, float valorBase){
        
    
        switch(MarcaAutomovel){
        
            case "FIAT": {
            
                if(AnoFabricacao == "2011")
                    valorPercentualDesconto = 6;
                else if (AnoFabricacao == "2012")
                    valorPercentualDesconto = 5;
            }
            break;
            
             case "VW": {
            
                if(AnoFabricacao == "2011")
                    valorPercentualDesconto = 4;
                else if (AnoFabricacao == "2012")
                    valorPercentualDesconto = 3;
            }
            break;
            
              case "FORD": {
            
                if(AnoFabricacao == "2011")
                    valorPercentualDesconto = 2;
                else if (AnoFabricacao == "2012")
                    valorPercentualDesconto = 1;
            }
            break;
        }
        
        valorDesconto = valorBase * valorPercentualDesconto/100;
        valorFinalAutomovel = (valorBase - valorDesconto);
        return valorFinalAutomovel;
    }

}
