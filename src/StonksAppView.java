import java.util.Scanner;

public class StonksAppView {

    //Placed as instance variable for memory and to make sure there aren't conflicts accessing System.in
    private final Scanner scanner = new Scanner(System.in);

    public void startScreen(){
        //Can add splashscreen
        System.out.println("Welcome to the stonk market.");
    }

    public void printMenu() {
        System.out.println("Type \"X\" to exit at any time.");
        System.out.println("[S]ell stonks");
        System.out.println("[B]uy stonks");
        System.out.println("Do [N]othing");
        System.out.println();
    }

    public String getAction() {
        return scanner.nextLine().toLowerCase();
    }

    public String getAction(String msg) {
        System.out.println(msg);
        return getAction();
    }

    public void walletInfo(Wallet w, StonkMarket sm){
        System.out.printf("You currently own %d FazCoin, worth $%.2f USD.%n", w.getFazCoin(), sm.fazCoinToUSD(w.getFazCoin()));
        System.out.printf("Current exchange rate for FazCoin is %.2f USD per 100 FazCoin.%n", sm.changeExchangeRate());
        System.out.printf("You have $%.2f in your wallet.%n", w.getUSDollars());
        System.out.println();
    }

}
