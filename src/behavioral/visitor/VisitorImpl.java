package behavioral.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(ElementA el) {
        el.printSomeInfo();
    }

    @Override
    public void visit(ElementB el) {
        System.out.println(el.returnStackTrace());
    }
}
