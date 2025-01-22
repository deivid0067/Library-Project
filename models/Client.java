package LibraryProject.models;

import java.time.LocalDate;
import java.util.UUID;

public class Client extends Person{
    private UUID id;
    private int age;
    private LocalDate dateOfBirth;

    public Client(String name, int age, LocalDate dateOfBirth){
            super(name);
            this.id = UUID.randomUUID();
            this.age = age;
            this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new IllegalArgumentException("Erro: A idade não pode ser negativa.");
        }else if(age >= 18){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Erro: Idade Inválida, Você precisa ter mais de 18 anos para realizar um cadastro.");
        }
    }

    public int getAge(){
        return age;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
