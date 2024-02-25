public class Student {
    private int id;
    private String nom;
    private int age;
    public Student(int id,String nom,int age){
        this.id=id;
        this.nom=nom;
        this.age=age;
    }
    public int id(){
        return this.id;

    }
    public String nom(){
        return this.nom;
    }
    public int age(){
        return this.age;
    }
    
}
