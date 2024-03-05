/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Cashier#getCarts <em>Carts</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getCashier()
 * @model
 * @generated
 */
public interface Cashier extends Employee {
	/**
	 * Returns the value of the '<em><b>Carts</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.Cart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carts</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getCashier_Carts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Cart> getCarts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifyLowStock();

} // Cashier
