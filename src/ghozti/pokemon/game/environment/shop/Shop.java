package ghozti.pokemon.game.environment.shop;

import ghozti.pokemon.game.user.User;
import ghozti.pokemon.game.user.UserMethods;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

    public static int shopMenu(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the PokeCenter!, what would you like to buy?");
        System.out.println("***OPTIONS***");
        String[] list = new String[7];

        list[0] = "[1] Pokeball ($10 per ball)";
        list[1] = "[2] Great Ball ($20 per ball)";
        list[2] = "[3] Quick Ball ($15 per ball)";
        list[3] = "[4] Ultra Ball ($45 per ball)";
        list[4] = "[5] Master Ball ($550 per ball)";
        list[5] = "[6] Health Potion ($10 per potion)";
        list[6] = "[7] Heal All Pokemon";
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("***INVENTORY***");
        UserMethods.printInventory();
        System.out.println("***IF YOU WISH TO CANCEL THIS ENTER [0]***");
        try {
            choice = scanner.nextInt();
            if(choice == 0){
                return -1;
            }else if(choice > 0 && choice < 8){
                return choice;
            }else{
                System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
                choice = shopMenu();
            }
        }catch (InputMismatchException e){
            System.out.println("***THIS IS NOT A VALID INPUT PLEASE ENTER A VALID INPUT***");
            choice = shopMenu();
        }
        return choice;//TODO  ***test this***
    }
    /*
        this method will print out all options that the user can choose from. And like other methods it will check for invalid inputs.
        If there are none it will return the user's choice. It will also check if the user entered 0 since it is the "escape" option in case the user decides to not buy anything
     */

    public static void shop(){
        Scanner scanner = new Scanner(System.in);
        int amount;
        int choice = shopMenu();

        switch (choice){
            case -1:
                return;
            case 1:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(10 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 10);
                    UserMethods.addItem(3,amount);
                }
                break;
            case 2:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(20 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 20);
                    UserMethods.addItem(4,amount);
                }
                break;
            case 3:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(15 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 15);
                    UserMethods.addItem(7,amount);
                }
                break;
            case 4:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(45 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 45);
                    UserMethods.addItem(5,amount);
                }
                break;
            case 5:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(550 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 550);
                    UserMethods.addItem(6,amount);
                }
                break;
            case 6:
                System.out.println("Great! How Many Do You Want?");
                amount = scanner.nextInt();
                if(10 * amount > User.money){
                    System.out.println("***YOU DO NOT HAVE ENOUGH!!***");
                    shop();
                }else{
                    User.money -= (amount * 10);
                    UserMethods.addItem(2,amount);
                }
                break;
            case 7:
                for (int i = 0; i < User.pokemons.size(); i++){
                    User.pokemons.get(i).HP = 100;
                }
                System.out.println("***Healed All Pokemon***");
                return;
        }
    }
    /*
        the shop method will get the user's input from shopMenu and process what to do based on the user's input. If the user's choice is 7, all of the user's pokemon will be healed.
        If the option is not 0, the user will be asked how much of the item they wish to buy.
     */
}
