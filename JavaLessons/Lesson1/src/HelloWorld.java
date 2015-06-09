class HelloWorld{
    public static void main(String[] args) {
        Integer a = 100; //цел�?ное

        /*
        a = 10;
        a = a + 148;
        */

        Integer b = 15;

        b = a / b;
        a = a / b;
        b = a + b;

        b = a - b;
        b = a * b;

        //10.0 - Double

        Float d; //Дробная
        Double c; //Дробная

        String s = "213456uikjhbhjghfgdfdb ";

        //=  при�?ваивание
        //== �?равнение

        if (a == 10){
           a = 148;
        }

        //<, > , ==, <=, >=, !=

        if (a == 148){
            a = 145;
        }else{
            a = 1345;
            b = 123;
            a = a + 124;
        }


        //циклы
        a = 1;
        while(a != 10){
            a = a + 1;
        }

        System.out.println(a + " " + 14);
    }
}