package edu.neu.hoso.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ExpenseItemsListWithUserId {
    @Getter
    @Setter
    private Integer userId;

    @Getter
    @Setter
    private List<ExpenseItems> expenseItemsList;
}
