package LibraryProject.models;

import java.time.LocalDate;

public class Loan {
    private Books book;
    private Client client;
    private LocalDate loanedOn;
    private LocalDate returnDate;

    public Loan(Books book, Client client, LocalDate loanedOn, LocalDate returnDate) {
        this.book = book;
        this.client = client;
        this.loanedOn = loanedOn;
        this.returnDate = returnDate;
    }

    public void setBook(Books book){
        this.book = book;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setLoanedOn(LocalDate loanedOn) {
        this.loanedOn = loanedOn;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Books getBook() {
        return book;
    }

    public Client getClient(){
        return client;
    }


    public LocalDate getLoanedOn(){
        return loanedOn;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }
}
