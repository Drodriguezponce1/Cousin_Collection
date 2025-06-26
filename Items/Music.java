public class Music extends Item{
    
    private String author;
    private int tracks, year, runtime;

    public Music(Genre genre, Media media, String title, String author, int runtime, int year, int tracks){
        super(genre, media, title);
        
        this.author = author;
        this.runtime = runtime;
        this.year = year;
        this.tracks = tracks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + tracks;
        result = prime * result + year;
        result = prime * result + runtime;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Music other = (Music) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (tracks != other.tracks)
            return false;
        if (year != other.year)
            return false;
        if (runtime != other.runtime)
            return false;
        return true;
    }

    public String toString(){
        return super.toString() +
            String.format(", Author: %s, Runtime: %d, Published Year: %d, Number of Tracks: %d]", this.getAuthor(), this.getRuntime(), this.getYear(), this.getTracks());
    }

}
