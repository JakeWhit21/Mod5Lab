package wctc.edu;

import java.time.Duration;
import java.time.LocalDate;

public interface Music extends Product{

    String getArtist();

    Duration getPlayingTime();

}
