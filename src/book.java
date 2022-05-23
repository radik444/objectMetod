import java.util.Objects;

public class book {
    private String title;
    private int year;
    private Author author;

    public book( String title, int year, Author author){
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return " Название " + title + " Автор " + author + " Год публикации " + year;
    }

    @Override
    public int hashCode(){
        return Objects.hash(year,title,author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return year == book.year && title.equals(book.title) && author.equals(book.author);
    }


    }






