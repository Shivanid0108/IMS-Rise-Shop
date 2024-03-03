/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.Notification#getMessage <em>Message</em>}</li>
 *   <li>{@link RiseAndShop.Notification#getNotificationId <em>Notification Id</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see RiseAndShop.RiseAndShopPackage#getNotification_Message()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link RiseAndShop.Notification#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Notification Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Id</em>' attribute.
	 * @see #setNotificationId(int)
	 * @see RiseAndShop.RiseAndShopPackage#getNotification_NotificationId()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNotificationId();

	/**
	 * Sets the value of the '{@link RiseAndShop.Notification#getNotificationId <em>Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Id</em>' attribute.
	 * @see #getNotificationId()
	 * @generated
	 */
	void setNotificationId(int value);

} // Notification
