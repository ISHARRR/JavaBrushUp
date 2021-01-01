package authorBook.composition;

/*
 * EXERCISE 1.11 Book and Author Classes Again - An Array of Objects as an Instance Variable
 * In the earlier exercise, a book is written by one and only one author. In reality, a book can be written by one or more author.
 * Modify the Book class to support one or more authors by changing the instance variable authors to an Author array.
 * Reuse the Author class written earlier.
Notes:
The constructors take an array of Author (i.e., Author[]), instead of an Author instance.
The toString() method shall return "book-name by n authors", where n is the number of authors.
A new method printAuthors() to print the names of all the authors.
You are required to:
Write the code for the Book class. You shall re-use the Author class written earlier.
Write a test program (called TestBook) to test the Book class.
 */

/*
 * EXERCISE 1.12
 * In the above exercise, the number of authors cannot be changed once a Book instance is constructed.
 * Suppose that we wish to allow the user to add more authors (which is really unusual but presented here for academic purpose).
We shall remove the authors from the constructors, and add a new method called addAuthor() to add the given Author instance to this Book.
We also need to pre-allocate an Author array, with a fixed length (says 5 - a book is written by 1 to 5 authors),
and use another instance variable numAuthors (int) to keep track of the actual number of authors.
You are required to:
Modify your Book class to support this new requirement.
 */

public class Main {
    public static void main(String[] args) {

////pre Array list tests
//        Author[] test = new Author[0];
//        System.out.println(test.toString());
//
//        Book bookTest = new Book("test story", test, 10.00, 5);
//        System.out.println(bookTest.toString());
//
//        System.out.println("name is: " + bookTest.getName());
//        System.out.println("price is: " + bookTest.getPrice());
//        System.out.println("qty is: " + bookTest.getQty());
//        System.out.println("Author is: " + Arrays.toString(bookTest.getAuthor()));  // Author's toString()
//        System.out.println("Author's name is: " + bookTest.getAuthor().getName());
//        System.out.println("Author's email is: " + bookTest.getAuthor().getEmail());
//
//        Book anotherBook = new Book("JAVAJAVAJAVA",
//                new Author[]{new Author("ishar", "ishar@gmail.com", 'm')}, 2.95);
//        System.out.println(anotherBook);

        //testing after adding array list
        Author[] authors = new Author[2];
        authors[0] = new Author("asfadsf", "dfasf@somewhere.com", 'm');
        authors[1] = new Author("jgk", "adsfasf@nowhere.com", 'f');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Javaaaaaaaaa", authors, 19.99, 50);
        System.out.println(javaDummy);  // toString()

    }
}
