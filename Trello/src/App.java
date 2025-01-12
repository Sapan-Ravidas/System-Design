import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.expense.ExpenseType;
import model.split.EqualSplit;
import model.split.ExactSplit;
import model.split.PercentSplit;
import model.split.Split;
import services.ExpenseManager;

public class App {
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();
        /**
         * add users to expense manager
         */

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] command = scanner.nextLine().split("\\s");
            String commandType = command[0];

            switch (commandType) {
                case "SHOW":
                    if (command.length == 1) {
                        expenseManager.showBalances();
                    } else {
                        expenseManager.showBalance(command[1]);
                    }
                    break;
                case "EXPENSE":
                    String paidBy = command[1];
                    Double amount = Double.parseDouble(command[2]);
                    int noOfUsers = Integer.parseInt(command[3]);
                    String expenseType = command[4 + noOfUsers];
                    
                    List<Split> splits = new ArrayList<>();
                    switch (expenseType) {
                        case "EQUAL":
                            for (int i = 0; i < noOfUsers; ++ i) {
                                splits.add(new EqualSplit(expenseManager.getUserMap().get(command[4 + i])));
                            }
                            expenseManager.addExpense(
                                ExpenseType.EQUAL, 
                                amount, 
                                paidBy, splits, null);
                            break;

                        case "EXACT" :
                            for (int i = 0; i < noOfUsers; ++ i) {
                                splits.add(new ExactSplit(expenseManager.getUserMap().get(command[4 + i]), 
                                    Double.parseDouble(command[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.EQUAL, amount, paidBy, splits, null);
                            break;
                        case "PERCENT":
                            for (int i = 0; i < noOfUsers; ++ i) {
                                splits.add(new PercentSplit(expenseManager.getUserMap().get(command[4 + i]),
                                Double.parseDouble(command[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.PERCENT, amount, paidBy, splits, null);
                        default:
                            break;
                    }
                default:
                    break;
            }
            
        }
    }
}
