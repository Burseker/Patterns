package behavioral.visitor;

public class ElementA implements Element {

    public void printSomeInfo(){
        System.out.println("    This info line prints from " + this.getClass());
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("ElementA.accept() method");
        v.visit(this);
    }
}
