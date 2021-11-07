package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	
    	StrictBankAccount b1 = new StrictBankAccount(1, 10000, 10);
    	
    	try {
    		b1.withdraw(1, 10001);
    	}catch(NotEnoughFoundsException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	try {
    		b1.withdraw(2, 15);
    	}catch(WrongAccountHolderException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	try {
    		for(int i = 0; i < 20; i++) {
    			b1.withdrawFromATM(1, 15);
    		}
    	}catch(TransactionsOverQuotaException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
