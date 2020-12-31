package junit.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

// all test methods should be self contained - run independently
// best practise - 1 assertion for each test

class BankAccountTest {

    //several asserts are available however all are not used in this example

//    @org.junit.Before
//    void setup() {
//        BankAccount bankAccount = new BankAccount("joe", "smith", 1000, BankAccount.CHECKING);
//        System.out.println("running test");
//    }

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount bankAccount = new BankAccount("joe", "smith", 1000, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("test hasn't been added yet");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount bankAccount = new BankAccount("joe", "smith", 1000, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount bankAccount = new BankAccount("joe", "smith", 1000, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true(){
        BankAccount bankAccount = new BankAccount("joe", "smith", 100, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking());
    }

//    @org.junit.jupiter.api.Test
//    void dummyTest() {
//        assertEquals(20,21);
//    }

}