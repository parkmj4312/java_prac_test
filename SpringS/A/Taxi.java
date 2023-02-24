package SpringS.A;

public class Taxi extends Car implements TaxiFunction{

    int max_user;
    int user;
    String dest;
    int base_distance;
    int dest_distance;
    int base_fee;
    int distance_fee;

    int fee_sum;
    public Taxi(int gas_amount, int cur_speed) {
        super(gas_amount, cur_speed);
        setState(1);
        max_user = 4;
        base_fee = 3000;
        distance_fee = 1000;
        base_distance = 1;
        System.out.println(car_num+" 번 택시 만들어짐!");
        System.out.println("주유량 : "+gas_amount);
        System.out.println("상태 : "+state);
    }

    public void race_start(int consum){
        gas_amount -= consum;
        if(gas_amount < 10){
            setState(2);
        }

    }
    public void user_board(int user, String dest,int dest_distance){
        if(setState(0) == 0){
            if(user <= max_user){
                this.user+=user;
                int sum = base_fee+(dest_distance-base_distance)*distance_fee;
                fee_sum += sum;
                this.dest = dest;
                this.dest_distance = dest_distance;
                System.out.println("탑승 승객 수 = "+user);
                System.out.println("잔여 승객 수 = "+(max_user-user));
                System.out.println("기본 요금 확인 = "+base_fee);
                System.out.println("목적지 : "+dest);
                System.out.println("목적지까지의 거리 : "+dest_distance+"Km");
                System.out.println("지불할 요금 : "+ sum);
                setState(0);
                System.out.println("상태 : "+state);

            }else{
                System.out.println("최대 승객 수 초과!!");
            }
        }else{
            System.out.println("탑승이 불가능 합니다");
        }
    }
    void setSpeed(){

    }
    void add_fee(){

    }
    public void payment(){
        System.out.println("주유량 : "+gas_amount);
        System.out.println("누적 요금 : "+ fee_sum);
        if(gas_amount < 10){
            System.out.println("주유 필요");
            System.out.println("상태 : "+state);
        }
    }

    @Override
    public boolean isBus() {
        return false;
    }


    @Override
    public int setState(int state) {
        if(state == 0){
            super.state = "운행 중";
        }else if(state == 1){
            super.state = "일반";
        }else if(state == 2){
            super.state = "운행 불가";
        }
        return state;
    }

}
