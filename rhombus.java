public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j2 = 1; j2 <= 5; j2++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
