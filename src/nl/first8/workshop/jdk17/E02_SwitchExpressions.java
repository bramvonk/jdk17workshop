package nl.first8.workshop.jdk17;

import java.time.DayOfWeek;

public class E02_SwitchExpressions {

    // TODO: can you use a switch expression?
    // TODO: do you then still need the default? Why (not)? Can you compile it with a day missing? Why (not)?
    private float getPayRate(DayOfWeek dayOfWeek, boolean isVerySpecialDay) {
        float basePayRate;
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                basePayRate = 1.00f;
                break;
            case SATURDAY:
                basePayRate = 1.50f;
                break;
            case SUNDAY:
                basePayRate = 2.00f;
                break;
            default:
                throw new IllegalArgumentException("Invalid day " + dayOfWeek);
        }
        if (isVerySpecialDay) {
            return basePayRate * 1.50f;
        } else {
            return basePayRate;
        }
    }

    public static void main(String[] args) {
        System.out.println("On a very special Sunday, you will be paid " + new E02_SwitchExpressions().getPayRate(DayOfWeek.SUNDAY, true) * 100 + "%");
    }

}
