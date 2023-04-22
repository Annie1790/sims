import java.util.Scanner;
import Needs.*;
import Skills.*;

public class Sim {

    String name;

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

    Needs[] needsArray = {hunger, bladder, energy, social, hygiene, fun};

    public Sim(String name) {
        this.name = name;
    }

    public void mainMenu() {
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
                break;
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
                    break;

                case "2":
                    mechanical.levelUp();
                    break;

                case "3":
                    fitness.levelUp();
                    break;

                case "4":
                    logic.levelUp();
                    break;

                case "5":
                    charisma.levelUp();
                    break;

                case "6":
                    fishing.levelUp();
                    break;

                case "7":
                    gardening.levelUp();
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
        }
    }

    public static void main(String[] args) {
        Sim newCharacter = new Sim("Sim");
        System.out.println("Hello, " + newCharacter.name);
        newCharacter.startGame();
    }
}