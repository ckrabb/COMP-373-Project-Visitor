//ComputerPart uses composite classes of Mouse, Computer, Keyboard and Monitor without changing
// the structure of the classes.

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
