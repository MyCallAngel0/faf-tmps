package lab_three.domain.factories;

import lab_three.domain.factories.Member;
import lab_three.domain.models.Librarian;
import lab_three.domain.models.Student;

public class MemberProxy implements Member {
    private final Member member;
    private final String memberType;

    public MemberProxy(String memberType) {
        this.memberType = memberType.toLowerCase();

        this.member = switch (this.memberType) {
            case "librarian" -> new Librarian();
            case "student" -> new Student();
            default -> throw new IllegalArgumentException("No such member type!");
        };
    }

    @Override
    public void accessLibraryResources() {
        if (memberType.equals("librarian")) {
            member.accessLibraryResources();
        } else if (memberType.equals("student")) {
            System.out.println("Accessing limited resources as a student.");
        } else {
            System.out.println("Access denied. Invalid member type.");
        }
    }
}
