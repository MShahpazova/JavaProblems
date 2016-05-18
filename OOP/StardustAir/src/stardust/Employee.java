package stardust;

public abstract class Employee extends Person {
    private float salary;
    private String id;
    private String contractStart;

    public Employee(String name, String dateBirth, float salary, String id, String contractStart) {
        super(name, dateBirth);
        this.setSalary(salary);
        this.setId(id);
        this.setContractStart(contractStart);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Id must not be empty");
        }
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setContractStart(String contractStart) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Contract start must not be empty");
        }
        this.contractStart = contractStart;
    }

    public String getContractStart() {
        return contractStart;
    }

}
