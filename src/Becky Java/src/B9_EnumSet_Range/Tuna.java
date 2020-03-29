package B9_EnumSet_Range;

public enum Tuna {
    bucky("nice", "22"),
    kelsey("cutie","10"),
    nicole("italian", "12"),
    candy("bigmistake", "14"),
    erin("iwish", "16");

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
