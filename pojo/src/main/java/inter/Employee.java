package inter;

public class Employee implements Comparable<Employee>, Cloneable{
    private Double number;

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Employee(Double number) {
        this.number = number;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.number, other.getNumber());
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
}
