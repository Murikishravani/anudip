package shravani;

public class ATMApplication {


    public static void main(String[] args) {
        int dailyLimit = 50000; // Daily withdrawal limit
        int totalWithdrawn = 0; // Total amount withdrawn in a day

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the amount to withdraw (0 to exit): ");
            int amount = scanner.nextInt();

            if (amount == 0) {
                System.out.println("Exiting...");
                break; // Exit the loop if 0 is entered
            }

            if (totalWithdrawn + amount > dailyLimit) {
                System.out.println("Daily withdrawal limit exceeded.");
                System.out.println("You can withdraw a maximum of " + (dailyLimit - totalWithdrawn) + " today.");
                continue; // Skip further processing and start next iteration of the loop
            }

            totalWithdrawn += amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Total withdrawn today: " + totalWithdrawn);
        }

        scanner.close();
    }

}