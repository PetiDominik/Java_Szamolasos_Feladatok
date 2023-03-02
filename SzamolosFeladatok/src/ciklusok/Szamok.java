
package ciklusok;

import java.util.Scanner;

public class Szamok {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin2");
        
        System.out.print("Szeretne számismétlést látni(i/n)? ");
        String valasz = sc.next();
        boolean ismetles = valasz.equals("i");
        
        for (int i = 2; i <= 4; i++) {
            for (int j = 2; j <= 4; j++){
                for (int k = 2; k <= 4; k++) {
                    if (!ismetles && (i == j || i == k || j == k)) {
                        continue;
                    }
                    System.out.printf("%d%d%d\n", i, j, k);
                }
            }
        }
        
    }
    
}
