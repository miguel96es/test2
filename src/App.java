import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        


        estudiante obj1 = new estudiante("miguel", "24294012-1", 26);

        System.out.println(obj1.getNombre());
        System.out.println(obj1.getEdad());

        String masc[] = {"kenai","perla","moka"};

        obj1.setMascotas(masc);

        System.out.println(Arrays.toString(obj1.getMascotas()));

        

    }
}
