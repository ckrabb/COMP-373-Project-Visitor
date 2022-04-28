//Computer implements ComputerPart interface

public class Computer implements ComputerPart {

    //Computer has a list of parts.
    ComputerPart[] parts;

    public Computer() {
        //parts initialized with one of each part.
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
