import java.util.Arrays;
import java.util.Collections;

class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

class Arrays2_2 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < num1.length; i++) {
            System.out.println("num1[" + i + "] = " + num1[i]);
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.println("num2[" + i + "] = " + num2[i]);
        }

        System.out.println();

        // 주의 할 점!
        int[] num3;
        // num3 = {1,2,3,4,5,6,7,8,9}; // Error 발생합니다.

        // 위처럼 나눠서 표현을 해야 한다면 아래처럼 초기화 하셔야 합니다.
        int[] num4;
        num4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < num4.length; i++) {
            System.out.println("num4[" + i + "] = " + num4[i]);
        }
    }
}

class Arrays3_1 {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        //  배열을 가리키는 참조 변수 arr 을 출력
        System.out.println("arr = " + arr);
        // 메모리 주소와 비슷한 문자열이 출력 -> 실제 주소는 아닙니다.
        // [I@7a81197d -> [(배열을 뜻함), I(int 타입을 뜻함), @(위치를 뜻함)

        // 예외 확인 하기 - char[]
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); // abcd 가 출력되는데 이는 println 메서드의 기능 때문!

        // 배열의 요소 하나씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Arrays.toString(배열) : 배열의 모든 요소를 문자열로 만들어서 반환한다.
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}

class Arrays3_2 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장
        float avg = 0f; // 평균을 저장

        int[] score = {100, 40, 33, 50, 77, 29};

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "] = " + score[i]);
            sum += score[i];
        }

        avg = sum / (float) (score.length); // 계산결과를 float 타입으로 얻기 위해 형변환

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + avg);
    }
}

class Arrays3_3 {
    public static void main(String[] args) {
        int[] score = {65, 97, 88, 43, 33, 91, 28};

        int max = score[0]; // 최대값을 배열의 첫 번째 값으로 초기화 한다.
        int min = score[0]; // 최소값을 배열의 첫 번째 값으로 초기화 한다.

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값 = " + max);
        System.out.println("최소값 = " + min);
    }
}

class Arrays3_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("원본 = " + Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int num = (int) (Math.random() * 10); // 0 ~ 9 의 랜덤 수

            int tmp = numArr[0]; // 배열의 첫 번째 수로 계속 초기화 된다.

            // 랜덤한 위치의 값과 배열의 첫 번째 수가 서로 바뀐다.
            numArr[0] = numArr[num];
            numArr[num] = tmp;

            System.out.println(i + 1 + " 번째 변경 : " + Arrays.toString(numArr));
        }

        System.out.println("결과 = " + Arrays.toString(numArr));
    }
}

class Arrays4_1 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch); // ch = D

        String str2 = str.substring(1, 4);
        System.out.println("str2 = " + str2); // str2 = BCD

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3); // str3 = BCDEFG

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4); // str4 = BCDEFG

        char[] chArr = str.toCharArray();
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
    }
}

class Arrays4_2 {
    public static void main(String[] args) {
        String[] strArr = {"축구", "야구", "골프", "테니스"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        String[] strArr2 = new String[4];
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
    }
}

class Arrays5_1 {
    public static void main(String[] args) {
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        //길이 확인하기
        System.out.println("score.length = " + score.length);
        System.out.println("score[0].length = " + score[0].length);

        System.out.println();
        // 출력 예 1 : Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println("Arrays.toString(score[0]) = " + Arrays.toString(score[0]));
        System.out.println("Arrays.toString(score[1]) = " + Arrays.toString(score[1]));
        System.out.println("Arrays.toString(score[2]) = " + Arrays.toString(score[2]));
        System.out.println("Arrays.toString(score[3]) = " + Arrays.toString(score[3]));

        System.out.println();
        // 출력 예 2 : for
        System.out.println("for");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
            }
            System.out.println();

        }

        System.out.println();
        // 출력 예 3 : 향상된 for
        System.out.println("향상된 for");
        for (int[] ints : score) {
            for (int it : ints) {
                System.out.println("anInt = " + it);
            }
            System.out.println();
        }
    }
}

class Arrays6_1 {
    public static void main(String[] args) {
        int[] num = {0, 1, 2};
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));
        System.out.println("Arrays.deepToString(score) = " + Arrays.deepToString(score));
        System.out.println();

        String[][] strArr1 = {
                {"AAA", "BBB", "CCC"},
                {"aaa", "bbb", "ccc"},
        };
        String[][] strArr2 = {
                {"AAA", "BBB", "CCC"},
                {"aaa", "bbb", "ccc"},
        };

        // 1 차원 비교에는 equals
        System.out.println("Arrays.equals(strArr1[0], strArr2[0]) = " + Arrays.equals(strArr1[0], strArr2[0])); // true
        System.out.println("Arrays.equals(strArr1[1], strArr2[0]) = " + Arrays.equals(strArr1[1], strArr2[0])); // false

        System.out.println("Arrays.equals(strArr1, strArr2) = " + Arrays.equals(strArr1, strArr2)); // false

        System.out.println();
        // 다차원 비교에는 deepEquals
        System.out.println("Arrays.deepEquals(strArr1, strArr2) = " + Arrays.deepEquals(strArr1, strArr2)); // true
    }
}

class Arrays6_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println();
        // copyOf
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOf(arr, 3);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 7); // 범위가 넘어가는 복사는 초기화값이 들어간다.
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        System.out.println();
        // copyOfRange
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("Arrays.toString(arr5) = " + Arrays.toString(arr5));
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);// 범위가 넘어가는 복사는 초기화값이 들어간다.
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6));
    }
}

class Arrays6_3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 5, 9, 2, 10, 7, 6, 4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println();

        Arrays.sort(arr); // 오름차순으로 정렬됩니다.
        System.out.println("sort");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}

class test {
    public static void main(String[] args) {
//        long n = 12345;
//        long answer = 0;
//        String s = "" + n;
//        char[] c = s.toCharArray();
//        Arrays.sort(c, Collections.reverseOrder());
        // 이 부분에 코드 넣으시면 될 것 같아요

    }
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        boolean flag = false;
        for (int i = 0; i < s.length() ; i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if ((s.length() == 4 || s.length() ==6) && flag == true){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
