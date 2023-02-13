public class report2 {
    public static void main(String args[]) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        //3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)

        b = (byte)i; //생략 불가
        ch = (char)b; //생략 불가
        short s = (short)ch; //생략 불가
        float f = (float)l; //생략 가능
        i = (int)ch; //생략 가능

        Excersize3_2();
    }
    public static void Excersize3_2(){
        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // y >= 5 true || x < 0은 false && x > 2는 false
        // true || false && false 이므로 true가 되어 최종적으로
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
