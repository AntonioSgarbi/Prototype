package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Shape;
import tech.antoniosgarbi.ShapeCache;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("");
        System.out.println("Shape: " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("");
        System.out.println("Shape: " + clonedShape.getType());

        clonedShape = (Shape) ShapeCache.getShape("");
        System.out.println("Shape: " + clonedShape.getType());

    }

}