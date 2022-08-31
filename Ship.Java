public class Ship {
    private int health;
    private int hits;
    private boolean sunk = false;

    // Makes a new ship, assigns it a health (length)
    public Ship(int initLength) {
        length = initLength
        hits = 0;
    }

    public void hits() {
        hits++;
    }

    public boolean isSunk() {
        if(hits == length) {
            sunk = true;
        }
        return sunk;
    }
}