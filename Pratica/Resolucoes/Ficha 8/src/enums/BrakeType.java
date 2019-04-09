/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Jorge Moreira
 */
public enum BrakeType {
    
    /**
     * pinsças
     */
    P,

    /**
     * Hidraulicas
     */
    H;
    
    /**
     * Enum para tipo de Travoes
     * @param tipo de break
     * @return break
     */
    public static String BrakeType(BrakeType tipo){
       
        switch(tipo){
            case P:
                return "Travões de Pinças";
            case H:
                return "Travões de Hidraulicas";
            default:
                return "Travões Invalidos";
        }
    }
    
    
    
}
