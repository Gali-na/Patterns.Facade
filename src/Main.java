import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileService.copy(new File("file.txt"), new File("newDirectory"));
        System.out.println("Hello world!");
    }
}