import java.util.ArrayList;

public class Employee {
    private String position;
    private String id;
    private double sal;
    private ArrayList<Employee> subOrr;
    private ArrayList<Employee> supOrr;

    public Employee() {
    }

    public Employee(String position, String id, double sal, ArrayList<Employee> subOrr, ArrayList<Employee> supOrr) {
        this.position = position;
        this.id = id;
        this.sal = sal;
        this.subOrr = subOrr;
        this.supOrr = supOrr;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public ArrayList<Employee> getSubOrr() {
        return subOrr;
    }

    public void setSubOrr(ArrayList<Employee> subOrr) {
        this.subOrr = subOrr;
    }

    public ArrayList<Employee> getSupOrr() {
        return supOrr;
    }

    public void setSupOrr(ArrayList<Employee> supOrr) {
        this.supOrr = supOrr;
    }

    public void addSubordinate(Employee subordinate) {
        subOrr.add(subordinate);
    }

    public void removeSubordinate(Employee subordinate) {
        subOrr.remove(subordinate);
    }

    public void addSupervisor(Employee supervisor) {
        supOrr.add(supervisor);
    }

    public void removeSupervisor(Employee supervisor) {
        supOrr.remove(supervisor);
    }
    private double SubSal() {
        double total = this.sal;
        if (this.subOrr.size() == 0) {
            return total;
        }
        for(Employee emp : subOrr) {
            total += emp.SubSal();
        }
        return total;
    }
    private double SupSal() {
        double total = this.sal;
        if (this.supOrr.size() == 0) {
            return 0;
        }
        for(Employee emp : supOrr) {
            total += emp.SupSal();
        }
        return total;
    }

    public double TeamSal() {
        return this.SubSal() + this.SupSal();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position: ").append(position).append("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Salary: ").append(sal).append("\n");
        sb.append("Supervisors: ");
        for (Employee supervisor : supOrr) {
            sb.append(supervisor.getPosition()).append(", ");
        }
        sb.append("\n");
        sb.append("Subordinates: ");
        for (Employee subordinate : subOrr) {
            sb.append(subordinate.getPosition()).append(", ");
        }
        sb.append("\n");
        return sb.toString();
    }
}