package interfaces;

public interface IDraw {
    public void drawing();
    public default void drawingRed(){
        System.out.println("drawingRed");
    }
}
