package B11_More_Static;

public class Tuna {
    private String firstname;
    private String lastname;
    private static int members = 0;


    public Tuna(String fn, String ln) {
        firstname = fn;
        lastname = ln;
        members++;
        System.out.printf("Constructor for %s %s, members in the club: %d\n", firstname, lastname, members);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static int getMembers() {
        return members;
    }
}
