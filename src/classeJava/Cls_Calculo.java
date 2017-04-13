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
   
    public float calculo(String marcaAutomovel, String anoFabricacao, float valorBase){
        
    
        switch(marcaAutomovel){
        
            case "FIAT": {
            
                if("2011".equals(anoFabricacao)){
                    valorPercentualDesconto = 6;
                }else if("2012".equals(anoFabricacao)){
                    valorPercentualDesconto = 5;
                }
            }
            break;
            
             case "VW": {
            
                if("2011".equals(anoFabricacao)){
                    valorPercentualDesconto = 4;
                    
                }else if ("2012".equals(anoFabricacao)){
                    valorPercentualDesconto = 3;
                }
            }
            break;
            
              case "FORD": {
            
                if("2011".equals(anoFabricacao)){
                    valorPercentualDesconto = 2;
                }else if ("2012".equals(anoFabricacao)){
                    valorPercentualDesconto = 1;
                }
            }
            break;
        }
        
        valorDesconto = valorBase * valorPercentualDesconto/100;
        valorFinalAutomovel = (valorBase - valorDesconto);
        return valorFinalAutomovel;
    }

}
