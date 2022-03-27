package LockedMe.com;

public class DisplayOptions {
    private InputFromUser userInp = new InputFromUser();
    void displayAvailableOptions() {
        System.out.println();
        System.out.println("                Greetings      ");
        System.out.println();
        System.out.println("Please select one of the options given below and press Enter");
        System.out.println();
        System.out.println("Press 1   : Display the files names");
        System.out.println();
        System.out.println("Press 2   : Perform any of operations such as Add, Delete, Search, etc.");
        System.out.println();
        System.out.println("Press 3   : Close the application");
        System.out.println();
    }

    int receivedInput(){
        int k =userInp.inputForScreen();
        while (k<1 || k>3)
            k=userInp.inputForScreen();
        return k;
    }
}
