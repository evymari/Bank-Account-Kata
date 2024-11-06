package org.example.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    @Test
    void when_account_is_created_balance_is_zero() {
        // WHEN => Crear cuenta con balance inicial de 0
        Account account = new Account();
        // THEN => El balance debe ser 0
        double balance = account.getBalance();
        assertEquals(0, balance);
    }

    @Test
    void createAction() {
        // WHEN => Crear cuenta con balance inicial de 1000
        Account account = new Account(1000);
        // THEN => El balance debe ser 1000
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void when_deposit_account_must_be_sum_balanced() {
        // WHEN => Crear cuenta con balance inicial de 1000 y depositar 500
        Account account = new Account(1000);
        account.deposit(500);
        // THEN => El balance debe ser 1500
        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

    @Test
    void when_deposit_negative_amount_balance_remains_same() {
        // WHEN => Crear cuenta con balance inicial de 1000 y depositar -500
        Account account = new Account(1000);
        account.deposit(-500);
        // THEN => El balance debe seguir siendo 1000
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
    @Test
    void when_deposit_1300_negative_aamount_balance_remains_same() {
        Account account = new Account(1300);
        account.deposit(-500);
        double balance = account.getBalance();
        assertEquals(1300,account.getBalance());
    }
}
