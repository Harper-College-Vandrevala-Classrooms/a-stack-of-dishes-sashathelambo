public class DishStack {
    private Dish[] stack;
    private int top;
    private int maxSize;

    public DishStack(int size) {
        this.maxSize = size;
        this.stack = new Dish[maxSize];
        this.top = -1;
    }

    public boolean push(Dish dish) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full");
            return false;
        }
        stack[++top] = dish;
        return true;
    }

    public Dish pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }

    public Dish peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
} 