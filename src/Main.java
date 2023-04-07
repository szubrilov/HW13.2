public class Main {
    public static void main(String[] args) {
//        for (Month[] q : MonthUtils.getQuarters()) {
//            for (Month m : q) {
//                System.out.println(m.getName() + " (" + m.getWorkDays() + "/" +  m.getDays() + ")");
//            }
//        }
//        for (MonthUtils2.Month2[] q : MonthUtils2.getQuarters()) {
//            for (MonthUtils2.Month2 m : q) {
//                System.out.println(m.getName() + " (" + m.getWorkDays() + "/" +  m.getDays() + ")");
//            }
//        }

        Employee e1 = new Employee("John", 30, "male", 300);
        Employee e2 = new Employee("Kate", 25, "female", 200);
        Manager m1 = new Manager("Bill", 40, "male", 500, 10);
        Manager m2 = new Manager("Mary", 35, "female", 600, 20);
        BaseEmployee[] staff = new BaseEmployee[] {e1, e2, m1, m2};
        Month[] months = new Month[] {MonthUtils.m1, MonthUtils.m2, MonthUtils.m3};

        for (BaseEmployee be : staff) {
//            String empType = (be instanceof Employee) ? "Employee" : (be instanceof Manager) ? "Manager": "Other Type";
            String empType = be.getClass().toString().replace("class ", "");
            String numberOfSubordinates = (be instanceof Manager) ? " (number of subordinates: " + ((Manager) be).getNumberOfSubordinates() + ")": "";
            System.out.println(empType + " " + be.getName() + ", " + be.getSex() + ", " + be.getAge()
                    + " years old, salary for " + months.length + " months: " + be.getSalary(months) + numberOfSubordinates);
        }
    }
}