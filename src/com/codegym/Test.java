package com.codegym;

public class Test {
    public static void main(String[] args) {
        System.out.println("BẮT ĐẦU KIỂM TRA MẪU SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("bookBorrower1 hỏi mượn sách");
        System.out.println("bookBorrower1 Tác qỉa và tiêu đề: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower1 hỏi mượn sách");
        System.out.println("bookBorrower2 Tác qỉa và tiêu đề:");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("bookBorrower1 trả sách");

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower2 Tác qỉa và tiêu đề:");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("KẾT THÚC KIỂM TRA MẪU SINGLETON PATTERN");
    }
}