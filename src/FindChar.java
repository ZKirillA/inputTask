public class FindChar {
    public static void main(String[] args) {
        String word = "Hello";
        char[] array = word.toCharArray();
        System.out.println("The word is:" + word);
        System.out.println("The repeated characters in the above word are:");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                    break;
                }
            }
        }

    }
}
