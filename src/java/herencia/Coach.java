package java.herencia;

public class Coach extends League {
    private int idCarnet;

    public Coach(int id, String name, String lastname, int age, int idCarnet) {
        super(id, name, lastname, age);
        this.idCarnet = idCarnet;
    }

    public Coach(int idCarnet) {
        this.idCarnet = idCarnet;
    }

    
}
