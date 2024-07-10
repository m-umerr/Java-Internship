import java.io.*;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\mumer.muddassir\\Documents\\testfile.txt");

        if(file.createNewFile()){
            System.out.println("File Created Successfully");
        }
        else{
            System.out.println("File Already Exists");
        }

        if(file.exists()){
            System.out.println("File Name: "+file.getName());
            System.out.println("File Location: "+file.getAbsolutePath());
            System.out.println("File Writable: "+file.canWrite());
            System.out.println("File Readable: "+file.canRead());
            System.out.println("File Size: "+file.length());

        }else{
            System.out.println("File Doesnot Exists");
        }

        FileWriter fileWriter = new FileWriter("C:\\Users\\mumer.muddassir\\Documents\\testfile.txt");

        fileWriter.write("Java File Handling");
        fileWriter.close();

        FileReader fileReader = new FileReader("C:\\Users\\mumer.muddassir\\Documents\\testfile.txt");
        int i;
        while ((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
