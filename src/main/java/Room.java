public class Room {
    private int length;
    private int width;
    private int heigth;


    public Room(int length, int width, int heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    public Room() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int squareOfWalls() {
        return length * heigth * width - ((length * width) * 2);
    }

    public int squareOfWallsWithoutEntrances() {
        return squareOfWalls() - 30 - 16;
    }
}
