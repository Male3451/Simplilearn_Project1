package LockedMe.com;

public class DisplayOptions {
    private InputFromUser userInp = new InputFromUser();
    void displayGreetings() {
        System.out.println();
        System.out.println("                     Greetings      ");
        System.out.println("                   *************\n");

    }

    void displayAvailableOptions() {
        System.out.println("* * *");
        System.out.println("*   Main Window   *");
        System.out.println("              * * *");
        System.out.println("\nPlease select one of the options given below and press Enter-");
        System.out.println();
        System.out.println("Press 1   : Display the names of files in directory.");
        System.out.println();
        System.out.println("Press 2   : Perform any of operations such as Add, Delete, Search, etc.");
        System.out.println();
        System.out.println("Press 3   : Close the application.");
        System.out.println();
    }

    int receivedInput(){
        int k =userInp.inputForScreen();
        while (k<1 || k>3) {
            System.out.println();
            System.out.println("->You have entered wrong Integer.\n");
            k = userInp.inputForScreen();
        }
        return k;
    }
}
