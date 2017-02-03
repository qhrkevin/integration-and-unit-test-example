/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bryanbergen.testproject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author bryan
 */
public class LogicClassIT {

    public LogicClassIT() {
    }

    /**
     * Test of doExternalThing method, of class LogicClass.
     */
    @Test
    public void testDoExternalThing() {
        System.out.println("[TEST]: Integration Test");
        assertTrue(new LogicClass().doExternalThing());
    }

}
