import java.io.File;


public class Kata4 {

    public static void main(String[] args) {
        File file = new File("/");  /* Trabajo desde Mac por eso pongo "/" */
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
