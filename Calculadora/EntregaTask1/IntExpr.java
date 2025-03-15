public class IntExpr {
    private int value;

    public IntExpr(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static IntExpr add(IntExpr left, IntExpr right) {
        return new IntExpr(left.getValue() + right.getValue());
    }

    public static IntExpr mult(IntExpr left, IntExpr right) {
        return new IntExpr(left.getValue() * right.getValue());
    }

    public static IntExpr sub(IntExpr left, IntExpr right) {
        return new IntExpr(left.getValue() - right.getValue());
    }

    public static IntExpr div(IntExpr left, IntExpr right) {
        return new IntExpr(left.getValue() / right.getValue());
    }
}
