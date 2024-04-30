import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercitii {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 2, 7, 4, 9, 0, 20};

        System.out.println("Suma cu reduce: " + Arrays.stream(array).reduce(0, (x, y) -> x + y));
        System.out.println("Suma cu summingInt: " + Arrays.stream(array).collect(Collectors.summingInt(Integer::intValue)));
        System.out.println("Media cu lambda averagingInt: " + Arrays.stream(array).collect(Collectors.averagingInt(Integer::intValue)));
        System.out.println("Min cu lambda: " + Arrays.stream(array).min((a, b) -> a - b).get());
        System.out.println("Max cu lambda: " + Arrays.stream(array).max((a, b) -> a - b).get());
        System.out.println("Intregii mai mari decat 5: " + Arrays.stream(array).filter(x -> x > 5).toList());
        System.out.println();
        System.out.println();

        int[] a = {1, 5, 2, 7, 4, 9, 0, 20};
        System.out.println("Array ordonat crescator: " + Arrays.stream(a).boxed().sorted().toList());
        System.out.println("Array ordonat descrescator: " + Arrays.stream(a).boxed().sorted((x, y) -> y - x).toList());
        System.out.println("Elementele ridicate la patrat: " + Arrays.stream(a).boxed().map(x -> x * x).toList());


        Magazin m1 = new Magazin("mag1", 2);
        Magazin m2 = new Magazin("mag2", 3);
        Magazin m3 = new Magazin("mag3", 4);
        Magazin m4 = new Magazin("mag4", 2);
        Magazin m5 = new Magazin("mag5", 3);
        Magazin m6 = new Magazin("mag6", 6);

        ArrayList<Magazin> listaMag = new ArrayList<>();

        listaMag.add(m1);
        listaMag.add(m2);
        listaMag.add(m3);
        listaMag.add(m4);
        listaMag.add(m5);
        listaMag.add(m6);


        System.out.println("Magazinele grupate dupa numarul de angajati: " + listaMag.stream().collect(Collectors.groupingBy(Magazin::getNumarAngajati)));
        System.out.println("Suma angajatilor din toate magazinele: " + listaMag.stream().collect(Collectors.summingInt(Magazin::getNumarAngajati)));

    }
}