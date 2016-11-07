package tw.org.iii;

import java.io.File;

public class Lab30 {
    public static void main(String[] args){
        File dir1 = new File("dir1");
//        File dir2 = new File("dir2");

        if(dir1.isDirectory()){
            File[] sub = dir1.listFiles();
            for (File sfile : sub){
                System.out.println(sfile.getName());
            }
        }

        File[] roots = File.listRoots();
        for(File root : roots){
            System.out.println(root.getAbsolutePath());
        }



//        if(dir2.exists()){
//            System.out.println("Exist!");
//        }else {
//            dir2.mkdir();
//        }
//        File dir5 = new File("dir1/dir2/dir3/dir4/dir5");
//        if(dir5.exists()){
//            System.out.println("ok");
//        }else {
//            dir5.mkdirs();
//        }


//        System.out.println(dir1.getAbsolutePath());
//        if (dir1.exists()){
//            System.out.println("ok");
//        }else{
//            System.out.println("xx");
//        }
    }
}
