import java.util.Scanner;

public class Sim {
    
    String name;
    int hunger;
    int bladder;
    int energy;
    int social;
    int hygiene;
    int fun;

    int cooking;
    int mechanical;
    int fitness;
    int logic;
    int charisma;
    int fishing;
    int gardening;

    public Sim(String name) {
        this.name = name;
        hunger = 10;
        bladder = 10;
        energy = 10;
        social = 10;
        hygiene = 10;
        fun = 10;

        cooking = 0;
        mechanical = 0;
        fitness = 0;
        logic = 0;
        charisma = 0;
        fishing = 0;
        gardening = 0;
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
    System.out.println("S. Check Skill levels");
    System.out.println("L. Learn new skills");
    }

    public void checkNeeds() {
        System.out.println("hunger: " + hunger + "/10");
        System.out.println("bladder: " + bladder + "/10");
        System.out.println("energy: " + energy + "/10");
        System.out.println("social: " + social + "/10");
        System.out.println("hygiene: " + hygiene + "/10");
        System.out.println("fun: " + fun + "/10");
    }

    public void fillNeeds(int need) {
        if (need == 10) {
            need = 10;
        } else {
            need += 1;
        }
    }

    public void checkSkillLevels() {
        System.out.println("cooking: " + cooking + "/10");
        System.out.println("mechanical: " + mechanical + "/10");
        System.out.println("fitness: " + fitness + "/10");
        System.out.println("logic: " + logic + "/10");
        System.out.println("charisma: " + charisma + "/10");
        System.out.println("fishing: " + fishing + "/10");
        System.out.println("gardening: " + gardening + "/10");
    }

    public static void main(String[] args) {
        Sim newCharacter = new Sim("Sim");
        System.out.println("Hello, " + newCharacter.name);
        newCharacter.mainMenu();
        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
        if (userChoice.equals("1")) {
            newCharacter.checkNeeds();
        }
    }
}