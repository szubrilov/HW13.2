public final class Employee extends BaseEmployee {
    private String name;
    private int age;
    private String sex;
    private int daySalary;

    public Employee(String name, int age, String sex, int daySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daySalary = daySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getDaySalary() {
        return daySalary;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int i = 0;
        for (Month m : monthArray) {
            i += m.getWorkDays();
        }
        return getDaySalary() * i;
    }
}
