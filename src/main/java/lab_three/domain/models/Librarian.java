package lab_three.domain.models;

import lab_three.domain.factories.Member;

public class Librarian implements Member {
    @Override
    public void accessLibraryResources() {
        System.out.println("Accessing library resources as a librarian");
    }
}