public class SwapInt{

    public static void main(String[] args) {
        System.out.println(swap(5, 6));
    }
    public static String swap(int x, int y){
        System.out.println("Before swap x is " + x + " and y is " + y);
        int temp = x;
        x = y;
        y = temp;
        return "After swap x is " + x + " and y is " + y;
    }
}