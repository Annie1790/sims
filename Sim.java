import java.util.Scanner;
import Chrono.*;
import Needs.*;
import Skills.*;

/*
 A Java class can inherit fields and methods from another class.
Each Java class requires its own file, but only one class in a Java package needs a main() method.
Child classes inherit the parent constructor by default, but it’s possible to modify the constructor using super() or override it completely.
You can use protected and final to control child class access to parent class members.
Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class, but also give it its own traits.
You can override parent class methods in the child class, ideally using the @Override keyword.
It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.* 
 */

public class Sim {

    String name;

    Time todayTime = new Time();

    final Needs hunger = new Needs(10, "hunger");
    final Needs bladder = new Needs(10, "bladder");
    final Needs energy = new Needs(10, "energy");
    final Needs social = new Needs(10, "social");
    final Needs hygiene = new Needs(10, "hygiene");
    final Needs fun = new Needs(10, "fun");

    final Skills cooking = new Skills(0, "cooking");
    final Skills mechanical = new Skills(0, "mechanical");
    final Skills fitness = new Skills(0, "fitness");
    final Skills logic = new Skills(0, "logic");
    final Skills charisma = new Skills(0, "charisma");
    final Skills fishing = new Skills(0, "fishing");
    final Skills gardening = new Skills(0, "gardening");
    // Wrapped in an array to use loseNeedsPoints method
    Needs[] needsArray = { hunger, bladder, energy, social, hygiene, fun };

    public Sim(String name) {
        this.name = name;
    }

    public void mainMenu() {
        System.out.println(todayTime.toString());
        System.out.println("\nChoose from the options below:");
        System.out.println("1. Check needs");
        System.out.println("2. Eat");
        System.out.println("3. Use toilet");
        System.out.println("4. Sleep");
        System.out.println("5. Call friend");
        System.out.println("6. Have shower");
        System.out.println("7. Have fun");
        System.out.println("cs. Check Skill levels");
        System.out.println("ls. Learn new skills");
        System.out.println("exit. Exit the program");
    }

    public void startGame() {
        Scanner in = new Scanner(System.in);
        while (true) {
            this.mainMenu();
            String userChoice = in.nextLine();
            if (userChoice.equals("exit")) {
                System.exit(0);
            }

            this.chooseMainMenu(userChoice);
        }
    }

    public void chooseSkillToLearn() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nWhich skill would you like to learn?");
            cooking.scanLearnSkill("1");
            mechanical.scanLearnSkill("2");
            fitness.scanLearnSkill("3");
            logic.scanLearnSkill("4");
            charisma.scanLearnSkill("5");
            fishing.scanLearnSkill("6");
            gardening.scanLearnSkill("7");
            System.out.println("back: back to main menu");

            String userChoice = in.nextLine();
            switch (userChoice.toLowerCase()) {
                case "1":
                    cooking.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "2":
                    mechanical.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "3":
                    fitness.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "4":
                    logic.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "5":
                    charisma.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "6":
                    fishing.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "7":
                    gardening.levelUp();
                    Needs.loseNeedsPoints(needsArray);
                    todayTime.timeGoes();
                    break;

                case "back":
                    this.startGame();
                    break;
            }

        }
    }

    public void chooseMainMenu(String option) {
        switch (option.toLowerCase()) {
            case "1":
                hunger.checkNeeds();
                bladder.checkNeeds();
                energy.checkNeeds();
                social.checkNeeds();
                hygiene.checkNeeds();
                fun.checkNeeds();
                break;

            case "2":
                hunger.fillNeeds(6);
                break;

            case "3":
                bladder.fillNeeds(10);
                break;

            case "4":
                energy.fillNeeds(8);
                break;

            case "5":
                social.fillNeeds(5);
                break;

            case "6":
                hygiene.fillNeeds(10);
                break;

            case "7":
                fun.fillNeeds(4);
                break;

            case "cs":
                cooking.checkSkillLevel();
                mechanical.checkSkillLevel();
                fitness.checkSkillLevel();
                logic.checkSkillLevel();
                charisma.checkSkillLevel();
                fishing.checkSkillLevel();
                gardening.checkSkillLevel();
                break;

            case "ls":
                this.chooseSkillToLearn();
                break;

            case "exit":
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Sim newCharacter = new Sim("Sim");
        System.out.println("\nHello, " + newCharacter.name);
        newCharacter.startGame();
    }
}