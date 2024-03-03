/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Cart#getCartId <em>Cart Id</em>}</li>
 *   <li>{@link RiseAndShop.Cart#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link RiseAndShop.Cart#getProducts <em>Products</em>}</li>
 *   <li>{@link RiseAndShop.Cart#getPaymentIssued <em>Payment Issued</em>}</li>
 *   <li>{@link RiseAndShop.Cart#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getCart()
 * @model
 * @generated
 */
public interface Cart extends EObject {
	/**
	 * Returns the value of the '<em><b>Cart Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cart Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart Id</em>' attribute.
	 * @see #setCartId(int)
	 * @see RiseAndShop.RiseAndShopPackage#getCart_CartId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCartId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Cart#getCartId <em>Cart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart Id</em>' attribute.
	 * @see #getCartId()
	 * @generated
	 */
	void setCartId(int value);

	/**
	 * Returns the value of the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Id</em>' attribute.
	 * @see #setCustomerId(int)
	 * @see RiseAndShop.RiseAndShopPackage#getCart_CustomerId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCustomerId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Cart#getCustomerId <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Id</em>' attribute.
	 * @see #getCustomerId()
	 * @generated
	 */
	void setCustomerId(int value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.CartItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getCart_Products()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CartItem> getProducts();

	/**
	 * Returns the value of the '<em><b>Payment Issued</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Issued</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Issued</em>' reference.
	 * @see #setPaymentIssued(Payment)
	 * @see RiseAndShop.RiseAndShopPackage#getCart_PaymentIssued()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Payment getPaymentIssued();

	/**
	 * Sets the value of the '{@link RiseAndShop.Cart#getPaymentIssued <em>Payment Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Issued</em>' reference.
	 * @see #getPaymentIssued()
	 * @generated
	 */
	void setPaymentIssued(Payment value);

	/**
	 * Returns the value of the '<em><b>Review</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' reference.
	 * @see #setReview(Review)
	 * @see RiseAndShop.RiseAndShopPackage#getCart_Review()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Review getReview();

	/**
	 * Sets the value of the '{@link RiseAndShop.Cart#getReview <em>Review</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review</em>' reference.
	 * @see #getReview()
	 * @generated
	 */
	void setReview(Review value);

} // Cart
