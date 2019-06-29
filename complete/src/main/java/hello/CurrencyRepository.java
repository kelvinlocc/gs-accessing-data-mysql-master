package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

//    @Query("select c from Currency c where c.currencyCode=?1")
//    Currency findCurrencyByName(String currency);
}
