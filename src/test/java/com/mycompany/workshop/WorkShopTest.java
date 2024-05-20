/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.workshop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jessica van Heerden
 */
public class WorkShopTest {
    
    
    @Test
    public void testCaloriesCalc() {
        String[] ingredients = {"apple", "banana", "chicken breast", "rice", "spinach"};
        int[] calorieValues = {52, 89, 165, 130, 7};

        // Test with existing ingredient
        assertEquals(52, WorkShop.caloriesCalc("apple", ingredients, calorieValues));
        assertEquals(89, WorkShop.caloriesCalc("banana", ingredients, calorieValues));
        assertEquals(165, WorkShop.caloriesCalc("chicken breast", ingredients, calorieValues));
        assertEquals(130, WorkShop.caloriesCalc("rice", ingredients, calorieValues));
        assertEquals(7, WorkShop.caloriesCalc("spinach", ingredients, calorieValues));

        // Test with non-existing ingredient
        assertEquals(-1, WorkShop.caloriesCalc("orange", ingredients, calorieValues));
    }
    
    
     @Test
    public void testCaloriesDIV() {
        assertEquals(26, WorkShop.caloriesDIV(52));
        assertEquals(44, WorkShop.caloriesDIV(89));
        assertEquals(82, WorkShop.caloriesDIV(165));
        assertEquals(65, WorkShop.caloriesDIV(130));
        assertEquals(3, WorkShop.caloriesDIV(7));
    }
}
    
