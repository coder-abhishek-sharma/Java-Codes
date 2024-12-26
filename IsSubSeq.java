
import java.util.ArrayList;
import java.util.Scanner;

public class IsSubSeq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int len = name.length();
        ArrayList<String> list = new ArrayList<>();
        // String arr[] = new String[(int) Math.pow(2, len)];

        // arr[0] = "";
        // arr[1] = name.charAt(0) + "";
        // for (int i = 1; i < len - 1; i++) {
        //     char ch = name.charAt(i);
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[j] != null) {
        //             arr[j + 2] = arr[j] + ch + "";
        //         }
        //     }
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (list.isEmpty()) {
                list.add("");
                list.add(ch + "");
                continue;
            }

            int listlen = list.size();
            for (int j = 0; j < listlen; j++) {
                String temp = list.get(j) + ch;
                if(!list.contains(temp)){
                  list.add(temp);
                }
            }
        }
        System.out.println(list);
    }
}
