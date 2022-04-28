//Keyboard implements ComputerPart interface

public class Keyboard implements ComputerPart{
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
