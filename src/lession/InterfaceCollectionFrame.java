package lession;

import java.util.ArrayList;
import java.util.LinkedList;

public class InterfaceCollectionFrame {
    public static void main(String[] args) {

    }
}

class ShoppingCart{
    private final ArrayList<String> items = new ArrayList<>();

    public void addItem(String item){
        items.add(item);
    }
    public String getItem(int index){
        return items.get(index); // get items by its (index)
    }
}

class MusicPlayList{
    private final LinkedList<String> songs = new LinkedList<>();
    public void addSong(String song){
        songs.addLast(song);
    }

}