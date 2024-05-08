package PrimeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(15);
        numeros.add(19);
        numeros.add(3);
        numeros.add(27);
        numeros.add(11);

        numeros.remove(11);

        for(Integer element : numeros){
            System.out.println("O numero e: "+ element);
        }

        System.out.println(numeros.contains(19));
    }
}
