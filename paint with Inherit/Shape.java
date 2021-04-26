package com.company;

/**
 * This class is a common method of any shape
 * and is inherited by its geometric shapes
 *
 */
public   class  Shape {
    /**
     * This method calculates the Perimeter
     * @return Shape area Perimeter
     */
    public   double calculatePerimeter()
    {
        return 0;
    }

    /**
     * This method calculates the area
     * @return Shape area
     */
    public   double calculateArea() {
         return 0;
    }

    /**
     * This method returns shape information as a string
     * @return  Figure information
     */
    public   String toString() {
         return null;
    }

    /**
     * This method compares the equality of
     * the two formed by it
     * @param o The object being checked for equality
     * @return Answer Check that the two objects are the same
     */
    public    boolean equals(Object o) {
        return false;
    }

    /**
     * This method prints the name,
     * environment, and area of the shape
     */
    public void draw() {

    }
}
