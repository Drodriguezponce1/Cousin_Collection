import java.util.ArrayList;

public class Driver {
    
    public static void main(String[] args) {
        Music one = new Music(Genre.HIP_HOP, Media.VINYL, "To pimp a butterfly", "Kendrick Lamar", 0, 0, 0);

        ArrayList<Item> list = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            if(!list.contains(one)){
                list.add(one);
            }
        }

        for(Item item: list){
            System.out.println(item);
        }
        
    }
}
