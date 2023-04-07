public abstract class BaseEmployee {
//    private String name;
//    private int age;
//    private String sex;
//    private int daySalary;
//
//    public BaseEmployee(String name, int age, String sex, int daySalary) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.daySalary = daySalary;
//    }

    public abstract String getName();

    public abstract int getAge();

    public abstract String getSex();

    public abstract int getDaySalary();

    public abstract int getSalary(Month[] monthArray);
}
