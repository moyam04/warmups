public class ThreeIntegers{

    public static void main(String[] args) {
        System.out.println(method1(7,4,10));

    }
    public static boolean method1(int x, int y, int z){
        if (z == 3 || z == x + y){
           return true;
    }
        else {
            return false;
    }
}}