/**
 * Classe contient des fonctions qui servent à la 
 * calculation de la production
 */
package Calculs;

import Elements.Element;
import Stock.Stock;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author trongvo
 */
public class Calcul {
    
    
    public boolean possibleProduction() {
        boolean possible = true;
        return possible;
    }
    
    /**
     * methode pour enleveer la quantité de matière
     * nécessaire pour la production du stocl
     * 
     */
    public void soustraireStock(Element e, int Quantite, Stock s){
        for(Element i : s.getStock().keySet()) {
            if(i.equals(e)) {
                i.setQuantiteE(i.getQuantiteE() - Quantite);
                }
            }
        } 
    
    /**
     * 
     */
    public void additionStock(){
    }
}
