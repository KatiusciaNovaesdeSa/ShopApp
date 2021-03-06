package com.revature.service;

import java.util.List;

import com.revature.model.AddtoCart;
import com.revature.model.Products;
import com.revature.repository.AddToCartRepository;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;



import com.revature.service.ProductServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService {
	@Autowired
	AddToCartRepository addCartRepo;
//	@Autowired
//	CheckoutRepository checkOutRepo;
	@Autowired
	ProductServices proServices;
	
//    private static final Logger logger = LoggerFactory.getLogger(CartSerivceImpl.class);

	
	 // AFTER FIX QUERIES UNCOMMENT THOSE
	//  	@Override
//	public List<AddtoCart> addCartbyUserIdAndProductId(String productId, long userId,int qty,double price) throws Exception {
//		try {
//			if(addCartRepo.getCartByProductIdAnduserId(userId, productId).isPresent()){
//				throw new Exception("Product is already exist.");
//			}
//			AddtoCart obj = new AddtoCart();
//			obj.setQty(qty);
//			obj.setUser_id(userId);
//			Products pro = proServices.getProductsById(productId);
//			obj.setProduct_id(pro); 
//			//TODO price has to check with qty
//			obj.setPrice(price);
//			addCartRepo.save(obj);		
//			return this.getCartByUserId(userId);	
//		}catch(Exception e) {
//			e.printStackTrace();
//			//logger.error(""+e.getMessage());
//			throw new Exception(e.getMessage());
//		}
//		
//	}
	
	

/*	@Override
	public List<AddtoCart> getCartByUserId(long userId) {
		return addCartRepo.getCartByuserId(userId);
	}
	
	*/
	


/*	@Override
	public List<AddtoCart> removeCartByUserId(long cartId, long userId) {
		addCartRepo.deleteCartByIdAndUserId(userId, cartId);
		return this.getCartByUserId(userId);
	}

*/

/*	@Override
	public void updateQtyByCartId(long cartId, int qty, double price) throws Exception {
		addCartRepo.updateQtyByCartId(cartId,price,qty);
	}
	
	*/
	

 /*	@Override
	public List<AddtoCart> removeAllCartByUserId(long userId) {
		addCartRepo.deleteAllCartByUserId(userId);
		return null;
	}
	
	*/


}
