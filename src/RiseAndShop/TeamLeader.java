/**
 */
package RiseAndShop;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Leader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.TeamLeader#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see RiseAndShop.RiseAndShopPackage#getTeamLeader()
 * @model
 * @generated
 */
public interface TeamLeader extends Employee {
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
	 * @see RiseAndShop.RiseAndShopPackage#getTeamLeader_Notifications()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Notification> getNotifications();

} // TeamLeader
