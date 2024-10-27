package lab_one.factory;

public class Student implements Member {
    @Override
    public void accessLibraryResources() {
        System.out.println("Accessing library resources as a student");
    }
}
