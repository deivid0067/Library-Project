package LibraryProject.models;


import java.time.LocalDate;
import java.util.UUID;

public class Books {
    private UUID id;
    private String name;
    private LocalDate publicationDate;
    private Authors author;

    public Books(String name, LocalDate publicationDate, Authors author) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Por favor! Digite um nome.");
        }
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = LocalDate.parse(publicationDate);
    }

    public void setAuthor(Authors author){
        this.author = author;
    }

    public String getName(){
        return name;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Authors getAuthor(){
        return author;
    }
}
