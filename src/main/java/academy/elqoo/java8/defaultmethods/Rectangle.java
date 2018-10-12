package academy.elqoo.java8.defaultmethods;

public class Rectangle extends AbstractShape implements NamedObject {

    @Override
    public String getName() {
        return NamedObject.super.getName();
    }
}
