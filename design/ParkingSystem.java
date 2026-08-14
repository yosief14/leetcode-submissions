
import java.lang.reflect.Array;
import java.util.*;
import java.lang.reflect.Constructor;

/*
 * @lc app=leetcode id=1603 lang=java
 *
 * [1603] Design Parking System
 */

// @lc code=start
public class ParkingSystem {

    private final int[] slots; 
    public ParkingSystem(int big, int medium, int small) {
        this.slots = new int[] { 0, big, medium, small};
    }


    public boolean addCar(int carType) {
        if (slots[carType] == 0) return false;
        slots[carType] --;
        return true;
    }
    
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
// @lc code=end
