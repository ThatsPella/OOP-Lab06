package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {
	
	private static final long serialVersionUID = 5322262957171100503L;
	private int usrID;
	
    /**
     * Construct new instance of the exception.
     * 
     * @param initX
     *            position on X that caused the exception
     * @param initY
     *            position on Y that caused the exception
     */
    public WrongAccountHolderException(final int usrID) {
        super();
        this.usrID = usrID;
    }

    /**
     * 
     * @return the string representation of instances of this class
     */
    @Override
    public String toString() {
        return "Error! You're operating in an unauthorized account. UserID unauthorized: " + usrID + " .";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
