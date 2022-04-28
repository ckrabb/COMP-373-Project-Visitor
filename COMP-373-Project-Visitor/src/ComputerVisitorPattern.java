//Main

public class ComputerVisitorPattern {

    public static void main(String[] args) {
        //New 'computer' part created
        ComputerPart computer = new Computer();
        //Created computer part accepts Visitor
        computer.accept(new ComputerPartDisplayVisitor());
        //Spacer
        System.out.println();
        //Second test with just a 'mouse' part created.
        ComputerPart mouse = new Mouse();
        //Created mouse part accepts Visitor
        mouse.accept(new ComputerPartDisplayVisitor());

    }
}
