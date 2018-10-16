package bridge;

public abstract class Shape {
    protected DrawAPI drawAPI;

    /**
     * bridge pattern's key code
     * @param drawAPI
     */
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}