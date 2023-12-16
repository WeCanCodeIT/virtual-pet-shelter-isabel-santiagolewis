package virtual.pet.shelter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    void testFeedPet() {
        VirtualPet testerPet = new VirtualPet("testerPet");
        int originalHungerLevel = testerPet.getHungerLevel();
        testerPet.feedPet();
        assertNotEquals(originalHungerLevel, testerPet.getHungerLevel());
    }

    @Test
    void testGivePetWater() {
        VirtualPet testerPet = new VirtualPet("testerPet");
        int originalThirstLevel = testerPet.getThirstLevel();
        testerPet.givePetWater();
        assertNotEquals(originalThirstLevel, testerPet.getThirstLevel());
    }

    @Test
    void testNapTime() {
        VirtualPet testerPet = new VirtualPet("testerPet");
        int originalEnergyLevel = testerPet.getEnergyLevel();
        testerPet.napTime();
        assertNotEquals(originalEnergyLevel, testerPet.getEnergyLevel());
    }

    @Test
    void testPlayWithPet() {
        VirtualPet testerPet = new VirtualPet("testerPet");
        int originalBoredomLevel = testerPet.getBoredomLevel();
        testerPet.playWithPet();
        assertNotEquals(originalBoredomLevel, testerPet.getBoredomLevel());
    }

    @Test
    void testTick() {
        VirtualPet testerPet = new VirtualPet("testerPet");
        int originalEnergyLevel = testerPet.getEnergyLevel();
        testerPet.tick();
        assertNotEquals(originalEnergyLevel, testerPet.getEnergyLevel());
    }
}
