package JavaEx1;

public class Three {
    public void Two() {
        int numOfApples = 123;
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (13); // 모든 사과를 담는데 필요한 바구니의 수
        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }

    public void Three() {
        int num = 10;
        System.out.println((num == 0) ? "0" : (num < 0) ? "음수" : "양수");
    }

    public void four() {
        int num = 456;
        System.out.println(num / 100 * 100);
    }

    public void five() {
        int num = 333;
        System.out.println(num - (num / 100) + 1);
    }

    public void six() {
        int num = 100;
        System.out.println(((10 - num % 10) + num) - num);
    }

    public void seven() {
        int fahrenheit = 100;
        float celcius = (float) 5 / 9 * (fahrenheit - 32);

        if (celcius * 100 - (int) (celcius * 100) > (float) (1 / 2)) {
            celcius = (float) ((int) (celcius * 100) + 1) / 100;
        } else {
            celcius = (float) ((int) (celcius * 100)) / 100;
        }

//        String test = String.format("%.2f", celcius);
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }

    public void eight() {

        byte a = 10;
        byte b = 20;
        byte c = a + b;
        char ch = 'A';
        ch = ch + 2;
        float f = 3 / 2;
        long l = 3000 * 3000 * 3000;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = d == f2;
        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);
    }

    public void nine(){
        char ch = 'z';
        boolean b = ( /* (1) */ );
        System.out.println(b);
    }

    public void ten(){
        char ch = 'A';
        char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}



