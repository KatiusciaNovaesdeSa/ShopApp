package com.revature.repository;

import java.util.List;

import javax.transaction.Transactional;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.model.AddtoCart;


public interface AddToCartRepository extends JpaRepository<AddtoCart, Long> {
	
		//getCartByuserId

		//add cart by userId and cartId	
		@Query("select addCart from AddtoCart addCart where addCart.user_id=user_id")
		List<AddtoCart> getCartByuserId(@Param("user_id")Long user_id);
		
		
		
		@Query("select addCart from AddtoCart addCart where addCart.product.id= product_id and addCart.user_id= user_id")
		Optional<AddtoCart> getCartByProductIdAnduserId(@Param("user_id")Long user_id,@Param("product_id")String productId);
		
	
		
	/*	@Modifying
	    @Transactional
		@Query("delete addCart from AddtoCart where addCart_id =cart_id and addCart.user_id=user_id")
		void deleteCartByIdAndUserId(@Param("user_id")Long user_id,@Param("cart_id")Long addcart_id);
		
		*/
		
	/*	@Modifying
	    @Transactional
		@Query("delete addCart from AddtoCart addCart where addCart.user_id=user_id")
		void deleteAllCartByUserId(@Param("user_id")Long user_id);
		
		*/
		
	/*	@Modifying
	    @Transactional
		@Query("update addCart from AddtoCart set addCart.qty=qty,addCart.price=price where addCart.id=cart_id")
		void updateQtyByCartId(@Param("cart_id")Long cart_id,@Param("price")double price,@Param("qty")Integer qty);

		*/
		
		/*
		 * addcart_id
		 * 
		 * //add cart by userId and cartId	
		@Query("select addCart from AddtoCart addCart where addCart.user_id=user_id")
		List<AddtoCart> getCartByuserId(@Param("user_id")Long user_id);
		
		
		@Query("select addCart from AddtoCart addCart where addCart.product.id=product_id and addCart.user_id=user_id")
		Optional<AddtoCart> getCartByProductIdAnduserId(@Param("user_id")Long user_id,@Param("product_id")Long product_id);
		
		@Modifying
	    @Transactional
		@Query("delete addCart from AddtoCart where addCart.addcart_id =cart_id and addCart.user_id=user_id")
		void deleteCartByIdAndUserId(@Param("user_id")Long user_id,@Param("cart_id")Long addcart_id);
		
		@Modifying
	    @Transactional
		@Query("delete addCart from AddtoCart where addCart.user_id=user_id")
		void deleteAllCartByUserId(@Param("user_id")Long user_id);
		
		@Modifying
	    @Transactional
		@Query("update addCart from AddtoCart set addCart.qty=qty,addCart.price=price where addCart.addcart_id=cart_id")
		void updateQtyByCartId(@Param("cart_id")Long addcart_id,@Param("price")double price,@Param("qty")Integer qty);
		 * 
		 * 
		 */
		
		
		
		
		
	/*ORIGINAL	
	 * 
	 * @Query("Select sum(addCart.price) FROM AddtoCart addCart WHERE addCart.user_id=:user_id")
		double getTotalAmountByUserId(@Param("user_id")Long user_id);
		
		@Query("select addCart from AddtoCart addCart where addCart.user_id=user_id")
		List<AddtoCart> getCartByuserId(@Param("user_id")Long user_id);
		
		@Query("select addCart from AddtoCart addCart ")
		Optional<AddtoCart> getCartByuserIdtest();
		
		@Query("select addCart from AddtoCart addCart where addCart.product.id=product_id and addCart.user_id=user_id")
		Optional<AddtoCart> getCartByProductIdAnduserId(@Param("user_id")Long user_id,@Param("product_id")Long product_id);
		
		@Modifying
	    @Transactional
		@Query("delete from AddtoCart addCart where addCart.id =cart_id and addCart.user_id=user_id")
		void deleteCartByIdAndUserId(@Param("user_id")Long user_id,@Param("cart_id")Long cart_id);
		
		@Modifying
	    @Transactional
		@Query("delete from AddtoCart addCart where addCart.user_id=user_id")
		void deleteAllCartByUserId(@Param("user_id")Long user_id);
		
		@Modifying
	    @Transactional
		@Query("delete from AddtoCart addCart where addCart.user_id=user_id")
		void deleteAllCartUserId(@Param("user_id")Long user_id);
		
		@Modifying
	    @Transactional
		@Query("update AddtoCart addCart set addCart.qty=:qty,addCart.price=:price where addCart.id=cart_id")
		void updateQtyByCartId(@Param("cart_id")Long cart_id,@Param("price")double price,@Param("qty")Integer qty);
		
		*/
		

}
