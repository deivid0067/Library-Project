package LibraryProject.services;

import LibraryProject.models.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Books> bookslist = new ArrayList<>();

    public void addBook(Books book) {
        if(book != null) {
            bookslist.add(book);
        }else {
            System.out.println("O livro não pode ser nulo!");
        }
    }

    public void removeBook(int index){
        if (index >= 0 && index < bookslist.size()){
            bookslist.remove(index);
        }
    }

    public List<Books> listBook() {
       return bookslist;
    }

    public List<Books> searchBook(String name) {
        return bookslist.stream().filter(B -> B.getName()
                .startsWith(name))
                .collect(Collectors.toList());
    }
}
