public class kyu6_Order {

    public static void main(String[] args) {
        String test = "is2 Thi1s T4est 3a";
        order(test);
    }
    public static String order(String words) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = words.split(" ");
        Integer length = stringArray.length;
       // System.out.println("Ilosc słow: " + length + "\n");
        String temp = "";

        for (Integer i = 0; i < length; i++) {   //licznik ile razy pentla przejechała po array

            for (Integer j = 0; j < length; j++) { //
                Integer value = i + 1;
                String helpChar = value.toString();
                //System.out.println("obrót petli i: " + i);
                //System.out.println("ob j: " + j);
                //System.out.println("Numer poszukiwanego słowa: " + value);
                if (stringArray[j].contains(helpChar)) {
                    temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                    stringBuilder.append(stringArray[i] + " ");
                   // System.out.println(stringArray[i]);
                    break;
                }
            }
        }
        String orderedString = stringBuilder.toString();
        String result = orderedString.trim();
        System.out.printf("The result is: " + result);

        return result;
    }
}
