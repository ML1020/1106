import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < A.length()+1; i ++){
            List<Character> list = new ArrayList<>();
            for(int j = 0; j < i; j++){
                list.add(a[j]);
            }
            for(int j = 0; j < B.length(); j ++){
                list.add(b[j]);
            }
            for(int j = i; j < A.length(); j++){
                list.add(a[j]);
            }
            for(int p = 0, q = list.size()-1; p < q;p ++,q --){
                flag = true;
                if(list.get(p) != list.get(q)){
                    flag =false;
                    break;
                }
            }
            if(flag){
                count ++;
            }
        }
        System.out.println(count);
    }
}
