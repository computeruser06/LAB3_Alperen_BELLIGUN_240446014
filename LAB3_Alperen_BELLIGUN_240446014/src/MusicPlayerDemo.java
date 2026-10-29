public class MusicPlayerDemo {

    public static void main(String[] args) {

        // create the playlist object
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        // display the playlist
        playlist.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        // display the current song playing
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go and see the next song
        playlist.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go and see the next song
        playlist.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        // go the previous song of the playlist and display it
        playlist.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        // remove the song called "Shape of You - Ed Sheeran"
        playlist.removeSong("Shape of You - Ed Sheeran");
        // Then display the Playlist
        playlist.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest"
        playlist.removeSong("Snap - Manifest");
        // Then display the Playlist
        playlist.displayPlaylist();
    }
}