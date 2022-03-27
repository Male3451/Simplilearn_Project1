package LockedMe.com;

public class DisplayOperations {
    private InputFromUser userInput = new InputFromUser();
    void displayAvailableOperations() {
        System.out.println("\n* * *");
        System.out.println("*   Second Window   *");
        System.out.println("                * * *");
        System.out.println("\nPlease select one of the options given below and press Enter-");
        System.out.println();
        System.out.println("Press 1   : Add a file to the directory.");
        System.out.println();
        System.out.println("Press 2   : Delete a file in the directory list.");
        System.out.println();
        System.out.println("Press 3   : Search a file in the directory list.");
        System.out.println();
        System.out.println("Press 4   : Navigate back to the main context");
        System.out.println();
    }

    int receivedInputOperations(){
        int k = userInput.inputForScreen();
        while (k<1 || k>4) {
            System.out.println();
            System.out.println("->You have entered wrong Integer.\n");
            k = userInput.inputForScreen();
        }
        return k;
    }
}
