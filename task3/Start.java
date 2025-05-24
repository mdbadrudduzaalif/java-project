public class Start {
    public static void main(String[] args) {
        StoryBook sb1 = new StoryBook("S101", "Harry Potter", "J.K. Rowling", 500, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("S102", "Jungle Book", "R. Kipling", 300, 8, "Adventure");
        StoryBook sb3 = new StoryBook("S103", "Sherlock Holmes", "Doyle", 450, 12, "Mystery");
        StoryBook sb4 = new StoryBook("S104", "Narnia", "C.S. Lewis", 400, 5, "Fantasy");
        StoryBook sb5 = new StoryBook("S105", "Alice", "Carroll", 350, 7, "Children");

        TextBook tb1 = new TextBook("T101", "Math", "NCTB", 250, 20, 10);
        TextBook tb2 = new TextBook("T102", "Physics", "NCTB", 260, 15, 10);
        TextBook tb3 = new TextBook("T103", "Chemistry", "NCTB", 270, 18, 10);
        TextBook tb4 = new TextBook("T104", "Biology", "NCTB", 240, 14, 10);
        TextBook tb5 = new TextBook("T105", "English", "NCTB", 230, 16, 10);

        BookShop shop = new BookShop("AIUB Book Center");

        
        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb4);
        shop.insertBook(sb5);

        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);

        
        System.out.println("All Books in Shop:");
        shop.showAllBooks();

        
        System.out.println("\nSearching for book with ISBN S103:");
        Book foundBook = shop.searchBook("S103");
        if (foundBook != null) {
            foundBook.showDetails();
        } else {
            System.out.println("Book not found.");
        }
    }
}
