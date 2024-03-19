public class RewardValue {
    private double cashValue;
    private int mileValue;

    final private double CONVERSION_VALUE = 0.0035;

    public RewardValue(double cash) {
        cashValue = cash;
        mileValue = (int) (cash / CONVERSION_VALUE);
    }

    public RewardValue(int miles) {
        mileValue = miles;
        cashValue = miles * CONVERSION_VALUE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return mileValue;
    }
}
