public class MonthUtils {
    public final static Month m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
//    public static Month[][] Quarters = new Month[4][3];
//    public static Month[][] halfYear = new Month[2][6];
//    public static Month[] year = new Month[12];

    static {
        m1 = new Month("Jan", 31, 22);
        m2 = new Month("Feb", 28, 20);
        m3 = new Month("Mar", 31, 23);
        m4 = new Month("Apr", 30, 20);
        m5 = new Month("May", 31, 23);
        m6 = new Month("Jun", 30, 22);
        m7 = new Month("Jul", 31, 21);
        m8 = new Month("Aug", 31, 23);
        m9 = new Month("Sep", 30, 21);
        m10 = new Month("Oct", 31, 22);
        m11 = new Month("Nov", 30, 22);
        m12 = new Month("Dec", 31, 21);
    }
    public static Month[][] getQuarters() {
        return new Month[][] {{m1, m2, m3}, {m4, m5, m6}, {m7, m8, m9}, {m10, m11, m12}};
    }
    public static Month[][] getHalfYear() {
        return new Month[][] {{m1, m2, m3, m4, m5, m6}, {m7, m8, m9, m10, m11, m12}};
    }
    public static Month[] getYear() {
        return new Month[] {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
    }
}
