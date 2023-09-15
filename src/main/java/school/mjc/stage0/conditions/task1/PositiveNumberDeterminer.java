package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        boolean positive = true;
        if(numberToBeDetermined > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        new PositiveNumberDeterminer().isPositive(0);
    }
}
