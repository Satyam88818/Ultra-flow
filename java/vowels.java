public class vowels {
    public static void main(String[] args) {
        String str = "hello world";
        int vowelCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
}
