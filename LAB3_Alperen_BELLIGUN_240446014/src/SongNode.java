public class SongNode {

    String title;

    // We need two pointers for doubly linked list
    SongNode next; // points to the front song
    SongNode prev; // points to the back song

    public SongNode(String title) {
        this.title = title;
        this.prev = null; // no back song at first
        this.next = null; // no front song at first
    }
}