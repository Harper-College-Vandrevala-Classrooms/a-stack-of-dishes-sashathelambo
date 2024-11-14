public class Main {
    public static void main(String[] args) {
        DishStack stack = new DishStack(10);
        
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        int stackSize = stack.size();
        System.out.println("Initial stack size: " + stackSize);

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        int sizeAfterPushes = stack.size();
        System.out.println("Stack size after pushes: " + sizeAfterPushes);

        Dish peekedDish = stack.peek();
        System.out.println("Peeked dish: " + peekedDish.getName());

        Dish poppedDish = stack.pop();
        System.out.println("Popped dish: " + poppedDish.getName());

        Dish anotherPoppedDish = stack.pop();
        System.out.println("Another popped dish: " + anotherPoppedDish.getName());

        int finalSize = stack.size();
        System.out.println("Final stack size: " + finalSize);
    }
}