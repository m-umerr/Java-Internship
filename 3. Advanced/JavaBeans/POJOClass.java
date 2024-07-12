package O11.JavaBeans;

public class POJOClass {
    private int empid;
    private String name;
    private int age;
    private int departmentid;
    private String hiredate;
    private int salary;
    private String status;

    public POJOClass(int empid, String name, int age, int departmentid, String hiredate, int salary, String status) {
        this.empid = empid;
        this.name = name;
        this.age = age;
        this.departmentid = departmentid;
        this.hiredate = hiredate;
        this.salary = salary;
        this.status = status;
    }

    public int getEmpid() {
        return empid;
    }

    private void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    private void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getHiredate() {
        return hiredate;
    }

    private void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
}
