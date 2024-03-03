/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Supplier#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.Supplier#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.Supplier#getContactInfo <em>Contact Info</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends EObject {
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
	 * @see RiseAndShop.RiseAndShopPackage#getSupplier_Id()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Supplier#getId <em>Id</em>}' attribute.
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
	 * @see RiseAndShop.RiseAndShopPackage#getSupplier_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Supplier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contact Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Info</em>' attribute.
	 * @see #setContactInfo(String)
	 * @see RiseAndShop.RiseAndShopPackage#getSupplier_ContactInfo()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContactInfo();

	/**
	 * Sets the value of the '{@link RiseAndShop.Supplier#getContactInfo <em>Contact Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Info</em>' attribute.
	 * @see #getContactInfo()
	 * @generated
	 */
	void setContactInfo(String value);

} // Supplier
