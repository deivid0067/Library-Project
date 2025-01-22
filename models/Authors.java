package LibraryProject.models;

public class Authors extends Person {
    private String name;

    public Authors(String name){
        super(name);
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Autor(a) sem nome!");
        }
    }

    public String getName(){
        return this.name;
    }
}
