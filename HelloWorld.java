/*
- public = Tipo de acesso 
- class = Tipo da Classe
- HelloWorld = Nome da classe
 */

public class HelloWorld{
    public static void main(String[] args) {

        //Numeros(int, double, float, long)
        float dadodotipofloat = 3.14f;
        double dadodotipodouble = 3.14;
        long dadodotipolong = 14736428762L; 
        int numero = 15;

        //Texto(String)
        String texto = "Olá Mundo";

        //Booleano(boolean)
        boolean aux = true;

        System.out.println("Hello World!");
        
        //if - else
        if(aux == true){
            numero++;
            System.out.println(texto + " " + numero);
        }else if(aux == false){
            System.out.println("Aux é falso!");
        }else{
            System.out.println("Aux é invalido!");
        }

        //While
        int contador = 0;
        while(contador < 5){
            System.out.println(contador);
            contador++;
        }

        //For
        for(int i = 0; i<5; i++){
            System.out.println("For: "+ i);
        }

    }
}