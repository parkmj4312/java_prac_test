byte b = 10;
char ch = 'A';
int i = 100;
long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)

b = (byte) i; //생략 불가
ch = (char) b; //생략 불가
short s = (short) ch; //생략 불가
float f = (float) l; //생략 가능
i = (int) ch; //생략 가능

//3-2. 다음 연산의 결과와 그 이유를 적으세요.
class Exercise3_2{
public static void main(String[] args){
int x = 2;
int y = 5;
char c = 'A'; // 'A'의 문자코드는 65

      System.out.println(y >= 5 || x < 0 && x > 2); // y >= 5 true || x < 0은 false && x > 2는 false
        // true || false && false 이므로 && 논리연산자가 먼저 실행되어 true가 된다.
        System.out.println(y += 10 - x++);
        //y += 은 15이고 - x++는 2 이후 연산에서 1이 증가 하므로 13이 된다.
        System.out.println(x += 2);
        //x가 3인 상태이고 x += 2 를 하면 5가 된다.
        System.out.println(!('A' <= c && c <= 'Z'));
        //'A' 의 문자코드는 65 이고 c 역시'A'로 65이므로 true 이며 'Z'는 90이며 !(true && true)가 되어
        //최종적으로 false가 된다.
        System.out.println('C' - c);
        //'C'의 문자코드는 67이고 c의 'A'는 65 이므로 2가 된다.
        System.out.println('5' - '0');
        //'5'의 문자코드는 53이고 '0'의 문자코드는 48로 5가 된다.
        System.out.println(c + 1);
        //c의 'A'문자코드는 65이며 +1 을 하면 66이 된다.
        System.out.println(++c);
        //++선행 연산자로 연산값이 프린트되어 66번째 문자코드인 'B'가 된다.
        System.out.println(c++);
        //++후행 연산자로 연산값이 프린트 이후에 적용되어 위의 66의 값인 'B'가 된다.
        System.out.println(c);
        //위 코드에서 후행연산자 값이 반영 되어 67번 문자코드인 'C'가 된다.
    }

}

//3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
class Exercise3_3 {
public static void main(String[] args){
int num = 456;
System.out.println((int)Math.floor(num*0.01)*100);
}
}
//예상 결과 -> 400

//3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
class Exercise3_4{
public static void main(String[] args){
int numOfApples = 123; // 사과의 개수
int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
int numOfBucket = (/*빈 칸*/); // 모든 사과를 담는데 필요한 바구니의 수
if(numOfApples%sizeOfBucket != 0){
numOfBucket = (numOfApples/sizeOfBucket) + 1;
}else{
numOfBucket = (numOfApples/sizeOfBucket);
}

System.out.println("필요한 바구니의 수 :"+numOfBucket);

}
}
//예상 결과 -> 필요한 바구니의 수 :13

//3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
class Exercise3_5{
public static void main(String[] args){
int num = 10;
System.out.println(num == 0 ? 0 :num > 0 ? "양수" : "음수");
}
}
//예상 결과 : 양수

//3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
class Exercise3_6{
public static void main(String[] args){
int fahrenheit = 100;
float celcius = ((float)5/(float)9)*((float)fahrenheit-(float)32);
celcius = (int)(celcius * 1000)/(1000.0f);
System.out.println("Fahrenheit:"+fahrenheit);
System.out.println("Celcius:"+String.format("%.2f",celcius));
}
}
//예상 결과 : Fahrenheit:100, Celcius:37.78