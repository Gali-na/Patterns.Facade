import java.io.*;

public class FileService {
    public static void copy(File file, File newDirectory) {
        if (CheckFile.check(file) && CheckDirectory.check(newDirectory)) {
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
                 BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(
                         newDirectory.getAbsolutePath() + "\\" + file.getName()))) {
                byte arry[] = new byte[1024];
                while (inputStream.read(arry) != -1) {
                    bufferedOutputStream.write(arry);
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
