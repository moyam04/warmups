public class ReplaceLetter{

    public static void main(String[] args) {
       replaceAll("squirrel",'r','s');
    }
    public static void replaceAll(String a, char x, char y) {
        a = a.replace(x,y);
        System.out.println(a);
        }
    }