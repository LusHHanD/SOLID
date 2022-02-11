package DependencyInversion;

public class FrontendDeveloper implements Developer{
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
    }
}
