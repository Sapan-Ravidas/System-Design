package services;

import java.util.List;

import model.User;
import model.expense.EqualExpense;
import model.expense.ExactExpense;
import model.expense.Expense;
import model.expense.ExpenseMetaData;
import model.expense.ExpenseType;
import model.expense.PercentExpense;
import model.split.PercentSplit;
import model.split.Split;

public class ExpenseService {
    public static Expense createExpense(
        ExpenseType expenseType,
        double amount,
        User paidBy,
        List<Split> splits,
        ExpenseMetaData metaData) {
            switch (expenseType) {
                case EXACT:
                    return new ExactExpense(amount, paidBy, splits, metaData);
                case PERCENT:
                    for (Split split: splits) {
                        PercentSplit percentSplit = (PercentSplit) split;
                        split.setAmount((amount * percentSplit.getPercent()));
                    }
                    return new PercentExpense(amount, paidBy, splits, metaData);
                case EQUAL:
                    int totalSplits = splits.size();
                    double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100.0;
                    for (Split split : splits) {
                        split.setAmount(splitAmount);
                    }                
                    splits.get(0).setAmount(splitAmount + (amount - splitAmount*totalSplits));
                    return new EqualExpense(splitAmount, paidBy, splits, metaData);
                default: return null;
            }
        }
}
