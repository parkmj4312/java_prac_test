package SpringS.A;

public class Client {
    public static void main(String[] args){
//        Bus bus1 = new Bus(100, 0);
//        Bus bus2 = new Bus(100, 0);
//        bus1.user_board(2);
//        bus1.race(50);
//        bus1.gas_amount += 10;
//        bus1.setState(1);
//        bus1.setState(0);
//        bus1.user_board(45);
//        bus1.user_board(5);
//        bus1.race(55);
        Taxi taxi1 = new Taxi(100,0);
        Taxi taxi2 = new Taxi(100,0);
        taxi1.user_board(2,"서울역",2);
        taxi1.race_start(80);
        taxi1.payment();
        taxi1.user_board(5,"",0);
        taxi1.user_board(3,"구로디지털단지역",12);
        taxi1.race_start(20);
        taxi1.payment();

    }
}
