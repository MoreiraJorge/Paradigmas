package ex5;

/**
 *
 * @author Jorge Moreira
 */

import Interfaces.MarketService;

public class Supermarket extends Company implements MarketService {
    private double price;

    public Supermarket(double price, String name, int vatNumber) {
        super();
        super.setName(name);
        super.setVatNumber(vatNumber);
        this.price = price;
    }


    @Override
    public double getPotatoesPrice() {
        return price;
    }

    @Override
    public void setPotatoesPrice(double p) {
        price = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        double total;
        total = kilos * price;
        return total;
    }

    @Override
    public String toString(){
        String text = "";

        text += super.toString();
        text += "potatoe price per kilo : " + price + " €" + "\n";

        return text;
    }


}
