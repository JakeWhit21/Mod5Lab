package wctc.edu;

import java.time.LocalDate;

public interface Product {
    String getTitle();

    double getCost();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getFormattedReleaseDate();

    void order(int quantity);
}
