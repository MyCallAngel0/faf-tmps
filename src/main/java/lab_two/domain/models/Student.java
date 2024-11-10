package lab_two.domain.models;

import lab_two.domain.factories.Member;

public class Student implements Member {
    @Override
    public void accessLibraryResources() {
        System.out.println("Accessing library resources as a student");
    }
}
