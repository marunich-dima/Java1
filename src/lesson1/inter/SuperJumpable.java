package lesson1.inter;

public interface SuperJumpable extends Jumpable {
    void superJump (int h);
    default void superRunJump() {
        System.out.println("superRunJump");
    }
}
