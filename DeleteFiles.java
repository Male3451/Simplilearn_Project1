package LockedMe.com;

import java.io.File;
import java.util.Scanner;

public class DeleteFiles {
    public void deletefile(){
        String str;
        boolean flag =true;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the file name you want to delete along with extension if any- ");
        System.out.println("**Note - Case Sensitive content**\n");
        str=input.next();
        File myfile = new File("D:\\Documents\\Java\\src\\LockedMe.com\\Dir\\"+str);
        try {
            if (myfile.delete())
                System.out.println("     *Deletion Successful.*");
            else
                System.out.println("     *File not found.*");

        }catch (NullPointerException e){
            System.out.println("     *The list is already empty.*");
        }catch (Exception e){
            System.out.println("     *File not found.*");
        }
    }
}
