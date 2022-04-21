package JavaEx1;

public class Four {

    public void one() {
        int x = 15;
        int year = 100;
        boolean result;
        if (x > 10 && x < 20) {
            result = true;
            System.out.println(result+"1");
        }
        char ch = 0x10;

        if (ch != 0x20  && ch != 0x09) {
            result = true;
            System.out.println(result+"2");
        }
        ch = 'x';
        if (ch == 0x58 || ch == 0x78) {
            result = true;
            System.out.println(result+"3");
        }
        ch = '7';
        if (ch > 0x2f && ch < 0x3a) {
            result = true;
            System.out.println(result+"4");
        }
        ch = 'a';
        if ((ch > 0x40 && ch < 0x5b) || (ch > 0x60 && ch < 0x7b)) {
            result = true;
            System.out.println(result+"5");
        }
        year = 8;
        if (((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0)) {
            result = true;
            System.out.println(result+"6");
        }
        boolean powerOn = false;
        if (!powerOn) {
            result = true;
            System.out.println(result+"7");
        }
        String str = "yes";
        if (str.equals("yes")) {
            result = true;
            System.out.println(result+"8");
        }
    }

    public void two() {
        int result = 0;

        for (int i = 1; i < 21; i++) {
            if ((i % 2 != 0) && (i % 3 != 0)) {
                result += i;
            }
        }

        System.out.println(result);
    }

    public void three() {
        int result1 = 0;
        int result2 = 0;
        for (int i = 1; i < 11; i++) {
            result1 += i;
            result2 += result1;
        }
        System.out.println(result2);
    }

}
