public class Stars {
    public static void main(String[] args) {
        int height =4;
        for (int i = 1; i < height; i++) { // Outer loop
            for (int j = 1; j < height-i; j++) { // Inner loop 1
                System.out.print( " "); // Print numbers without line break
            }
            for (int k = i; k <=height*i-1; k++) { // Inner loop 2
                System.out.print("* "); // Print stars without line break
            }
            System.out.println(); // Move to the next line after each iteration
        }

    for (int i = height - 1; i >= 1; i--) {
         for (int j = 1; j <= height - i; j++) {
         System.out.print(" ");
         }
         for (int k = 1; k <=2*i-1; k++) { 
            System.out.println("*");// Outer loop
    }}
}
}

