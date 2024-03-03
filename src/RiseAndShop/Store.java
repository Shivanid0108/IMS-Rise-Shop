/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Store#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.Store#getAddress <em>Address</em>}</li>
 *   <li>{@link RiseAndShop.Store#getEmployees <em>Employees</em>}</li>
 *   <li>{@link RiseAndShop.Store#getFullInventory <em>Full Inventory</em>}</li>
 *   <li>{@link RiseAndShop.Store#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends EObject {
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
	 * @see RiseAndShop.RiseAndShopPackage#getStore_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Store#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see RiseAndShop.RiseAndShopPackage#getStore_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link RiseAndShop.Store#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getStore_Employees()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Full Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Inventory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Inventory</em>' reference.
	 * @see #setFullInventory(Inventory)
	 * @see RiseAndShop.RiseAndShopPackage#getStore_FullInventory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Inventory getFullInventory();

	/**
	 * Sets the value of the '{@link RiseAndShop.Store#getFullInventory <em>Full Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Inventory</em>' reference.
	 * @see #getFullInventory()
	 * @generated
	 */
	void setFullInventory(Inventory value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getStore_Events()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getEvents();

} // Store
