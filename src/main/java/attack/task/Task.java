package attack.task;

/**
 * Created by fendta on 07.07.14.
 */
public class Task {

    private long start;

    private long end;

    private byte[] chars;

    private byte[] hashToFind;

    public Task(long start, long end, byte[] chars, byte[] hashToFind) {
        this.start = start;
        this.end = end;
        this.chars = chars;
        this.hashToFind = hashToFind;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public byte[] getChars() {
        return chars;
    }

    public byte[] getHashToFind() {
        return hashToFind;
    }
}
