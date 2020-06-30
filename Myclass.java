public class Myclass {
   
    public static void main(String[] args) {
        Integer a = method1("1");
        if (a == 0 && a != null) {
            System.out.println(a);
        }
    }

    private static Integer method1(String str) {
        if (Integer.parseInt(str) > 0) {
            return null;
        } else {
            return 100;
     }
    }
}
