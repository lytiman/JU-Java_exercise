public class Main {
    public static void main(String[] args) {
        String token = "what is yellow +green?/purple";
        String[] result = token.split("/");
        for (String a : result) {
            System.out.println(a);
        }
    }
}
