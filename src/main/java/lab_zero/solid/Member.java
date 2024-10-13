package lab_zero.solid;

public class Member {
    private final String name;
    private final String surname;
    private final int id;

    public Member(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (Member ID: " + id + ")";
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getMemberId() { return id; }
}
