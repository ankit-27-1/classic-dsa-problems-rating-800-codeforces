import java.util.*;

public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max=0;
            int temp=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    temp++;
                    if(temp>max){
                        max=temp;
                    }
                }
                else{
                    temp=0;
                }
            }
            System.out.println(max);
        }
    }
}
