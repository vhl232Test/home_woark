package work_2;

import java.util.*;

public class Wallet {

    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        //Account account = wallet.create_user(new Account());
/*
        System.out.println(account.getName() + " " + account.getFamily() + " "
                + account.getPhone() +" "+ account.getAmount() );

 */
        wallet.do_account();

        for (Map.Entry entry : wallet.accounts_list.entrySet()) {
            System.out.println("Id: " + entry.getKey() + " User's data: "
                    + entry.getValue());
        }

        //wallet.increase_sum_account();
        wallet.transfer_amount_between_users();
    }

    Map<Integer,Account> accounts_list = new HashMap<>();;

     void do_account(){

        int long_mass = 0;
        boolean tr = true;
        while (tr){

            System.out.println("""
                    If you want to create an user enter "Y",
                    if not enter "N".
                    You can create only five users,
                    but not less than two.
                    """);

            String y_n = new Scanner(System.in).nextLine();
            if (y_n.equals("Y")){
                accounts_list.put(long_mass,create_user(new Account()));
                long_mass++;
            }
            else if (y_n.equals("N")){
                tr = false;
                System.out.println("You have created: " + long_mass );
            }
            else if (long_mass == 5 ) {tr = false;
            System.out.println("Sorry, but stack is overflow ");
            }
        }
    }

    Account create_user(Account user_account){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter users' name: ");
        user_account.name = scanner.nextLine();

        System.out.println("Please, enter users' family: ");
        user_account.family = scanner.nextLine();

        System.out.println("Please, enter users' phone: ");
        user_account.phone = scanner.nextLine();

        System.out.println("Please, enter amount of users' account: ");
        user_account.amount = scanner.nextInt();

        return new Account(user_account.name, user_account.family,
                user_account.phone, user_account.amount);
    }

    void increase_sum_account(){

        System.out.println("""
               Do you want to increase an user's cash? press "Y",
               if not enter "N".              
               """);

        String y_n = new Scanner(System.in).nextLine();
        if (y_n.equals("Y")){
            System.out.println("Please, enter users' id: ");
            int users_id = new Scanner(System.in).nextInt();

            if (accounts_list.containsKey(users_id)) {

                System.out.println("Please, enter new amount(only numbers like - 1 , 12 ,49.): ");
                int new_amount = new Scanner(System.in).nextInt();

                Account account_2 = accounts_list.get(users_id);
                account_2.setAmount(new_amount + account_2.getAmount());
                System.out.println("New amount is: " + account_2.getAmount());
            }
            else System.out.println("Such user is not exist");
        }
        else if (y_n.equals("N")){
            System.out.println("Maybe next time");
        }


    }

    void transfer_amount_between_users(){

        System.out.println("""
               If you want to transfer funds from one user to another press "Y",
               if not enter "N".               
               """);

        String y_n = new Scanner(System.in).nextLine();
        if (y_n.equals("Y")){
            System.out.println("""
                    Enter the Id of the user from which you want to transfer funds:
                    """);
            int users_id_from = new Scanner(System.in).nextInt();
            System.out.println("""
                    Enter the id of the user to whom you want to transfer funds:
                    """);
            int users_id_whom = new Scanner(System.in).nextInt();
            if (accounts_list.containsKey(users_id_from ) && accounts_list.containsKey(users_id_whom)) {
                System.out.println("""
                        Please, enter the sum which do want to transfer(only numbers like - 1 , 12 ,49.): 
                        """);
                int transfer_amount = new Scanner(System.in).nextInt();

                Account account_2 = accounts_list.get(users_id_from);
                Account account_3 = accounts_list.get(users_id_whom);

                int new_sum = account_2.getAmount() - transfer_amount;
                if(new_sum<=0){
                    System.out.println("User with Id: "+users_id_from + " don't have enough money" );
                }

                else {
                    account_3.setAmount(account_3.getAmount()+transfer_amount);
                    account_2.setAmount(new_sum);
                    System.out.println("New amount user with id: "+users_id_from +" is: " + account_2.getAmount());
                    System.out.println("New amount user with id: "+users_id_whom +" is: " + account_3.getAmount());
                }

            }
            else System.out.println("One of users is not exist");
        }
        else if (y_n.equals("N")){
            System.out.println("Maybe next time");
        }


    }


}
