import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean deFacto = false;
        Boolean deJure = false;
        String input = "fx))(( = 2x + y(()) - (3 + (2x - x) + 20)";
        StackKurung word = new StackKurung(input.length());
        Scanner scn = new Scanner(input);
        scn.useDelimiter("");

        for (int i = 0; i < input.length(); i++){
            String karakter = scn.next();
            if (karakter.equals("=")) {
                if (word.isEmpty()) {
                    deFacto = true;
                }
            }else if (karakter.equals(")")) {

                    word.pop();
            }else if (karakter.equals("(")){
                word.push(karakter);
            }
        }
        if (word.isEmpty()) {
            deJure = true;
        }

        if (word.quo && deFacto && deJure){
            System.out.println("Valid 99,99999999999...%");
        }
        else {
            System.out.println("Not Valid 99.9%");
        }
    }
}
