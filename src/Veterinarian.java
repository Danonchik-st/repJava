public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
        super();
    }

    public void treatment(Animal animal) {

       System.out.println("����� � ���� �� ������  "+animal.toString());

    }
}
