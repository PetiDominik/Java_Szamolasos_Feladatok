
package ciklusok;

public class Sarkanyos {
    
    public static void main(String[] args) {
        
        int i = 1;
        int j = 1;
        
        while (((7*i) + (11*j)) != 145) {
            j = 1;
            while (((7*i) + (11*j)) < 145-11) {
                j++;
            }
            i++;
        }
        System.out.printf("7*%d(%d) + 11*%d(%d) = 145\n", i, i*7, j, j*11);
        
    }
    
}
