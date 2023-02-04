import java.io.File;

public class CheckFile {
    public static boolean check(File file) {
        if(file!=null && file.isFile() ){
            return true;
        }
        return false;
    }
}
