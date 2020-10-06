class ReverseString {

    String reverse(String inputString) {
        char[] stringArray = inputString.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(stringArray[i]);
        }
        return reversedString.toString();
    }
}