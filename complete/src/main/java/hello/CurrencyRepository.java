package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
//
//    @Query("SELECT new Currency(c.id, c.currencyCode, c.exchangeCurrencyCode, c.rate) " +
//            " FROM Currency c " +
//            " WHERE c.currencyCode = :currencyCode")
//    Currency findCurrencyByName(@PathVariable("currencyCode") String currencyCode);
}
