package B7_Composition;

public class Tuna {
    private String name;
    private Potpie birthday;

    public Tuna(String thename, Potpie theDate) {
        name = thename;
        birthday = theDate;
    }

    public String toString() {
        return String.format("My Name is %s , my bithday is %s", name, birthday);
    }



}
