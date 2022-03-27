package LockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFiletoDirectory {

    public void Addfile() throws IOException {
        String str;
        boolean flag =true;
        Scanner input = new Scanner(System.in);
        File myfile = new File("D:\\Documents\\Java\\src\\LockedMe.com\\Dir");
        System.out.println("\nPlease enter the name of file u want to add-\n");
        str=input.next();
        String[] templist = myfile.list();
        if (templist!=null)
            for (String s :templist) {
            if(s.equals(str)){
                System.out.println("     *The file already in the directory.*");
                flag=false;
                break;
            }
        }

        if(flag) {
            File text = new File(myfile, str);
            text.createNewFile();
            System.out.println("     *File created successfully.*");
        }
    }

}
