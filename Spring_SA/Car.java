package Spring_SA;

abstract public class Car {
    String car_num;
    int gas_amount;
    int cur_speed;
    String state;

    public Car(int gas_amount,int cur_speed){
        this.gas_amount = gas_amount;
        this.cur_speed = cur_speed;
        this.car_num = generate_num();
    }

    public String generate_num(){
        String num = "";
        if(isBus()){
            num += "버스";
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
        }else{
            num +="택시";
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
            num += ""+(int)(Math.random()*9);
        }
        return num;
    }
    abstract public boolean isBus();

    public abstract int setState(int state);

    public abstract void setSpeed(int speed);
}
