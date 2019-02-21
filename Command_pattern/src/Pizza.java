
/**
 * Concrete command
 */
public class Pizza implements Order {

    private PizzaChef chef;

    public Pizza() {
        this.chef = new PizzaChef();
    }

    @Override
    public void execute() {
        chef.makePizza();
    }

    @Override
    public String toString() {
        return "pizza";
    }

}