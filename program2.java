class WordEncryption {
    private String inputString;
    private int key;


    public WordEncryption(String inputString, int key) {
        this.inputString = inputString;
        this.key = key;
    }


    private static char encryptChar(char c, int key) {
        int baseValue;
        if (Character.isLowerCase(c)) {
            baseValue = 'a';  
        } else if (Character.isUpperCase(c)) {
            baseValue = 'A';  
        } else {
            return c;  
        }

        int charValue = c - baseValue;  
        int encryptedValue = (charValue + key) % 26;  

        char encryptedChar = (char)(baseValue + encryptedValue);
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(encryptedChar);  
        } else {
            return Character.toLowerCase(encryptedChar);  
        }
    }
    public final String encryptString() {
        StringBuilder encryptedString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            encryptedString.append(encryptChar(c, key));
        }

        return encryptedString.toString();
    }


    public static void main(String[] args) {

        WordEncryption we1 = new WordEncryption("Wipro Tech", 20);
        System.out.println(we1.encryptString());


        WordEncryption we2 = new WordEncryption("Hello World", 5);
        System.out.println(we2.encryptString());  
    }
}
