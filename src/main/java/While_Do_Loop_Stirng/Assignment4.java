package While_Do_Loop_Stirng;
//Assignment- 4
//        1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression.
import java.util.ArrayList;
import java.util.List;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        int quantity = 0;
        int prices = 0;
        for (int i = 1; i <= arr.length; i++) {
            String s = arr[i - 1];
            if (i % 2 == 0) {
                prices += Integer.parseInt(s);
            } else {
                quantity += Integer.parseInt(s);
            }
        }
        System.out.println("Total prices are " + prices+ "Tk.");
        System.out.println("Total products are "+quantity+ " pieces");
    }
}
