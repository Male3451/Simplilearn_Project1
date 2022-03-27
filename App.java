package LockedMe.com;
public class App {
    public static void main(String[] args) {
        WelcomeScreen screen1= new WelcomeScreen();
        DisplayOptions options = new DisplayOptions();
        screen1.displayMessage();
        options.displayAvailableOptions();
        int op = options.receivedInput();
        System.out.println(op);
    }
}
