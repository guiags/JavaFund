import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Guilherme");
        nomes.add("Ana Paula");

        for(int i = 0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String item : nomes){
            System.out.println(item);
        }

        nomes.forEach(nome-> System.out.println(nome));
    }
}
