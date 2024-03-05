/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Main#getCurrEmployee <em>Curr Employee</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
	
	/**
	 * Returns the value of the '<em><b>Curr Employee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curr Employee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curr Employee</em>' attribute.
	 * @see #setCurrEmployee(String)
	 * @see RiseAndShop.RiseAndShopPackage#getMain_CurrEmployee()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCurrEmployee();

	/**
	 * Sets the value of the '{@link RiseAndShop.Main#getCurrEmployee <em>Curr Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Employee</em>' attribute.
	 * @see #getCurrEmployee()
	 * @generated
	 */
	void setCurrEmployee(String value);

} // Main
