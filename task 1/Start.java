public class Start {
    public static void main(String[] args) {
        StoryBook sb1 = new StoryBook("001", "Harry Potter", "J.K. Rowling", 500.0, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("002", "Jujutsu Kaisen", "Gege Akutami", 300.0, 5, "Mystery");
        StoryBook sb3 = new StoryBook("003", "Alice in Wonderland", "Lewis Carroll", 250.0, 7, "Adventure");
        StoryBook sb4 = new StoryBook("004", "Lookism", "Taejun Pak", 400.0, 6, "Fantasy");
        StoryBook sb5 = new StoryBook("005", "Jungle Book", "R. Kipling", 200.0, 9, "Children");

        TextBook tb1 = new TextBook("101", "Mathematics", "NCTB", 350.0, 15, 10);
        TextBook tb2 = new TextBook("102", "Physics", "NCTB", 375.0, 13, 10);
        TextBook tb3 = new TextBook("103", "Chemistry", "NCTB", 365.0, 14, 10);
        TextBook tb4 = new TextBook("104", "Biology", "NCTB", 355.0, 12, 10);
        TextBook tb5 = new TextBook("105", "English", "NCTB", 300.0, 10, 10);

        BookShop shop = new BookShop("aiub book store:");

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

        shop.showAllBooks();

        Book found = shop.searchBook("003");
        if (found != null) {
            System.out.println("Book found:");
            found.showDetails();
        } else {
            System.out.println("Book not found!");
        }
    }
}
