package B1_methods_and_constructor;

public class Tuna {

    private String girlName;

    public Tuna(String name) {
        girlName = name;
    }

    public void setName(String name) {
        girlName = name;
    }

    public String getName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("your  first gd was %s", getName()); // %s String

    }
}
