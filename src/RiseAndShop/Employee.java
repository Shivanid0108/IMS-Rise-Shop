/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Employee#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getUsername <em>Username</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getPassword <em>Password</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getRole <em>Role</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getCarts <em>Carts</em>}</li>
 *   <li>{@link RiseAndShop.Employee#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
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
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Id()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Username()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link RiseAndShop.Employee#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link RiseAndShop.Employee#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Role()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link RiseAndShop.Employee#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

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
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Carts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Cart> getCarts();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' reference list.
	 * The list contents are of type {@link RiseAndShop.Notification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' reference list.
	 * @see RiseAndShop.RiseAndShopPackage#getEmployee_Notifications()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Notification> getNotifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getProductLocation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getStockDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateProductQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateCategory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNewProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DeleteProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getSalesDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifyLowStock();

} // Employee
