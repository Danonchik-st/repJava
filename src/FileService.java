import java.io.*;

public class FileService {
    public static long copyFile(File fileIn, File fileOut) throws IOException {
        try(InputStream is = new FileInputStream(fileIn);
            OutputStream os = new FileOutputStream(fileOut)){
            return is.transferTo(os);
        }}

    public static long copyFiles(File folderIn, File folderOut, long maxSize) throws IOException {
        long copyFileCounter = 0;
        File[] files = folderIn.listFiles();
        if (files == null) {
            return 0;
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() && files[i].length() <= maxSize) {
                copyFile(files[i], new File(folderOut, files[i].getName()));
                copyFileCounter += 1;
            }
        }
        return copyFileCounter;
    }
}


