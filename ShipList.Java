public class ShipList {
    private Ship aircraft_carrier;
    private Ship battleship;
    private Ship cruiser;
    private Ship submarine;
    private Ship destroyer;
    private boolean lost = false;

    public ShipList() {     // makes list of ships and their health (length)
        aircraft_carrier = new Ship(5);
        battleship = new Ship(4);
        cruiser = new Ship(3);
        submarine = new Ship(3);
        destroyer = new Ship(2);
    }
    public void shipHit(int shipID) {
        switch(shipID) {
            case 1:
               aircraft_carrier.hits();     // .hits(); adds a hit to said ship
               break;
            case 2:
                battleship.hits();
                break;
            case 3:
                cruiser.hits();
                break;
            case 4:
                submarine.hits();
                break;
            case 5:
                destroyer.hits();
                break;
        }
    }
    public boolean haveLost() {
        if (aircraft_carrier.isSunk() &&
            battleship.isSunk() && 
            cruiser.isSunk() && 
            submarine.isSunk() && 
            destroyer.isSunk())
            {
                lost = true;
            }
            return lost;
    }
}