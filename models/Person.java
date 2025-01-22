package LibraryProject.models;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }


    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Por favor! Digite um nome.");
        }
    }

    public String getName() {
        return name;
    }
}
