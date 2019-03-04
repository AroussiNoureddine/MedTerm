package design;

public abstract class  Person {
    private int iD;
    private String name;

    public Person(){}
    public Person(int iD){
        this.iD = iD;
    }
    public Person( String name,int iD) {
        this.iD = iD;
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }
}
