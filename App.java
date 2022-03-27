package LockedMe.com;


import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        WelcomeScreen screen1= new WelcomeScreen();
        DisplayOptions options = new DisplayOptions();


        //initial screen
        screen1.displayMessage();

        //Greeting message
        options.displayGreetings();
        do {

            //selecting options from interface window
            options.displayAvailableOptions();

            //choosing one option
            int op = options.receivedInput();

            //functions based on choices
            if (op==1){
                FilesInAscendingOrder displayAscending = new FilesInAscendingOrder();
                displayAscending.ascendingOrder();

            }else if(op==2){
                OperationsOnFile screen2 = new OperationsOnFile();
                screen2.functioning();
            }else {
                new CloseApplication().endMessage();
                break;
            }
        }while (true);

    }
}
