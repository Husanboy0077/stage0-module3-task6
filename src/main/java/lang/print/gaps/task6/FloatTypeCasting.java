package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float myDouble = 9.7f;
        int myInt = (int) (numberToBeRounded+0.5); // Manual casting: double to int

        //System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
