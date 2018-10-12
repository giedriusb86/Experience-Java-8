package academy.elqoo.java8.defaultmethods;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public interface Shape {

    static void moveXPosWith10(List<AbstractShape> shapes) {
        shapes.forEach(abstractShape -> abstractShape.setXPos(abstractShape.getXPos()+10));
    }

    int getXPos();

    int getYPos();

    void setXPos(int xPOs);

    void setYPos(int yPos);

    default String getName(){
        return getClass().getSimpleName();
    }


    default void move(int i, int i1) {
        setXPos(i);
        setYPos(i1);
    }

    default void notImplementedMethod() {
        throw new NotImplementedException();
    }
}
