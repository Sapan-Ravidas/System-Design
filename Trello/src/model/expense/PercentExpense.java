package model.expense;

import java.util.List;

import model.User;
import model.split.PercentSplit;
import model.split.Split;

public class PercentExpense extends Expense {
    public PercentExpense(double amount, User paidBy, List<Split> splits, ExpenseMetaData metaData) {
        super(amount, paidBy, splits, metaData);
    }

    @Override
    public boolean validate() {
        for (Split split : getSplits()) {
            if (!(split instanceof PercentSplit))
                return false;
        }

        double totalPercent = 100;
        double sumSplitPercent = 0;
        for (Split split : getSplits()) {
            PercentSplit pSplit = (PercentSplit) split;
            sumSplitPercent += pSplit.getPercent();
        }

        if (totalPercent != sumSplitPercent)
            return false;
        return true;
    }
}
 