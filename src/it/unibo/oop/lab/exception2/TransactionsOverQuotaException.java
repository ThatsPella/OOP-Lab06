package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException {
	
	private static final long serialVersionUID = 5322262957171100503L;
	
    /**
     * Construct new instance of the exception.
     * 
     * @param initX
     *            position on X that caused the exception
     * @param initY
     *            position on Y that caused the exception
     */
    public TransactionsOverQuotaException() {
        super();
    }

    /**
     * 
     * @return the string representation of instances of this class
     */
    @Override
    public String toString() {
        return "Error! Number of allowed ATM transactions exceeded.";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
