package homework;

public class ForLoop2 {
    public static void main(String[] args) {
// k = 1 & will add 1 until equal to 10. However, if k equals to 5, break/cancel the loop.
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
            if(k == 5) {
                break;
            }
        }
    }
}
