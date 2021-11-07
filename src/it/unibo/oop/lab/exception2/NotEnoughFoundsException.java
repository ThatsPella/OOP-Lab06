package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {
	
	private static final long serialVersionUID = 5322262957171100503L;
	private double amount;
	
    /**
     * Construct new instance of the exception.
     * 
     * @param initX
     *            position on X that caused the exception
     * @param initY
     *            position on Y that caused the exception
     */
    public NotEnoughFoundsException(final double amount) {
        super();
        this.amount = amount;
    }

    /**
     * 
     * @return the string representation of instances of this class
     */
    @Override
    public String toString() {
        return "Error! Not enough founds to withdraw. Attempted amount: " + amount + " .";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
