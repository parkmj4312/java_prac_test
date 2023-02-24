package Spring_SA;

public class Bus extends Car implements BusFunction{
    int max_user;
    int cur_user = 0;
    int fee;
    int fee_sum = 0;

    public Bus(int gas_amount, int cur_speed) {
        super(gas_amount, cur_speed);
        max_user = 30;
        fee = 1000;
        setState(0);
        System.out.println(car_num+" 번 버스 만들어짐!");
    }

    public void race(int consum){
        gas_amount -= consum;
        System.out.println("주유량 : "+gas_amount);
        setState(0);
    }

    public void user_board(int user){
        if(setState(0) == 0){
            if(user <= max_user){
                cur_user+=user;
                int sum = fee*user;
                fee_sum += sum;
                System.out.println("탑승 승객 수 = "+user);
                System.out.println("잔여 승객 수 = "+(max_user-cur_user));
                System.out.println("요금 확인 = "+sum);
            }else{
                System.out.println("최대 승객 수 초과!!");
            }
        }else{
            System.out.println("탑승이 불가능 합니다");
        }
    }

    void setSpeed(int speed){
        if(gas_amount < 10){
            System.out.println("주유량을 확인해 주세요.");
        }else{
            super.cur_speed = speed;
        }
    }

    @Override
    public boolean isBus() {
        return true;
    }
    @Override
    public int setState(int state) {
        if(gas_amount < 10){
            state = 1;
            System.out.println("주유가 필요합니다.");
        }
        if(state == 0){
            super.state = "운행";
        }else if(state == 1){
            super.state = "차고지 행";
            System.out.println("상태 : "+super.state);
            System.out.println("주유량 : "+super.gas_amount);
        }
        return state;
    }
}
