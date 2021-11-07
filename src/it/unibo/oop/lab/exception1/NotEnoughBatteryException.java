package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException {

    /**
     * 
     */
    private static final long serialVersionUID = 5322262957171100503L;
    private final double batteryLevel;

    /**
     * Construct new instance of the exception.
     * 
     * @param initX
     *            position on X that caused the exception
     * @param initY
     *            position on Y that caused the exception
     */
    public NotEnoughBatteryException(final double batteryLevel) {
        super();
        this.batteryLevel = batteryLevel;
    }

    /**
     * 
     * @return the string representation of instances of this class
     */
    @Override
    public String toString() {
        return "Can not perform the action, battery percentage remained: " + batteryLevel + "% .";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
