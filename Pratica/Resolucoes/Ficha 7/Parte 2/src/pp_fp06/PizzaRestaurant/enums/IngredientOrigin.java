/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 *
 * @author Jorge Moreira
 */
public enum IngredientOrigin {
    NACIONAL, IMPORTADO;
    
    public static String IngredientOriginToString(IngredientOrigin origin){
        switch(origin){
            case NACIONAL:
                return "Ingrediente nacional.";
            case IMPORTADO:
                return "Ingrediente importado. ";
            default:
                return "Origem invalida";
        }
    }
}
