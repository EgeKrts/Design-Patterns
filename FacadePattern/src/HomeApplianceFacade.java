import devices.*;
import devices.kitchen.*;
import devices.livingRoom.*;
import java.util.List;

public class HomeApplianceFacade {
    Fan fan;
    LivingRoomFireTV4KStick stick;
    Light livingRoomLight;
    SoundBar soundBar;
    TV tv;
    CoffeeMaker coffeeMaker;
    ElectricGrill grill;
    Light kitchenLight;
    Microwave microwave;
    Refrigerator refrigerator;

    public HomeApplianceFacade() {          //constructor
        fan = new LivingRoomFan("LivingRoomFan");
        tv = new LivingRoomTV("LivingRoomTV");
        stick = new LivingRoomFireTV4KStick("LivingRoomFireTV4KStick");
        livingRoomLight = new LivingRoomlight("LivingRoomLight");
        soundBar = new LivingRoomSoundBar(tv);
        coffeeMaker = new CoffeeMaker("CoffeeMaker");
        grill = new ElectricGrill("ElectricGrill");
        kitchenLight = new KitchenLight("KitchenLight");
        microwave = new Microwave("Microwave");
        refrigerator = new Refrigerator("Refrigerator");
    }
    public void playMovie(String movieName){            //to start the movie
        fan.on();
        fan.increase();
        livingRoomLight.on();
        tv.on();
        ((LivingRoomTV)tv).setSource("HDMI ARC");
        stick.on();
        soundBar.on();
        soundBar.setSoundMode("Dolby Atmos");
        stick.openApp("Netflix");
        stick.selectContent(movieName);
        livingRoomLight.dim();
        soundBar.volume(20);
        stick.play();
    }
    public void prepareFood(List<String>pizzas){        //to prepare meals
        kitchenLight.on();
        refrigerator.partyMode(); // for fast cooling
        microwave.on();
        microwave.setOnHeat(200, 5);
        microwave.grillOn();

        grill.on();
        coffeeMaker.on();
        pizzas.forEach(pizzaName -> microwave.bake(pizzaName, 400, 10));
    }
    public void stopMovie() {       //to stop the movie
        stick.closeApp();
        stick.off();
        soundBar.off();
        tv.off();
        fan.off();
    }
    public void closeKitchen() {        //to close the kitchen
        refrigerator.normalMode();
        grill.off();
        coffeeMaker.off();
        microwave.grillOff();
    }

}
