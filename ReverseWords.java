public class ReverseWords {

    public static void main(String[] args) {
        String s = "I am an Automation Engineer";
        String x = reverseWords(s);
        System.out.println(x);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder().append(word).reverse()).append(" ");
        }
        return sb.toString().trim();
    }  
}