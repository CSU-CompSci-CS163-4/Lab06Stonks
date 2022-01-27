public class StonkAppMain {

    StonkMarket sm = new StonkMarket();
    StonksAppView view = new StonksAppView();
    Wallet w = new Wallet();

    public void go(){
        view.printMenu();
        System.out.println(String.format("You currently own %d FazCoin, worth $%.2f USD.", w.getFazCoin(), sm.fazCoinToUSD(w.getFazCoin())));
        System.out.println(String.format("Current exchange rate for FazCoin is %.2f USD per 100 FazCoin.", sm.changeExchangeRate()));
        System.out.println();
        System.out.println("What would you like to do? ");
        String action = view.getAction();
        while(!action.startsWith("x")) {
            if(action.startsWith("b")) {
                System.out.println("How much FazCoin would you like to buy?");
                int num = Integer.parseInt(view.getAction());
                //TODO student

            }
            else if(action.startsWith("s")) {
                System.out.println("How much FazCoin would you like to sell?");
                int num = Integer.parseInt(view.getAction());
                //TODO student

            }
            else if(action.startsWith("n") || action.startsWith("d")){ }
            else{
                System.out.println("Please enter a valid command.");
            }
            System.out.println(String.format("You currently own %d FazCoin, worth $%.2f USD.", w.getFazCoin(), sm.fazCoinToUSD(w.getFazCoin())));
            System.out.println(String.format("Current exchange rate for FazCoin is %.2f USD per 100 FazCoin.", sm.changeExchangeRate()));
            System.out.println(String.format("You have $%.2f in your wallet.", w.getUSDollars()));
            System.out.println();
            System.out.println("What would you like to do? ");
            action = view.getAction();
        }
    }

    public static void main(String[] args) {
        StonkAppMain m = new StonkAppMain();
        m.go();
    }

}
