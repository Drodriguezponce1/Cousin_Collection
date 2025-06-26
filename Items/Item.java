
public class Item {

    private Genre genre;
    private Media media;

    private String title;

    public Item() {
        this.genre = null;
        this.media = null;
        this.title = null;
    }

    public Item(Genre genre, Media media, String title) {
        this.genre = genre;
        this.media = media;
        this.title = title;
    }

    public String getGenre() {
        
        if (this.genre.name().equals("HIP_HOP")) {
            return "Hip-Hop";
        } else if (this.genre.name().equals("SCIENCE_FICTION")) {
            return "Science-Fiction";
        }

        String temp = this.genre.name();

        return temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getMedia() {
        if (this.media.name().equals("DVD") || this.media.name().equals("CD")) {
            return this.media.name();
        }

        String temp = this.media.name();

        return temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return String.format("[Title: %s, Media Type: %s, Genre: %s", this.title, this.getMedia(), this.getGenre());
    }
    

}
