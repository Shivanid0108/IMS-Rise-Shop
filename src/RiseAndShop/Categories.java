/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Categories#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.Categories#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RiseAndShop.RiseAndShopPackage#getCategories_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Categories#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference.
	 * @see #setProducts(Product)
	 * @see RiseAndShop.RiseAndShopPackage#getCategories_Products()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Product getProducts();

	/**
	 * Sets the value of the '{@link RiseAndShop.Categories#getProducts <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Product value);

} // Categories
