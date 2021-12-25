package HW1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Box <T extends Fruit> {
    private List<T> fruits;

    public Box(T... newFruits) {
        this.fruits = new ArrayList<>(Arrays.asList(newFruits));
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float sum = 0.0f;
        for (int i = 0; i < fruits.size(); i++) {
            sum += Fruit.getFruitWeight();
        }
        return sum;
    }

    public boolean compareBox(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void replaceBox(Box <T> another){
        if (this == another)
            return;
        else {
            another.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}
