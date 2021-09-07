package br.com.cassioliveira.shoppingcart.repository;

import br.com.cassioliveira.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
