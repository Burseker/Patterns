package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern");

        List<Element> elementList = new ArrayList<>();
        elementList.add(new ElementA());
        elementList.add(new ElementB());
        elementList.add(new ElementB());

        Visitor visitor = new VisitorImpl();

        for( Element element : elementList ){
            element.accept(visitor);
        }
    }
}
