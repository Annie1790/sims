import java.util.Scanner;

public class Sim {
    
    String name;

    Needs hunger = new Needs(10, "hunger");
    Needs bladder = new Needs(10, "bladder");
    Needs energy = new Needs(10, "energy");
    Needs social = new Needs(10, "social");
    Needs hygiene = new Needs(10, "hygiene");
    Needs fun = new Needs(10, "fun");

    Skills cooking = new Skills(0, "cooking");
    Skills mechanical = new Skills(0, "mechanical");
    Skills fitness = new Skills(0, "fitness");
    Skills logic = new Skills(0, "logic");
    Skills charisma = new Skills(0, "charisma");
    Skills fishing = new Skills(0, "fishing");
    Skills gardening = new Skills(0, "gardening");

    public Sim(String name) {
        this.name = name;
    }

   public void mainMenu() {
    System.out.println("Choose from the options below:");
    System.out.println("1. Check needs");
    System.out.println("2. Eat");
    System.out.println("3. Use toilet");
    System.out.println("4. Sleep");
    System.out.println("5. Call friend");
    System.out.println("6. Have shower");
    System.out.println("7. Have fun");
    System.out.println("cs. Check Skill levels");
    System.out.println("ls. Learn new skills");
    }

    public void chooseMainMenu(String option, Sim sim) {
        switch(option) {
            case "1": 
            hunger.checkNeeds(hunger);
            bladder.checkNeeds(bladder);
            energy.checkNeeds(energy);
            social.checkNeeds(social);
            hygiene.checkNeeds(hygiene);
            fun.checkNeeds(fun);   
            break;

            // case "2": sim.fillNeeds(hunger);
            // break;

            // case "3": sim.fillNeeds(bladder);
            // break;

            // case "4": sim.fillNeeds(energy);
            // break;

            // case "5": sim.fillNeeds(social);
            // break;

            // case "6": sim.fillNeeds(hygiene);
            // break;

            // case "7": sim.fillNeeds(fun);
            // break;

            // case "ls":
        }
    }

    public static void main(String[] args) {
        Sim newCharacter = new Sim("Sim");
        System.out.println("Hello, " + newCharacter.name);
        newCharacter.mainMenu();
        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
        newCharacter.chooseMainMenu(userChoice, newCharacter);
    }
}