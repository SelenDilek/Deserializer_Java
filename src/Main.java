import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {

        User user = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\murat\\IdeaProjects\\Serializable_Java\\UserInfo.ser");
            objectInputStream = new ObjectInputStream(fileInputStream);
            user=(User)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println("Byte stream was converted into an object");

    }
}