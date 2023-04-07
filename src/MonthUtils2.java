public class MonthUtils2 {
    public final static Month2 m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;

    static {
        m1 = new Month2("Jan", 31, 22);
        m2 = new Month2("Feb", 28, 20);
        m3 = new Month2("Mar", 31, 23);
        m4 = new Month2("Apr", 30, 20);
        m5 = new Month2("May", 31, 23);
        m6 = new Month2("Jun", 30, 22);
        m7 = new Month2("Jul", 31, 21);
        m8 = new Month2("Aug", 31, 23);
        m9 = new Month2("Sep", 30, 21);
        m10 = new Month2("Oct", 31, 22);
        m11 = new Month2("Nov", 30, 22);
        m12 = new Month2("Dec", 31, 21);
    }

    static class Month2 {
        private String name;
        private int days;
        private int workDays;

        private Month2(String name, int days, int workDays) {
            this.name = name;
            this.days = days;
            this.workDays = workDays;
        }
        public String getName() {
            return name;
        }

        public int getDays() {
            return days;
        }

        public int getWorkDays() {
            return workDays;
        }
    }
    public static Month2[][] getQuarters() {
        return new Month2[][] {{m1, m2, m3}, {m4, m5, m6}, {m7, m8, m9}, {m10, m11, m12}};
    }
    public static Month2[][] getHalfYear() {
        return new Month2[][] {{m1, m2, m3, m4, m5, m6}, {m7, m8, m9, m10, m11, m12}};
    }
    public static Month2[] getYear() {
        return new Month2[] {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
    }
}
