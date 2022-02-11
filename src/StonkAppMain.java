public class StonkAppMain {

    StonkMarket sm = new StonkMarket();
    StonksAppView view = new StonksAppView();
    Wallet w = new Wallet();

    public void go(){
        view.startScreen();
        String walletChoice = view.getAction("Would you like to start with the default wallet, or enter your own?\n" +
                "Enter [d]efault or [c]ustom: ");
        if(walletChoice.startsWith("d")){
            w = new Wallet();
        }
        else{
            int fazCoin = Integer.parseInt(view.getAction("So you want to invest more!\n"
                    + "How much FezCoin do you already own? "));
            double usd = Double.parseDouble(view.getAction("How much money in USD do you plan to work with? "));
            w = new Wallet(fazCoin, usd);
        }
        view.printMenu();
        view.walletInfo(w, sm);
        String action = view.getAction("What would you like to do? ");
        while(!action.startsWith("x")) {
            if(action.startsWith("b")) {
                int num = Integer.parseInt(view.getAction("How much FazCoin would you like to buy? "));
                purchaseFazCoin(num);
            }
            else if(action.startsWith("s")) {
                int num = Integer.parseInt(view.getAction("How much FazCoin would you like to sell? "));
                sellFazCoin(num);
            }
            else if(action.startsWith("n") || action.startsWith("d")){
                //Don't do anything
            }
            else{
                System.out.println("Please enter a valid command.");
            }
            view.walletInfo(w, sm);
            action = view.getAction("What would you like to do? ");
        }
    }

    public static void main(String[] args) {
        StonkAppMain m = new StonkAppMain();
        m.go();
    }

}
