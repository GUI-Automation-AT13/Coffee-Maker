package org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation;

import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Pot.Pot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerCoffeeMakerTest {

    @Test
    public void removePotOverPlateHeater_WhenIWantRemovePotAgain_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.removePotOverPlateHeater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePotOverPlateHeater_WhenIWantRemovePot_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.removePotOverPlateHeater();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadPotOverHeaterPlatePot_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadPotOverHeaterPlatePot_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadPotOverHeaterPlatePot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadWater_ThereArentWater_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadWater(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadWater_ThereAreWater_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadWater(12);
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadWater(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadCoffeeBeans_WhenThereAreCoffee_False() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.loadCoffeeBeans();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.loadCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loadCoffeeBeans_WhenThereArentCoffee_True() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.loadCoffeeBeans();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void verifyConditionsForCoffeeMaker() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.verifyConditionsForCoffeeMaker();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printForInterface_WhenPrintOnInterfaceInmediatlyClean_StringEmpty() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        String expected = "";
        String actual = controllerCoffeeMaker.printForInterface();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void controllerCoffeeMakerTest1() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void controllerCoffeeMakerTest2() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        boolean expected = true;
        boolean actual = controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void controllerCoffeeMakerTest3() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.intermittencePlateHeater();
        controllerCoffeeMaker.intermittencePlateHeater();
        boolean expected = false;
        boolean actual = controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void controllerCoffeeMakerTest4() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.entryOption("1");
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getBoiler().getWorkingBoiler());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getFilterAndReceptacle().getCoffeeGrains());
    }

    @Test
    public void controllerCoffeeMakerTest5() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.entryOption("2");
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getBoiler().getWorkingBoiler());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getFilterAndReceptacle().getCoffeeGrains());
    }

    @Test
    public void controllerCoffeeMakerTest6() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.entryOption("3");
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getBoiler().getWorkingBoiler());
        Assert.assertTrue(controllerCoffeeMaker.getCoffeeMaker().getFilterAndReceptacle().getCoffeeGrains());
    }

    @Test
    public void controllerCoffeeMakerTest7() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.entryOption("4");
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getBoiler().getWorkingBoiler());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getFilterAndReceptacle().getCoffeeGrains());
    }

    @Test
    public void controllerCoffeeMakerTest8() {
        ControllerCoffeeMaker controllerCoffeeMaker = new ControllerCoffeeMaker();
        controllerCoffeeMaker.entryOption("5");
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getPot().obtainWorkingPot());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getBoiler().getWorkingBoiler());
        Assert.assertFalse(controllerCoffeeMaker.getCoffeeMaker().getFilterAndReceptacle().getCoffeeGrains());
    }
}