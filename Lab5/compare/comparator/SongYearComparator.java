package compare.comparator;

import java.util.Comparator;
public class SongYearComparator implements Comparator<Song> {
    public int compare(Song song1, Song song2) {
        if (song1.getYear() > song2.getYear())
            return 1;
        else if (song1.getYear() < song2.getYear()) {
            return -1;
        }
        else
            return 0;
    }
}
