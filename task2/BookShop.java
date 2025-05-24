public class BookShop {
    private String name;
    private TextBook[] textBooks = new TextBook[100];
    private StoryBook[] storyBooks = new StoryBook[100];

    public BookShop() {}

    public BookShop(String name) {
        this.name = name;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public boolean insertTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                return true;
            }
        }
        return false;
    }

    public boolean removeTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == tb) {
                textBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (TextBook tb : textBooks) {
            if (tb != null && tb.getIsbn().equals(isbn)) {
                return tb;
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        for (TextBook tb : textBooks) {
            if (tb != null) {
                tb.showDetails();
                System.out.println("----------------");
            }
        }
    }

    public boolean insertStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                return true;
            }
        }
        return false;
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == sb) {
                storyBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (StoryBook sb : storyBooks) {
            if (sb != null && sb.getIsbn().equals(isbn)) {
                return sb;
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        for (StoryBook sb : storyBooks) {
            if (sb != null) {
                sb.showDetails();
                System.out.println("----------------");
            }
        }
    }
}