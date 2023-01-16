package inheritance;

public class InheritanceTester {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");

        Mother mom = new Mother();
        mom.setName("Glen");

        System.out.println(mom.getName()+ " is a "+ mom.getGender());
    }
}
