/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Product#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.Product#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.Product#getLocation <em>Location</em>}</li>
 *   <li>{@link RiseAndShop.Product#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link RiseAndShop.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link RiseAndShop.Product#getSupplierInfo <em>Supplier Info</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
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
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_Id()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_Quantity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Supplier Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Info</em>' reference.
	 * @see #setSupplierInfo(Supplier)
	 * @see RiseAndShop.RiseAndShopPackage#getProduct_SupplierInfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Supplier getSupplierInfo();

	/**
	 * Sets the value of the '{@link RiseAndShop.Product#getSupplierInfo <em>Supplier Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Info</em>' reference.
	 * @see #getSupplierInfo()
	 * @generated
	 */
	void setSupplierInfo(Supplier value);

} // Product
