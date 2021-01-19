package edu.robinmeyssonnier.tests;

import edu.robinmeyssonnier.Calculatrice;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @org.junit.Test
    public void addition() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(2, calculatrice.addition(1,1));
    }
}