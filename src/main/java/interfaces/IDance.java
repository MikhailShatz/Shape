package interfaces;

public interface IDance {
    String str = "i dance";
    void dancingTango();
    default void dancingSalsa(){
        System.out.println("Dancing salsa");
    }
}
