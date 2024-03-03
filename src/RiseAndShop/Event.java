/**
 */
package RiseAndShop;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Event#getEventName <em>Event Name</em>}</li>
 *   <li>{@link RiseAndShop.Event#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see RiseAndShop.RiseAndShopPackage#getEvent_EventName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link RiseAndShop.Event#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see RiseAndShop.RiseAndShopPackage#getEvent_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link RiseAndShop.Event#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Event
