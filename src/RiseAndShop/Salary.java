/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Salary#getChequeId <em>Cheque Id</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getSalary()
 * @model
 * @generated
 */
public interface Salary extends EObject {
	/**
	 * Returns the value of the '<em><b>Cheque Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque Id</em>' attribute.
	 * @see #setChequeId(double)
	 * @see RiseAndShop.RiseAndShopPackage#getSalary_ChequeId()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getChequeId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Salary#getChequeId <em>Cheque Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cheque Id</em>' attribute.
	 * @see #getChequeId()
	 * @generated
	 */
	void setChequeId(double value);

} // Salary
