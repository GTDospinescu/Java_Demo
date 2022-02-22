package arrayChapter;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if(findSong(titleOfSong) != null) {
            return false;
        }
        Song song = new Song(titleOfSong, durationOfSong);
        return songs.add(song);
    }

    private Song findSong(String titleOfSong) {
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getTitle().equals(titleOfSong)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumberOfSongInAlbum, LinkedList<Song> thePlaylist) {
        for (int i = 0; i < songs.size(); i++) {
            if(i == trackNumberOfSongInAlbum) {
                Song song = songs.get(i);
                for (int j = 0; j < thePlaylist.size(); j++) {
                    if(song.getTitle().equals(thePlaylist.get(j).getTitle())) {
                        return false;
                    }
                }
                thePlaylist.add(song);
            }
        }
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> thePlayList) {
        if(findSong(titleOfSong) != null) {
            return false;
        }
       return thePlayList.add(findSong(titleOfSong));
    }


}
