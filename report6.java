class Exercise6_16 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}
//main메서드가 실행되고 "ABC123"이 출력되고 매개변수 str의 값이 저장되지 않고 "ABC123" 변경되고 출력된다.