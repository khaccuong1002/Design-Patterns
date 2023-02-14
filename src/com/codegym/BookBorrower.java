package com.codegym;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorAndTitle(){
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "Tôi không có cuốn sách này";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
