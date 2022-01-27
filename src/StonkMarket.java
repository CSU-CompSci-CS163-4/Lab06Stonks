import java.util.Random;

public class StonkMarket {

    private double exchangeRate = 1;

    public double fazCoinToUSD(int fazCoin){
        return (fazCoin * getExchangeRate()) / 100.0;
    }


}
