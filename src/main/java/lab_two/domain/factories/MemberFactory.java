package lab_two.domain.factories;

import lab_two.domain.models.Librarian;
import lab_two.domain.models.Student;

public class MemberFactory {
    public static Member createMember(String memberType) {
        return switch (memberType.toLowerCase()) {
            case "librarian" -> new Librarian();
            case "student" -> new Student();
            default -> throw new IllegalArgumentException("No such member type!");
        };
    }
}