public class MusicPlaylist {

    // My private variables for the list
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // Constructor: everything is empty at the start
    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a new song to the list
    public void addSong(String title) {
        // 1. Create a new song node
        SongNode newNode = new SongNode(title);

        // 2. If the playlist is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode; // first song is playing
        }
        // 3. If playlist has songs, add to the end
        else {
            newNode.prev = tail; // new song looks back to old tail
            tail.next = newNode; // old tail looks forward to new song
            tail = newNode;      // new song is the new tail now
        }
    }

    // Remove a song from the list
    public void removeSong(String title) {
        // 1. Start from head to find the song
        SongNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {
                // We found the song!

                // 5. Handle removing head (first song)
                if (temp == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; // list becomes empty
                    }
                }
                // 6. Handle removing tail (last song)
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // 3 & 4. Handle removing a song in the middle
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                // 7. Handle removing the current song
                if (temp == current) {
                    if (current.next != null) {
                        current = current.next; // play next song
                    } else {
                        current = current.prev; // or play back song
                    }
                }

                System.out.println("Removed: " + title);
                return; // stop the method
            }
            temp = temp.next; // look at the next song
        }

        // 2. If song is not in the list
        System.out.println("The song isn't in the playlist");
    }

    // Go to the next song
    public void nextSong() {
        // Check if there is a next song
        if (current != null && current.next != null) {
            current = current.next; // move current to front
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }

    // Go to the previous song
    public void previousSong() {
        // Check if there is a previous song
        if (current != null && current.prev != null) {
            current = current.prev; // move current to back
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    // Show the playing song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        }
    }

    // Show all songs from start to end
    public void displayPlaylist() {
        SongNode temp = head;
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next; // go to next
        }
        System.out.println("END");
    }
}