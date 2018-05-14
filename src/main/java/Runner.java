import db.DBGolfer;
import models.Golfer;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Jack", "Nicklaus", 80);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Tiger", "Woods", 45);
        DBGolfer.save(golfer2);

    }
}
