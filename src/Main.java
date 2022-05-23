public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");
        author1=author2;
        book book1 = new book("Метель", 1865, author1);
        book book2 = new book( "Война и мир", 1825, author2);


        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());








    }}
