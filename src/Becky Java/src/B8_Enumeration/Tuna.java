package B8_Enumeration;

public enum Tuna {
    bucky("nice", "22"),
    kelsey("cutie","10"),
    julia("bigmistake", "12");

    private final String desc;
    private final String year;

    Tuna(String description, String birthday){
        desc =  description;
        year = birthday;
    }

    public String getDesc(){
        return desc;
    }

    public String getYear(){
        return year;
    }

}
