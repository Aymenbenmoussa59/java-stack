public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dropCoffee = 5;
        double latte = 4;
        double cappuccino = 7;
        // raise prices
        mochaPrice +=1;
        dropCoffee +=1;
        latte +=1;
        cappuccino +=1;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        // !======Cindhuri======
        System.out.println("^_^^_^^_^^_^ " + customer1);
        if (isReadyOrder1) {
            System.out.println(readyMessage +" " + customer1);
        } else {
            System.out.println(pendingMessage +" " + customer1);
        }
        // !======Noah======
        System.out.println("^_^^_^^_^^_^ " + customer4);
        if (isReadyOrder4) {
            System.out.println(readyMessage +" " + customer4 + displayTotalMessage + cappuccino + "$");
        } else {
            System.out.println(pendingMessage +" " + customer4);
        }
        // !======Sam======
        System.out.println("^_^^_^^_^^_^ " + customer2);
        System.out.println(generalGreeting  +" "+ customer2 +" " + displayTotalMessage + (latte * 2) + "$");
        if (isReadyOrder2) {
            System.out.println(readyMessage  +" "+ customer2);
        } else {
            System.out.println(pendingMessage  +" "+ customer2);
        }
        if (isReadyOrder2) {
            isReadyOrder2 = false;
        } else {
            isReadyOrder2 = true;
        }
        // !======Jimmy======
        System.out.println("^_^^_^^_^^_^ " + customer3);
        System.out.println(displayTotalMessage +" " + (dropCoffee+latte+"$")  + customer3);
        System.out.println("the difference " + latte + "$" );
    }
}
