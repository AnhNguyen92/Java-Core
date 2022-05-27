package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1603
 */
public class DesignParkingSystem {
	private int big;
    private int medium;
    private int small;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (this.big > 0) {
                this.big -= 1;   
                return true;
            }
        } else if (carType == 2) {
            if (this.medium > 0) {
                this.medium -= 1;
                return true;
            }
        } else if (carType == 3) {
            if (this.small > 0) {
                this.small -= 1;
                return true;
            }
        }
            return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */