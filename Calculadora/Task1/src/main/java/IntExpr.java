public class IntExpr {
    private static int errorValue = -2147483647;
    private int value;

    public IntExpr(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static IntExpr add(IntExpr left, IntExpr right) {
        //TODO: Provide this method with a correct implementation
        if ((left.getValue() == errorValue) || (right.getValue() == errorValue)){
            return new IntExpr(errorValue);
        }
        return new IntExpr(left.getValue() + right.getValue());
    }

    public static IntExpr mult(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        if ((left.getValue() == errorValue) || (right.getValue() == errorValue)){
            return new IntExpr(errorValue);
        }
        return new IntExpr(left.getValue() * right.getValue());
    }

    public static IntExpr sub(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        if ((left.getValue() == errorValue) || (right.getValue() == errorValue)){
            return new IntExpr(errorValue);
        }
        return new IntExpr(left.getValue() - right.getValue());
    }

    public static IntExpr div(IntExpr left, IntExpr right) {
        // TODO: Provide this method with a correct implementation
        if (right.getValue() == 0){
            return new IntExpr(errorValue);
        }
        return new IntExpr(left.getValue() / right.getValue());
    }

}
