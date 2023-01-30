public class Counting{

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("When should I stop counting to: ");
        int x = input.nextInt();
        System.out.print("Which step should I use: ");
        int y = input.nextInt();
        int z = 1;

        System.out.print("I am counting until " + x + " with a step of "+ y + ": ");

        while (z <= x) {
            System.out.printf("%5d", z);
            z +=y;
        }
    }
}