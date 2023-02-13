//2-4. 다음 중 변수를 잘못 초기화 한 것은?
//byte b = 256; //잘못 초기화
//char c = '';  //잘못 초기화
//char answer = 'no'; //잘못 초기화
//float f = 3.14 //잘못 초기화
double d = 1.4e3f; //초기화 성공


//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
System.out.println("1" + "2");//12
System.out.println(true+"");//true
System.out.println('A' + 'B');//131
System.out.println('1' + 2);//51
System.out.println('1' + '2');//99
System.out.println('J' +"ava");//Java
System.out.println(true + null); //오류



//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
public class Exercise2_8{
public static void main(String[] args){
int x = 1;
int y = 2;
int z = 3;
/*
알맞은 코드를 넣어 완성하세요.
*/
int temp_x = x;
int temp_y = y;
int temp_z = z;
x = temp_y;
y = temp_z;
z = temp_x;

System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);
}
}
//예상 결과 : x=2, y=3, z=1