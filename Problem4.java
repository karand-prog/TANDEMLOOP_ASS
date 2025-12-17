//Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//        (examples)
//input: [1,2,8,9,12,46,76,82,15,20,30]
//Output:
//        {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

import java.util.*;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number in dictionary: ");
        int total = sc.nextInt();

        int arrDic[] = new int[total];

        System.out.print("Enter values in dictionary: ");
        for(int i=0;i<total;i++){
            arrDic[i] = sc.nextInt();
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int j = 1; j <= 9; j++) {
            int count = 0; // reset for each divisor

            for (int i = 0; i < arrDic.length; i++) {
                if (arrDic[i] % j == 0) {
                    count++;
                }
            }
            result.put(j, count);
        }

        System.out.println(result);
    }
}
