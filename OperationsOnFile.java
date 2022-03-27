package LockedMe.com;

import java.io.IOException;
import java.util.Scanner;

public class OperationsOnFile {
    DisplayOperations operations =new DisplayOperations();
    private int choice;
    void functioning() throws IOException {
        do {

            //selecting options from operations window
            operations.displayAvailableOperations();

            //choosing one option
            choice = operations.receivedInputOperations();

            //functions based on choices

            if (choice==1){
                AddFiletoDirectory addfile=new AddFiletoDirectory();
                addfile.Addfile();

            }else if(choice==2) {
                DeleteFiles deleteFiles = new DeleteFiles();
                deleteFiles.deletefile();

            }else if(choice==3){
                SearchFile searchFile =new SearchFile();
                searchFile.searchfile();

            }else {
                System.out.println("\nIn main window\n");
                break;
            }

        }while (true);

    }
}