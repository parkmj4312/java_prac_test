package SpringS.A;

public interface TaxiFunction {
    abstract public void race_start(int consum);

    abstract public void payment();

    abstract public void user_board(int user, String dest,int dest_distance);
}
