import java.io.File;

public class CheckDirectory {
    public static boolean check(File directory) {
        if(directory!=null && directory.isDirectory()){
            return true;
        }
        return false;
    }
}
