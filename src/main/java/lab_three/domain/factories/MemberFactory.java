package lab_three.domain.factories;

import lab_three.domain.factories.Member;
import lab_three.domain.models.Librarian;
import lab_three.domain.models.Student;

public class MemberFactory {
    public static Member createMember(String memberType) {
        return switch (memberType.toLowerCase()) {
            case "librarian" -> new Librarian();
            case "student" -> new Student();
            default -> throw new IllegalArgumentException("No such member type!");
        };
    }
}
