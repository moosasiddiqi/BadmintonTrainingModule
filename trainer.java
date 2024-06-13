/*
Programmer: Moosa & Hu
Date: 16th May 2024
Description: Online Badminton Trainer
 */
package culminating;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Culminating 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        Scanner scanN = new Scanner(System.in);
        
        int input;
        
        // company logo 
        String welcomeScreen = welcome();
        System.out.println(welcomeScreen);
        
        System.out.println("\n\nWelcome to the first ever \"ONLINE BADMINTON T"
                + "RAINING MODULE\"");
        
        System.out.println("\n\nElevate your game with our expert-led online "
                + "badminton training, \ndesigned for all skill levels. Choose "
                + "from three tailored packages or assisted training:");
        
        int online = (int) (15+Math.random()*16);
        System.out.println("\n\nCurrent Athletes Online: " + online);
        
        System.out.println("\n\nPress \"enter\" to view packages");
        scan.nextLine();

        System.out.println("\nAPX Training Pack:|  Duration | Starting Rate:");
        System.out.println("__________________|___________|______________");
        System.out.format("%-18s%-3s%-9s%-3s$%-14.2f\n", "Smash Start", "|", "1"
                + " month  ", "|", 165.00);
        System.out.format("%-18s%-3s%-9s%-3s$%-14.2f\n", "Competitor's Edge", ""
                + "|", "1 month  ", "|", 300.00);
        System.out.format("%-18s%-3s%-9s%-3s$%-14.2f\n", "Conqueror's Court", ""
                + "|", "1 month  ", "|", 599.00);
        
        int strength = 5;
        int speed = 5;
        int endurance = 5;
        int agility = 5;


        boolean exitProgram = false;

        do {
            displayMainMenu();

            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    runSmashStart(scan, strength, speed, endurance, agility);
                    break;
                case 2:
                    runCompetitorsEdge(scan, strength, speed, endurance, agility);
                    break;
                case 3:
                    runConquerorsCourt(scan, strength, speed, endurance, agility);
                    break;
                case 4:
                    displayTips();
                    break;
                case 5:
                    displayNutritionalAdvice();
                    break;
                case 6:
                    exitProgram = true;
                    System.out.println("\n\nExiting the program... Have a good "
                            + "day!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please choose from the "
                            + "options above.");
                    break;
            }
        } while (!exitProgram);

    }
    
    public static void displayMainMenu() {
        System.out.println("\nSelect from the following options:");
        System.out.println("1. Smash Start (Beginner)");
        System.out.println("2. Competitor's Edge (Intermediate)");
        System.out.println("3. Conqueror's Court (Advanced)");
        System.out.println("4. Tips");
        System.out.println("5. Nutritional Advice");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    
    public static void runSmashStart(Scanner scan, int strength, int speed, int 
        endurance, int agility) {
        System.out.println("\nThis package is perfect for beginners who are jus"
            + "t getting started with badminton. \nIt focuses on the fundamentals"
                + " and basic t"
            + "echniques.");

        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        // Remaining code for Smash Start
        System.out.println("\nThis package is perfect for beginners who are"
                + " just getting started \nwith badminton. It focuses on the "
                + "fundamentals and basic techniques.");

        System.out.println("\n\nPress \"1\" to sign up.");
        int input;
        do {
            input = scanN.nextInt();
            if (input != 1) {
                System.out.println("Please enter a valid number!");
            }
        } while (input != 1);

        System.out.print("\nEnter a username using letters"
                + "\nUsername: ");

        String user = scanS.nextLine();

        System.out.print("\nEnter a password"
                + "\nPassword:  ");

        String pass = scanS.nextLine();

        String password;
        
        System.out.println("\n\n***Login***");
        String user1;
        do 
        {
            System.out.print("\nUsername: ");
            user1 = scanS.nextLine();
            if (!user1.equals(user)) 
            {
                System.out.println("Usernames do not match! Please try again");
            }
        } while (!user1.equals(user));
        
        do {
            System.out.print("\nPassword: ");
            password = scanS.nextLine();
            if (!password.equals(pass)) {
                System.out.print("Passwords do not match! Please try again");
            }
        } while (!password.equals(pass));

        System.out.println("\nBefore we begin let's look at your stats on"
                + " a scale from 1-10: ");

        System.out.print("\nStrength: ");
        strength = scanN.nextInt();
        while (strength > 10 || strength < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nStrength: ");
            strength = scanN.nextInt();
        }

        System.out.print("\nSpeed: ");
        speed = scanN.nextInt();
        while (speed > 10 || speed < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nSpeed: ");
            speed = scanN.nextInt();
        }

        System.out.print("\nEndurance: ");
        endurance = scanN.nextInt();
        while (endurance > 10 || endurance < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nEndurance: ");
            endurance = scanN.nextInt();
        }

        System.out.print("\nAgility: ");
        agility = scanN.nextInt();
        while (agility > 10 || agility < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nAgility: ");
            agility = scanN.nextInt();
        }

        System.out.println("These are your current stats: \n\n\t-----------"
                + "\n\tSpeed:     " + speed + "\n\tStrength:  " + strength
                + "\n\tEndurance: " + endurance + "\n\tAgility:   " +
                agility + "\n\t------------");

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ": Which skill do you want to i"
                    + "mprove? (Strength, Speed, Endurance, Agility)");
            String choice = scanS.nextLine();

            boolean validChoice = false;

            while (!validChoice) {
                if (choice.equalsIgnoreCase("Strength")) {
                    if (strength < 10) {
                        System.out.println("In order to increase your strength "
                                + "you must complete the following:\n\n"
                                + "- 20-100 pushups/day in an increasing order\n"
                                + "- Increase volume when lifting\n"
                                + "- Eat high-nutrient meals\n"
                                + "- Apply resistance workouts");
                        validChoice = true;
                    } else {
                        System.out.println("Your Strength is already at the max"
                                + "imum level of 10 and cannot be improved furt"
                                + "her. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Speed")) {
                    if (speed < 10) {
                        System.out.println("In order to increase your speed you"
                                + " must complete the following:\n\n"
                                + "- Complete a 5km morning run\n"
                                + "- Complete sprints\n"
                                + "- Practice interval running\n"
                                + "- Strengthen your core");
                        validChoice = true;
                    } else {
                        System.out.println("Your Speed is already at the maximu"
                                + "m level of 10 and cannot be improved further"
                                + ". Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Endurance")) {
                    if (endurance < 10) {
                        System.out.println("In order to increase your endurance"
                                + " you must complete the following:\n\n"
                                + "- Complete long sprints\n"
                                + "- Reduce recovery time\n"
                                + "- Take adequate rest\n"
                                + "- Increase frequency, intensity, and duration");
                        validChoice = true;
                    } else {
                        System.out.println("Your Endurance is already at the ma"
                                + "ximum level of 10 and cannot be improved fur"
                                + "ther. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Agility")) {
                    if (agility < 10) {
                        System.out.println("In order to increase your agility y"
                                + "ou must complete the following:\n\n"
                                + "- Complete a set of high knee drills\n"
                                + "- Plyometrics\n"
                                + "- Jump Rope\n"
                                + "- Back and Forth Lunges");
                        validChoice = true;
                    } else {
                        System.out.println("Your Agility is already at the maxi"
                                + "mum level of 10 and cannot be improved furth"
                                + "er. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else {
                    System.out.println("Invalid choice. Please select a valid s"
                            + "kill to improve (Strength, Speed, Endurance, Agi"
                            + "lity).");
                    choice = scanS.nextLine();
                }
            }
            
            // Simplified confirmation step with a variable
            String confirmation = "";
            System.out.println("\nPlease confirm that you have completed the ta"
                    + "ks for this week by typing 'yes'.");
            while (!confirmation.equalsIgnoreCase("yes")) {
                confirmation = scanS.nextLine();
                if (!confirmation.equalsIgnoreCase("yes")) {
                    System.out.println("Please complete the tasks before confir"
                            + "ming. Type 'yes' once you have completed them.");
                }
            }

            // Increment the skill level only after confirmation
            switch (choice.toLowerCase()) {
                case "strength":
                    strength++;
                    break;
                case "speed":
                    speed++;
                    break;
                case "endurance":
                    endurance++;
                    break;
                case "agility":
                    agility++;
                    break;
            }

        }

        System.out.println("\n\nEnd of 1 month improvement plan. Final stats:");
        System.out.println("Strength:  " + strength);
        System.out.println("Speed:     " + speed);
        System.out.println("Endurance: " + endurance);
        System.out.println("Agility:   " + agility);

        System.out.println("\n\nGreat Job. Keep up the good work!!");
    }

    public static void runCompetitorsEdge(Scanner scan, int strength, int speed,
            int endurance, int agility) {
        System.out.println("\nWelcome to the Competitor's Edge program! This pa"
                + "ckage is designed for intermediate players who want to enhan"
                + "ce their skills and take their game to the next level.");
        
        //scanner for intermediate category
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        
        //sign up page
        System.out.println("\n\nPress \"1\" to sign up.");
        int input;
        do {
            input = scanN.nextInt();
            if (input != 1) {
                System.out.println("Please enter a valid number!");
            }
        } while (input != 1);

        System.out.print("\nEnter a username using letters"
                + "\nUsername: ");

        String user = scanS.nextLine();

        System.out.print("\nEnter a password"
                + "\nPassword:  ");

        String pass = scanS.nextLine();

        String password;
        
        System.out.println("\n\n***Login***");
        String user1;
        do 
        {
            System.out.print("\nUsername: ");
            user1 = scanS.nextLine();
            if (!user1.equals(user)) 
            {
                System.out.println("Usernames do not match! Please try again");
            }
        } while (!user1.equals(user));
        
        do {
            System.out.print("\nPassword: ");
            password = scanS.nextLine();
            if (!password.equals(pass)) {
                System.out.print("Passwords do not match! Please try again");
            }
        } while (!password.equals(pass));

        System.out.println("\nBefore we begin let's look at your stats on"
                + " a scale from 1-10: ");

        System.out.print("\nStrength: ");
        strength = scanN.nextInt();
        while (strength > 10 || strength < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nStrength: ");
            strength = scanN.nextInt();
        }

        System.out.print("\nSpeed: ");
        speed = scanN.nextInt();
        while (speed > 10 || speed < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nSpeed: ");
            speed = scanN.nextInt();
        }

        System.out.print("\nEndurance: ");
        endurance = scanN.nextInt();
        while (endurance > 10 || endurance < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nEndurance: ");
            endurance = scanN.nextInt();
        }

        System.out.print("\nAgility: ");
        agility = scanN.nextInt();
        while (agility > 10 || agility < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nAgility: ");
            agility = scanN.nextInt();
        }

        System.out.println("These are your current stats: \n\n\t-----------"
                + "\n\tSpeed:     " + speed + "\n\tStrength:  " + strength
                + "\n\tEndurance: " + endurance + "\n\tAgility:   " +
                agility + "\n\t------------");

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ": Which skill do you want to i"
                    + "mprove? (Strength, Speed, Endurance, Agility)");
            String choice = scanS.nextLine();

            boolean validChoice = false;

            while (!validChoice) {
                if (choice.equalsIgnoreCase("Strength")) {
                    if (strength < 10) {
                        System.out.println("In order to increase your strength "
                                + "you must complete the following:\n\n- 50-150"
                                + " pushups/day in an increasing order\n- Incre"
                                + "ase volume and intensity when lifting\n- Eat"
                                + " high-protein meals\n- Apply advanced resist"
                                + "ance workouts");
                        validChoice = true;
                    } else {
                        System.out.println("Your Strength is already at the max"
                                + "imum level of 10 and cannot be improved furt"
                                + "her. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Speed")) {
                    if (speed < 10) {
                        System.out.println("In order to increase your speed you"
                                + " must complete the following:\n\n- Complete "
                                + "a 10km morning run\n- High-intensity interva"
                                + "l training (HIIT)\n- Practice agility drills"
                                + "\n- Enhance leg strength with weighted exerc"
                                + "ises");
                        validChoice = true;
                    } else {
                        System.out.println("Your Speed is already at the maximu"
                                + "m level of 10 and cannot be improved further"
                                + ". Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Endurance")) {
                    if (endurance < 10) {
                        System.out.println("In order to increase your endurance"
                                + " you must complete the following:\n\n- Long-"
                                + "distance runs and sprints\n- Circuit trainin"
                                + "g\n- Reduce rest intervals\n- Increase frequ"
                                + "ency, intensity, and duration significantly");
                        validChoice = true;
                    } else {
                        System.out.println("Your Endurance is already at the ma"
                                + "ximum level of 10 and cannot be improved fur"
                                + "ther. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Agility")) {
                    if (agility < 10) {
                        System.out.println("In order to increase your agility y"
                                + "ou must complete the following:\n\n"
                                + "- Advanced plyometrics\n- Complex footwork d"
                                + "rills\n- Lateral movement exercises\n- Incor"
                                + "porate balance and coordination training");
                        validChoice = true;
                    } else {
                        System.out.println("Your Agility is already at the maxi"
                                + "mum level of 10 and cannot be improved furth"
                                + "er. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else {
                    System.out.println("Invalid choice. Please select a valid s"
                            + "kill to improve (Strength, Speed, Endurance, Agi"
                            + "lity).");
                    choice = scanS.nextLine();
                }
            }
            
            // Simplified confirmation step with a variable
            String confirmation = "";
            System.out.println("\nPlease confirm that you have completed the ta"
                    + "ks for this week by typing 'yes'.");
            while (!confirmation.equalsIgnoreCase("yes")) {
                confirmation = scanS.nextLine();
                if (!confirmation.equalsIgnoreCase("yes")) {
                    System.out.println("Please complete the tasks before confir"
                            + "ming. Type 'yes' once you have completed them.");
                }
            }

            // Increment the skill level only after confirmation
            switch (choice.toLowerCase()) {
                case "strength":
                    strength++;
                    break;
                case "speed":
                    speed++;
                    break;
                case "endurance":
                    endurance++;
                    break;
                case "agility":
                    agility++;
                    break;
            }

        }

        System.out.println("\n\nEnd of intermediate improvement plan. Final sta"
                + "ts:");
        System.out.println("Strength:  " + strength);
        System.out.println("Speed:     " + speed);
        System.out.println("Endurance: " + endurance);
        System.out.println("Agility:   " + agility);

        System.out.println("\n\nGreat Job. Keep up the good work!!");
    }

    public static void runConquerorsCourt(Scanner scan, int strength, int speed,
            int endurance, int agility) {
        System.out.println("\nWelcome to the Conqueror's Court program! This pa"
                + "ckage is designed for advanced players who are aiming for pe"
                + "ak performance.");
        
        //scanner for intermediate category
        Scanner scanN = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        
        //sign up page
        System.out.println("\n\nPress \"1\" to sign up.");
        int input;
        do {
            input = scanN.nextInt();
            if (input != 1) {
                System.out.println("Please enter a valid number!");
            }
        } while (input != 1);

        System.out.print("\nEnter a username using letters"
                + "\nUsername: ");

        String user = scanS.nextLine();

        System.out.print("\nEnter a password"
                + "\nPassword:  ");

        String pass = scanS.nextLine();

        String password;
        
        System.out.println("\n\n***Login***");
        String user1;
        do 
        {
            System.out.print("\nUsername: ");
            user1 = scanS.nextLine();
            if (!user1.equals(user)) 
            {
                System.out.println("Usernames do not match! Please try again");
            }
        } while (!user1.equals(user));
        
        do {
            System.out.print("\nPassword: ");
            password = scanS.nextLine();
            if (!password.equals(pass)) {
                System.out.print("Passwords do not match! Please try again");
            }
        } while (!password.equals(pass));
        
        

        System.out.println("\nBefore we begin let's look at your stats on"
                + " a scale from 1-10: ");

        System.out.print("\nStrength: ");
        strength = scanN.nextInt();
        while (strength > 10 || strength < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nStrength: ");
            strength = scanN.nextInt();
        }

        System.out.print("\nSpeed: ");
        speed = scanN.nextInt();
        while (speed > 10 || speed < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nSpeed: ");
            speed = scanN.nextInt();
        }

        System.out.print("\nEndurance: ");
        endurance = scanN.nextInt();
        while (endurance > 10 || endurance < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nEndurance: ");
            endurance = scanN.nextInt();
        }

        System.out.print("\nAgility: ");
        agility = scanN.nextInt();
        while (agility > 10 || agility < 1) {
            System.out.println("Please pick a valid rating between 1 - 10");
            System.out.print("\nAgility: ");
            agility = scanN.nextInt();
        }

        System.out.println("These are your current stats: \n\n\t-----------"
                + "\n\tSpeed:     " + speed + "\n\tStrength:  " + strength
                + "\n\tEndurance: " + endurance + "\n\tAgility:   " +
                agility + "\n\t------------");

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ": Which skill do you want to i"
                    + "mprove? (Strength, Speed, Endurance, Agility)");
            String choice = scanS.nextLine();

            boolean validChoice = false;

            while (!validChoice) {
                if (choice.equalsIgnoreCase("Strength")) {
                    if (strength < 10) {
                        System.out.println("In order to increase your strength "
                                + "you must complete the following:\n\n"
                                + "- 100-200 pushups/day\n"
                                + "- High-intensity strength training\n"
                                + "- Specialized strength conditioning\n"
                                + "- Advanced resistance and powerlifting exerc"
                                + "ises");
                        validChoice = true;
                    } else {
                        System.out.println("Your Strength is already at the max"
                                + "imum level of 10 and cannot be improved furt"
                                + "her. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Speed")) {
                    if (speed < 10) {
                        System.out.println("In order to increase your speed you"
                                + " must complete the following:\n\n"
                                + "- Daily 15km runs\n"
                                + "- Elite sprint training\n"
                                + "- Intensive interval running\n"
                                + "- Comprehensive lower body workouts");
                        validChoice = true;
                    } else {
                        System.out.println("Your Speed is already at the maximu"
                                + "m level of 10 and cannot be improved further"
                                + ". Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Endurance")) {
                    if (endurance < 10) {
                        System.out.println("In order to increase your endurance"
                                + " you must complete the following:\n\n"
                                + "- Marathon training\n"
                                + "- Extreme cardio sessions\n"
                                + "- Minimum recovery time between sets\n"
                                + "- Maximal frequency, intensity, and duration"
                                + " of exercises");
                        validChoice = true;
                    } else {
                        System.out.println("Your Endurance is already at the ma"
                                + "ximum level of 10 and cannot be improved fur"
                                + "ther. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else if (choice.equalsIgnoreCase("Agility")) {
                    if (agility < 10) {
                        System.out.println("In order to increase your agility y"
                                + "ou must complete the following:\n\n"
                                + "- High-intensity agility drills\n"
                                + "- Complex and varied plyometric routines\n"
                                + "- Multi-directional speed training\n"
                                + "- Comprehensive balance and coordination exe"
                                + "rcises");
                        validChoice = true;
                    } else {
                        System.out.println("Your Agility is already at the maxi"
                                + "mum level of 10 and cannot be improved furth"
                                + "er. Please choose another skill.");
                        choice = scanS.nextLine();
                    }
                } else {
                    System.out.println("Invalid choice. Please select a valid s"
                            + "kill to improve (Strength, Speed, Endurance, Agi"
                            + "lity).");
                    choice = scanS.nextLine();
                }
            }
            
            // Simplified confirmation step with a variable
            String confirmation = "";
            System.out.println("\nPlease confirm that you have completed the ta"
                    + "ks for this week by typing 'yes'.");
            while (!confirmation.equalsIgnoreCase("yes")) {
                confirmation = scanS.nextLine();
                if (!confirmation.equalsIgnoreCase("yes")) {
                    System.out.println("Please complete the tasks before confir"
                            + "ming. Type 'yes' once you have completed them.");
                }
            }

            // Increment the skill level only after confirmation
            switch (choice.toLowerCase()) {
                case "strength":
                    strength++;
                    break;
                case "speed":
                    speed++;
                    break;
                case "endurance":
                    endurance++;
                    break;
                case "agility":
                    agility++;
                    break;
            }

        }

        System.out.println("\n\nEnd of intermediate improvement plan. Final sta"
                + "ts:");
        System.out.println("Strength:  " + strength);
        System.out.println("Speed:     " + speed);
        System.out.println("Endurance: " + endurance);
        System.out.println("Agility:   " + agility);

        System.out.println("\n\nGreat Job. Keep up the good work!!");
    }

    public static void displayTips() {
        Scanner scanN = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n\n*** Tips ***");
            System.out.println("1. Footwork");
            System.out.println("2. Grips");
            System.out.println("3. Shots");
            System.out.println("4. Position & Strategy");
            System.out.println("5. Exit");
            System.out.print("Enter the number of the tip category you want to "
                    + "improve or 5 to exit: ");
            choice = scanN.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n*** Footwork Tips ***");
                    System.out.println("1. Stay on Your Toes: Keep your weight "
                            + "on the balls of your feet to react quickly.");
                    System.out.println("2. Use Small Steps: Make quick, small s"
                            + "teps instead of large strides for better balance"
                            + " and control.");
                    System.out.println("3. Split Step: Just before your opponen"
                            + "t hits the shuttle, perform a small hop to be re"
                            + "ady to move in any direction.");
                    System.out.println("4. Lunge Properly: When lunging, ensure"
                            + " your knee doesn't go past your toes to avoid in"
                            + "jury and maintain balance.");
                    System.out.println("5. Recover Quickly: Always return to a "
                            + "ready position in the center of the court after "
                            + "each shot.");
                    break;
                case 2:
                    System.out.println("\n*** Grips Tips ***");
                    System.out.println("1. Forehand Grip: Hold the racket as if"
                            + " you’re shaking hands with it; the V-shape betwe"
                            + "en your thumb and index finger should be on the "
                            + "top edge of the racket handle.");
                    System.out.println("2. Backhand Grip: Rotate the racket sli"
                            + "ghtly in your hand from the forehand grip positi"
                            + "on so that the thumb is pressing flat against th"
                            + "e back bevel of the racket handle.");
                    System.out.println("3. Grip Pressure: Maintain a relaxed gr"
                            + "ip and tighten it only at the moment of hitting "
                            + "the shuttle to maximize power and control.");
                    break;
                case 3:
                    System.out.println("\n*** Shots Tips ***");
                    System.out.println("1. Clear: Aim high and deep into the op"
                            + "ponent’s court to push them back and gain time t"
                            + "o reposition.");
                    System.out.println("2. Drop Shot: Use a gentle touch to mak"
                            + "e the shuttle fall just over the net, forcing yo"
                            + "ur opponent to move forward quickly.");
                    System.out.println("3. Smash: Aim for a steep downward angl"
                            + "e to make it difficult for your opponent to retu"
                            + "rn. Use a full-arm swing and follow through.");
                    System.out.println("4. Drive: Keep the shuttle low and flat"
                            + " over the net to pressure your opponent and redu"
                            + "ce their attacking options.");
                    System.out.println("5. Net Shot: Use a delicate touch and p"
                            + "ractice controlling the shuttle’s spin to make i"
                            + "t tumble over the net tightly.");
                    break;
                case 4:
                    System.out.println("\n*** Position & Strategy Tips ***");
                    System.out.println("1. Doubles Positioning: Coordinate with"
                            + " your partner; one should cover the front and th"
                            + "e other the back (attack formation) or each side"
                            + " (defense formation).");
                    System.out.println("2. Singles Positioning: Control the cen"
                            + "ter of the court to reduce the distance you need"
                            + " to move for each shot.");
                    System.out.println("3. Anticipation: Watch your opponent’s "
                            + "body language and racket preparation to anticipa"
                            + "te their shots.");
                    System.out.println("4. Variety: Mix up your shots to keep y"
                            + "our opponent guessing and off balance.");
                    System.out.println("5. Focus on Weaknesses: Identify and ex"
                            + "ploit your opponent’s weak areas, such as their "
                            + "backhand or slower movements.");
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using the Badm"
                            + "inton Tips program!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number b"
                            + "etween 1 and 5.");
                    break;
            }
        } while (choice != 5);
    }

    public static void displayNutritionalAdvice() {
        System.out.println("\n\n*** Nutritional Advice ***");
        System.out.println("1. Maintain a balanced diet with carbs, proteins, a"
                + "nd fats.");
        System.out.println("2. Stay hydrated before, during, and after training"
                + ".");
        System.out.println("3. Include fruits and vegetables for vitamins and m"
                + "inerals.");
        System.out.println("4. Avoid excessive sugary and fatty foods.");
        System.out.println("5. Consult with a nutritionist for personalized pla"
                + "ns.");
    }
    
    public static String welcome()
    {
        String screen;
        screen = "  __   ____  _  _     __    ___   __   ____  ____  "
                + "_  _  _  _ "
                + "\n / _\\ (  _ \\( \\/ )   / _\\  / __) / _\\ (    \\(  __)( "
                + "\\/ )( \\/)"
                + "\n/    \\ ) __/ )  (   /    \\( (__ /    \\ ) D ( ) _) / \\/"
                + " \\ )  / "
                + "\n\\_/\\_/(__)  (_/\\_)  \\_/\\_/ \\___)\\_/\\_/(____/(____)"
                + "\\_)(_/(__/";        
        return screen;
    }
}