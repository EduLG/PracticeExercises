package Library;

import java.time.LocalDateTime;


public class Loan {

    private String borrowedBook, memberNumber;
    LocalDateTime date;

    public Loan (String borrowedBook, String memberNumber, LocalDateTime date){

        this.borrowedBook = borrowedBook;
        this.memberNumber = memberNumber;
        this.date = date;

    }

    public String getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(String borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override

    public String toString() {
        return "Loan:\n" + "Borrowed book: " + borrowedBook + "\nMember N.: " + memberNumber + "\nDate of loan: " + date;
    }
}
