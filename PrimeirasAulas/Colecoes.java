package PrimeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Gui", 29);
        notas.put("Ana", 20);
        // var aux == Ao C# pega o tipo caso seja possivel 
        System.out.println(notas.get("Ana"));

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
