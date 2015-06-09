public class MinMax {
    public static void main(String[] args) {
        Integer a,b,c;
        a = 10;
        b = 5;
        c = 3;

        // && - and
        // || - or
        if (a>b && a>c) {
            System.out.println("Max= a ="+ a);
        }else if(b>a && b>c){
            System.out.println("Max= b ="+ b);
        }else if (c>a && c>b){
            System.out.println("Max= c ="+ c);
        }
    }
}
