public class Alphabetical{

    public static void main(String[] args) {
       alphaString("hugo","gale");
    }
    public static void alphaString(String a, String b) {
       if (a.compareTo(b)<0)
        System.out.println(a);
       else System.out.println(b);
        }
    }