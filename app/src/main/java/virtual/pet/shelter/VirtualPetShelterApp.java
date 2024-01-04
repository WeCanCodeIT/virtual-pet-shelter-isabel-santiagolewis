package virtual.pet.shelter;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelterApp{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        VirtualPetShelter virtualPets = new VirtualPetShelter();

        ArrayList<VirtualPet> defaultPets = new ArrayList<VirtualPet>();
        VirtualPet Shady = new VirtualPet("Shady", "A sweet old Pit bull with shiny black fur and a heart full of love.");
        defaultPets.add(Shady);
        VirtualPet Nugget = new VirtualPet ("Nugget","A tiny mischief-maker with caramel fur who can't resist cuddles." );
        defaultPets.add(Nugget);
        VirtualPet Mars = new VirtualPet ("Mars","A lovable giant puppy who is always chasing his own tail.");
        defaultPets.add(Mars);
        VirtualPet Midnight = new VirtualPet ("Midnight", "A mysterious cat who prowls through the shadows with elegance.");
        defaultPets.add(Midnight);
        VirtualPet Chubbykins = new VirtualPet("Chubbykins", "A delightfully plump cat with a personality as big as his belly.");
        defaultPets.add(Chubbykins);


        for (int i = 0; i < 3; i++) {
            int randomPet = (int)(Math.random()*defaultPets.size());
            virtualPets.intakePet(defaultPets.get(randomPet));
            defaultPets.remove(randomPet);
        }

        System.out.println("Welcome to the Virtual Pet Shelter!!! All of the pets are so excited to meet you!!!");
        
        System.out.println("	_     /)---(\\          /~~~\\	");
        System.out.println("	\\\\   (/ . . \\)        /  .. \\	");
        System.out.println("	 \\\\__)-\\(*)/         (_,\\  |_)	");
        System.out.println("	 \\_       (_         /   \\@/    /^^^\\	");
        System.out.println("	 (___/-(____) _     /      \\   / . . \\	");
        System.out.println("	              \\\\   /  `    |   V\\ Y /V	");
        System.out.println("	               \\\\/  \\   | _\\    / - \\	");
        System.out.println("	                \\   /__'|| \\\\_  |    \\	");
        System.out.println("	                 \\_____)|_).\\_).||(__V	");

        virtualPets.meetThePets();

        int input;
        do{
            virtualPets.displayPets();
            mainMenu();
            input = userInput.nextInt();
            userInput.nextLine();
            switch (input) {
                case 1:
                    virtualPets.feedAllPets();
                    virtualPets.tick();
                    break;
                case 2:
                    virtualPets.waterAllPets();
                    virtualPets.tick();
                    break;
                case 3:
                    play(virtualPets, userInput);
                    virtualPets.tick();
                    break;
                case 4:
                    adopt(virtualPets, userInput);
                    virtualPets.tick();
                    break;
                case 5:
                    intake(virtualPets, userInput);
                    virtualPets.tick();
                    break;
                case 6: 
                    System.out.println("Hope to see you again soon! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number 1-6");
                    break;
            }

        }while (input !=6);

        userInput.close();

    }

    public static void mainMenu(){
        System.out.println();
        System.out.println("What would you like to do next?");
        System.out.println("1. Feed all pets");
        System.out.println("2. Give water to all pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a furry best friend :,>");
        System.out.println("5. Admit a new furry friend");
        System.out.println("6. Exit");
        System.out.print("Enter what your would like to do(1-6): ");
    }

    public static void play(VirtualPetShelter virtualPetShelter, Scanner scanner){
        System.out.println("Which pet would you like to play with?");
        System.out.print("Specify Pet Name: ");
        String playPet = scanner.nextLine();
        virtualPetShelter.playWithAPet(playPet);
    }

    public static void adopt(VirtualPetShelter virtualPetShelter, Scanner scanner){
        System.out.println("Which pet would you like to adopt?");
        System.out.print("Specify Pet Name: ");
        String adoptPet = scanner.nextLine();
        virtualPetShelter.adoptPet(adoptPet);
    }
    
    public static void intake(VirtualPetShelter virtualPetShelter, Scanner scanner){
        System.out.println("We just need a little more information about our new furry friend!");
        System.out.print("What is the pet's name?: ");
        String admitPetName = scanner.nextLine();
        System.out.println("Please provide a short description of your pet: ");
        String admitPetDescription = scanner.nextLine();
        virtualPetShelter.intakePet(admitPetName,admitPetDescription);
        System.out.println( "Let's re-meet our pets!");
        virtualPetShelter.meetThePets();
    }
}
