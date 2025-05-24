public class Start {
    public static void main(String[] args) {
        TextBook tb1 = new TextBook("T101", "Physics", "NCTB", 350, 10, 10);
        TextBook tb2 = new TextBook("T102", "Chemistry", "NCTB", 360, 8, 10);
        TextBook tb3 = new TextBook("T103", "Math", "NCTB", 370, 12, 10);
        TextBook tb4 = new TextBook("T104", "Biology", "NCTB", 340, 9, 10);
        TextBook tb5 = new TextBook("T105", "English", "NCTB", 320, 11, 10);

        StoryBook sb1 = new StoryBook("S101", "Harry Potter", "J.K. Rowling", 500, 5, "Fantasy");
        StoryBook sb2 = new StoryBook("S102", "Sherlock Holmes", "Conan Doyle", 450, 7, "Mystery");
        StoryBook sb3 = new StoryBook("S103", "Narnia", "C.S. Lewis", 480, 6, "Fantasy");
        StoryBook sb4 = new StoryBook("S104", "Jungle Book", "Kipling", 300, 8, "Adventure");
        StoryBook sb5 = new StoryBook("S105", "Alice in Wonderland", "Carroll", 350, 10, "Children");

        BookShop shop = new BookShop("AIUB BookStore");

        shop.insertTextBook(tb1);
        shop.insertTextBook(tb2);
        shop.insertTextBook(tb3);
        shop.insertTextBook(tb4);
        shop.insertTextBook(tb5);

        shop.insertStoryBook(sb1);
        shop.insertStoryBook(sb2);
        shop.insertStoryBook(sb3);
        shop.insertStoryBook(sb4);
        shop.insertStoryBook(sb5);

        System.out.println("All TextBooks:");
        shop.showAllTextBooks();

        System.out.println("All StoryBooks:");
        shop.showAllStoryBooks();

        System.out.println("Searching for TextBook with ISBN T103:");
        TextBook foundTB = shop.searchTextBook("T103");
        if (foundTB != null) foundTB.showDetails();

        System.out.println("Searching for StoryBook with ISBN S102:");
        StoryBook foundSB = shop.searchStoryBook("S102");
        if (foundSB != null) foundSB.showDetails();
    }
}
