import devices.Fan;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HomeApplianceFacade homeFacade = new HomeApplianceFacade();
        System.out.println("Weekend: Enjoying with friends and family at home...");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Setting up movie...");
        homeFacade.playMovie("Spider-Man: Far From Home");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Preparing food...");
        homeFacade.prepareFood(Arrays.asList("Napoletana Pizza", "Margherita Pizza", "Marinara Pizza","Chicago-Style Deep Dish Pizza"));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Enjoy Movie with Meal and Drink...");
        System.out.println("Movie Completed.");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Stopping Movie...");
        homeFacade.stopMovie();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Closing Kitchen...");
        homeFacade.closeKitchen();

    }
}
