package LockedMe.com;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
    private String str;
    public void searchfile(){
        int count=0;
        boolean flag =true;
        Scanner input = new Scanner(System.in);
        File tempfile= new File("D:\\Documents\\Java\\src\\LockedMe.com\\Dir");
        String[] templist = tempfile.list();
        if (templist==null) {
            System.out.println("     *There is no file present in Directory.*");
            return;
        }
        System.out.println("\nEnter the file name you want to search along with extension if any- ");
        System.out.println("**Note - Case Sensitive content**\n");
        str=input.next();

        for (String s :templist) {
            count++;
            if(s.equals(str)){
                flag=false;
                System.out.println("     *File found at "+count+" position*.");
                break;
            }
        }

        if(flag)
            System.out.println("     *File is not present in the directory.*");
    }
}
