/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les17;
import java.io.Serializable;

/**
 *
 * @author Pooh
 */
public class Circle implements Serializable{

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
