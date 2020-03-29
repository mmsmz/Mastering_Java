package B4_TimeClass_public_private_and_this;

public class Tuna {
    private int hour = 3;
    private int minute = 40;
    private int second = 50;  // when running this program java looks in to these variable and not the setTime variable

    public void setTime(int hour, int minute, int second ) {
//            hour = 4;
//            minute = 6;
//            second = 8;

        this.hour = 4;
        this.minute = 6;
        this.second = 8;
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute,second);
    }

    public String toString(){ // %02d means two decimal places
        return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12) ? 12 :hour%12), minute , second , ((hour<12) ? "AM" : "PM"));
    }

}
