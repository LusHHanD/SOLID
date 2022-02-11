package LiskovSubstitution;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {

    // Created list of video players
    List < VideoMediaPlayer > allPlayers = new ArrayList <VideoMediaPlayer>();
    allPlayers.add(new abcMediaPlayer());
    allPlayers.add(new xyzMediaPlayer());

    playVideoInAllMediaPlayers(allPlayers);

    System.out.println("---------------------------");

}

public static void playVideoInAllMediaPlayers(List <VideoMediaPlayer> allPlayers) {

    for (VideoMediaPlayer player: allPlayers) {
        player.playVideo();
    }
}
}