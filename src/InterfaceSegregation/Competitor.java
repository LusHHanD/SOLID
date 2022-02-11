package InterfaceSegregation;

public class Competitor implements Swim{
    @Override
    public void compete() {
        System.out.println("Competitor started competing");
    }

    @Override
    public void swim() {
        System.out.println("Competitor started swimming");
    }
}
