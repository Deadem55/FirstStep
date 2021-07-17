package mypackage1;

public class Example2 {
    public static void main(String[] args) {
        String origins = "sdgfhkj   hjkhkjh  kjhjkhkjh    kjhkjhjk      dsfds";
        String[] elements = new String[origins.length() - 1];
        for (int i = 0; i <= origins.length(); i++) {
            for (int j = i; j < origins.length() - 1; j++) {
                elements[j] = origins.substring(i, i + 1);
            }
        }
        //System.out.println(Arrays.toString(elements));
        String message = "";

//        int count = 0;
        for (int i = 0; i <= elements.length - 1; i++) {
            if (message.endsWith(" ") && elements[i].equals(" ")) {
            } else {
                message += elements[i];
            }
//            if (elements[i].equals(" ") && count < 1) {
//                count ++;
//                message += elements[i];
//            } if (!elements[i].equals(" ")) {
//                count = 0;
//                message += elements[i];
//            }
//
//        }
//        System.out.println(message);
        }
        System.out.println(message);
    }
}
