package behavioral.visitor;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ElementB implements Element {

    public String returnStackTrace()
    {
        return Stream.of(Thread.currentThread().getStackTrace()).map(x -> "    " + x.toString()).collect(Collectors.joining("\n"));
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("ElementB.accept() method");
        v.visit(this);
    }
}
