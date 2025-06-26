public class Driver {
    
    public static void main(String[] args) {
        Music one = new Music(Genre.HIP_HOP, Media.VINYL, "To pimp a butterfly", "Kendrick Lamar", 0, 0, 0);

        System.out.println(one);

        for(Media media: Media.values()){
            System.out.println(media);
        }
    }
}
