package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0 || dividend == 0) {
            System.out.println("division by zero");
        } else {
            int check = dividend/divider;
            boolean out = check*divider==dividend;
            if (out) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }
}
