public class RewardValue {
    private double cashValue;
    private double mileValue;

    final private double CONVERSION_VALUE = 0.0035;

    public RewardValue(double cash) {
        cashValue = cash;
        mileValue = cash / CONVERSION_VALUE;
    }

    public RewardValue(int miles) {
        mileValue = miles;
        cashValue = miles * CONVERSION_VALUE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return mileValue;
    }
}
