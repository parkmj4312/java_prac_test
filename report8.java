
//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        int count = 1;
        for (int i = 1; i < CARD_NUM+1; i++) {
            if(i%2 != 0) {
                if (count == 1 || count == 3 || count == 8) {
                    cards[i - 1] = new SutdaCard(count, true);
                    cards[i] = new SutdaCard(count, false);
                    count++;
                }else{
                    cards[i - 1] = new SutdaCard(count, false);
                    cards[i] = new SutdaCard(count, false);
                    count++;
                }


            }
        }
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다. 
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}


//7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.

//메서드명 : shuffle
//기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//반환타입 : 없음
//매개변수 : 없음

//메서드명 : pick
//기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//반환타입 : SutdaCard
//매개변수 : int index - 위치

//메서드명 : pick
//기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//반환타입 : SutdaCard
//매개변수 : 없음
class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        int count = 1;
        for (int i = 1; i < CARD_NUM+1; i++) {
            if(i%2 != 0) {
                if (count == 1 || count == 3 || count == 8) {
                    cards[i - 1] = new SutdaCard2(count, true);
                    cards[i] = new SutdaCard2(count, false);
                    count++;
                }else{
                    cards[i - 1] = new SutdaCard2(count, false);
                    cards[i] = new SutdaCard2(count, false);
                    count++;
                }


            }
        }
    }

    void shuffle() {
        SutdaCard2 temp;
        int random = (int) (Math.random() * 19);
        for (int i = 0; i < CARD_NUM; i++) {
            temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }

    SutdaCard2 pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard2 pick() {
        // (구현)
        return cards[(int) (Math.random() * 19)];
    }
} // SutdaDeck

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2


//7-3. 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product() { // 상속받은 개체에서는 부모객체와 같거나 내용이 추가 되어야 하는데 부모객체에 생성자가 없어서

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
    }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}


//7-4. MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
//대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.
class MyTv1 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)

}

class Exercise7_4 {
    public static void main(String args[]) {
        MyTv1 t = new MyTv1();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20


//7-5. 문제7-4에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 기능 의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
//메서드명 : gotoPrevChannel
//기 능 : 현재 채널을 이전 채널로 변경한다.
//반환타입 : 없음
//매개변수 : 없음
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    // (구현)
    private int prevChannel2;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        // (구현)
        prevChannel2 = channel;
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    // (구현)
    public void gotoPrevChannel() {
        channel = prevChannel;
        prevChannel = prevChannel2;
    }
}

class Exercise7_5 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

// CH:10
// CH:20
// CH:10
// CH:20