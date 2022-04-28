//Main

public class ComputerVisitorPattern {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        ComputerPart mouse = new Mouse();
        System.out.println();
        mouse.accept(new ComputerPartDisplayVisitor());

    }
}
