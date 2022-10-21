public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("");

        // =======================================================================================

        // 1. Use a while loop to print your FIRSTNAME three times

        int count = 0;
        while (count != 3) {
            System.out.println("LUIS");
            count++;
        }

        System.out.println("");

        // =======================================================================================

        // 2. Use a do-while loop to print your MIDDLENAME four times

        int i = 1;
        do {
            System.out.println("HUAVAS");
            i++;
        } while (i <= 4);

        System.out.println("");

        // =======================================================================================

        // 3. Use a for loop to print your SURNAME five times.

        int awit1 = 5;
        for (int awit = 1; awit <= awit1; ++awit) {
            System.out.println("LAGUARDIA");
        }

        System.out.println("");

        // =======================================================================================

        // 4. Create a char array that consists all of the characters of your FIRSTNAME
        // and use a for loop to print each character of your FIRSTNAME.

        char[] firstName = { 'L', 'U', 'I', 'S' };

        for (int a = 0; a < firstName.length; a++) {
            System.out.print(firstName[a]);
            System.out.println("");

        }
        System.out.println("");

        // =======================================================================================

        // 5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order

        char[] FName = { 'L', 'U', 'I', 'S' };

        for (int b = FName.length - 1; b >= 0; b--) {
            System.out.print(FName[b]);
        }

        System.out.println("");

        // =======================================================================================
    }
}
