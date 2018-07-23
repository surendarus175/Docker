package resource;

public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a test: ");
        for (int i=0; i<10; i++) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
