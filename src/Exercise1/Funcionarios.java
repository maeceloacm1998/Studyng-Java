package Exercise1;

public class Funcionarios {
    private Integer id;
    private String name;
    private Double salary;

    public Funcionarios(Integer id, String name, Double salary){
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    
    public void increaseSalary(double porcentage){
        salary += salary * porcentage / 100;
    }


    @Override
    public String toString(){
        return id + " , " + name + " , " + String.format("%.2f", salary);
    }


    public int getId() {
        return id;
    }
    
}
