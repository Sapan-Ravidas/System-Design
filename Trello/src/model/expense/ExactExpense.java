package model.expense;

import java.util.List;

import model.User;
import model.split.ExactSplit;
import model.split.Split;

public class ExactExpense extends Expense{
    public ExactExpense(double amount, User paidBy, List<Split> splits, ExpenseMetaData metaData) {
        super(amount, paidBy, splits, metaData);
    }

    @Override
    public boolean validate() {
        for(Split split : getSplits()) {
            if (!(split instanceof ExactSplit))
                return false;
        }
        
        double totalAmout = getAmount();
        double sumSplitAmout = 0;
        
        for (Split split : getSplits()) {
            ExactSplit exactSplit = (ExactSplit) split;
            sumSplitAmout += exactSplit.getAmount();
        }

        if (totalAmout != sumSplitAmout) return false;
        return true;
    }
}
