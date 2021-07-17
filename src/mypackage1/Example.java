package mypackage1;

public class Example {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] elements = new String[13];
        for (int i = 0; i <= 13; i++) {
            for (int j = i; j < 13; j++) {
                elements[j] = alphabet.substring(i, (i + 1)) + alphabet.substring((alphabet.length() - (i + 1)), (alphabet.length() - i));
            }
        }
        String result = "";
        for (int i = 0; i<=12; i++){
            result += elements[i];
        }
        System.out.println(result);

    }



//    public static void main(String[] args) {
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        String elements = "";
//        for (int i = 0; i <= 12; i++) {
//            elements += alphabet.substring(i, (i + 1));
//            elements +=  alphabet.substring((26 - (i + 1)), (26 - i));
//        }
//
//        System.out.println(elements);
//
//    }
}
