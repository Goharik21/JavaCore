package classwork;

public class BookStorage {

    private Book[] array = new Book[10];

    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }

    public void searchByName(String keyword) {
        boolean found=false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getTitle().contains(keyword)) {
                found=true;
                System.out.println(book);
            }
        }
        if (!found){
            System.out.println("Book with " + keyword + " not found");
        }
    }
}