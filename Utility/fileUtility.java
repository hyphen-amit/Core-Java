package Utility;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class fileUtility {
    //creating the new file
    public static boolean createFile(String filePath){
        File file=new File(filePath);
        boolean fileCreated=false;
        //makes sure that if file already exists the new file will not be created
        try {
            fileCreated= file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileCreated;
    }

    //reading the file
    public static ArrayList<String> readFile(String fileName){
        Scanner sc=null;
        ArrayList<String> strings=new ArrayList<>();
        try {
            File file=new File(fileName);
            sc=new Scanner(file);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally{
            if(sc!=null){
                //use close to make sure if the file reading is complete then
                //there should be no memory leakage
                sc.close();
            }
        }return strings;
    }

    //write to file

//    public static boolean writeFile(String filePath, String content){
//        File file = new File(filePath);
//        BufferedWriter bw=null;
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        FileWriter fw= null;
//        try {
//            fw = new FileWriter(file.getAbsoluteFile());
//            bw=new BufferedWriter(fw);
//            bw.write(content);
//        } catch (IOException e) {
//            //throw new RuntimeException(e);
//            return false;
//        }finally {
//            if(bw!=null){
//                try {
//                    bw.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }return true;
//    }

    //write to file
    public static boolean writeFile(String filePath, String content){
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append(content);
            fileWriter.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String fileName="Utility/data/file"+"readme_createFile.txt";
        boolean created = createFile(fileName);
        System.out.println("File Created - "+created);
        ArrayList<String> list;
        list = readFile(fileName);
        for(String row: list){
            System.out.println("Line - "+ row);
        }System.out.println("Number of lines - "+list.size());
        String writeFileName="Utility/data/file"+"readme_writeFile.txt";
        boolean writtenFile=writeFile(writeFileName, "Yo! this file is created using Java");
        System.out.println(writtenFile);
    }
}
