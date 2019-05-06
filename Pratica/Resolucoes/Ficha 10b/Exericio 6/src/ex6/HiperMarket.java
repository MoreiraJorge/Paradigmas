package ex6;

import Interfaces.HipermarketService;

import java.time.LocalDateTime;

/**
 * @author Jorge Moreira
 */
abstract class HiperMarket extends Supermarket implements HipermarketService {
    private double coffeePrice;
    private double gasPrice;
    private double aRate;

    public HiperMarket(double coffeePrice, double gasPrice,
                       double aRate, double potatoPrice, String name, int vatNumber) {
        super(potatoPrice, name, vatNumber);
        this.coffeePrice = coffeePrice;
        this.gasPrice = gasPrice;
        this.aRate = aRate;
    }

    abstract int getPoints(double purchaseValue);

    @Override
    public double getCoffeePrice() {
        return coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        double total;
        total = coffees * coffeePrice;
        return total;
    }

    @Override
    public double getAnnualRate() {
        return aRate;
    }

    @Override
    public void setAnnualRate(double r) {
        aRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        double monthlyRate;
        double payment;

        monthlyRate = (Math.pow(1 + aRate, 1 / 12) - 1);
        payment = ((monthlyRate * ammount) / (1 - Math.pow(1 + monthlyRate, -months)));

        return payment;
    }

    @Override
    public double getGasPrice() {
        return gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        gasPrice = p;
    }

    @Override
    public double getGasTotal(double litres) {
        double total;
        total = litres * gasPrice;
        return total;
    }

    public static void verifyPoints(double purchaseValue, JumbHipermarket j1, ContinentHipermarket c1){
        int a = j1.getPoints(purchaseValue);
        int b = c1.getPoints(purchaseValue);

        if (a > b){
            System.out.println("O " + j1.getName() + " atribui mais pontos: " + a);
        } else {
            System.out.println("O " + c1.getName() + " atribui mais pontos: " + b);
        }
    }





    @Override
    public String toString() {
        String text = "";

        text += super.toString();
        text += "Coffee Price : " + coffeePrice + " €" + "\n";
        text += "Gas Price : " + gasPrice + " €" + "\n";
        text += "Anual Rate : " + aRate + "%" + "\n";

        return text;
    }

}
