import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lib_File {

    /**
     * @param file
     * @return ArrayList<Object>
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static ArrayList<Object> deserializeObjects(File file) throws IOException, ClassNotFoundException {

        ArrayList<Object> objects = new ArrayList<Object>();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        objects.add(ois.readObject());

        ois.close();
        fis.close();

        return objects;

    }

    /**
     * @param objects
     * @return File
     * @throws IOException
     */
    public static File serializeArrayList(ArrayList<Object> objects) throws IOException {

        File file = File.createTempFile("temp", ".tmp");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(objects);

        oos.close();
        fos.close();

        return file;
    }

    /**
     * @param filename
     * @return ArrayList<String>
     * @throws IOException
     */
    public static ArrayList<String> readLinebyLine(String filename) throws IOException {

        File file = new File(filename);
        ArrayList<String> list = (ArrayList<String>) Files.readAllLines(Paths.get(file.getAbsolutePath()));

        return list;

    }

    /**
     * @param filename
     * @return boolean
     * @throws FileNotFoundException
     */
    public static boolean isExistentAndReadibleBoolean(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (file.exists() && file.canRead() && !file.isDirectory()) {
            return true;
        }
        return false;
    }

    /**
     * @param lise
     * @param filename
     * @param append
     * @throws IOException
     */
    public static <T> void writeTextToFile(ArrayList<T> lise, String filename, boolean append) throws IOException {

        FileWriter filewriter = new FileWriter(filename, append);
        for (T t : lise) {
            filewriter.write(t.toString() + "\n");
        }
        filewriter.close();
    }
}
