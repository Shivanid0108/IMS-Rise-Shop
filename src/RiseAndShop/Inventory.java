/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Inventory#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getInventory()
 * @model
 * @generated
 */
public interface Inventory extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.Categories}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getInventory_Category()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Categories> getCategory();

} // Inventory
