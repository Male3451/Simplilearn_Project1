package LockedMe.com;

import java.io.File;

public class FilesInAscendingOrder {
    int count =1;
    public void ascendingOrder(){
        File myfile = new File("D:\\Documents\\Java\\src\\LockedMe.com\\Dir");
        String[] listfile = myfile.list();

        System.out.println("\nThe files in ascending order of their names are -\n");
        assert listfile != null;
        for ( String s: listfile) {
            System.out.println("   "+count +")"+s);
            count++;
        }
        System.out.println();
    }
}
