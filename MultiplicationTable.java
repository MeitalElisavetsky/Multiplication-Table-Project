public class MultiplicationTable {

    public static void main(String[] args) {
        // Define the range of the multiplication table
        int tableSize = 10; // You can change this to 100 if needed

        // Print the header
        System.out.print("   ");
        for (int i = 0; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n----------------------------------------");

        // Generate and print the multiplication table
        for (int i = 0; i <= tableSize; i++) {
            System.out.printf("%2d |", i);
            for (int j = 0; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
