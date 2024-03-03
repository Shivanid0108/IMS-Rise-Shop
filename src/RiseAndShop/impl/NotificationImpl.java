/**
 */
package RiseAndShop.impl;

import RiseAndShop.Notification;
import RiseAndShop.RiseAndShopPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.NotificationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link RiseAndShop.impl.NotificationImpl#getNotificationId <em>Notification Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends MinimalEObjectImpl.Container implements Notification {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationId() <em>Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationId()
	 * @generated
	 * @ordered
	 */
	protected static final int NOTIFICATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNotificationId() <em>Notification Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationId()
	 * @generated
	 * @ordered
	 */
	protected int notificationId = NOTIFICATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.NOTIFICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNotificationId() {
		return notificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationId(int newNotificationId) {
		int oldNotificationId = notificationId;
		notificationId = newNotificationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.NOTIFICATION__NOTIFICATION_ID, oldNotificationId, notificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.NOTIFICATION__MESSAGE:
				return getMessage();
			case RiseAndShopPackage.NOTIFICATION__NOTIFICATION_ID:
				return getNotificationId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiseAndShopPackage.NOTIFICATION__MESSAGE:
				setMessage((String)newValue);
				return;
			case RiseAndShopPackage.NOTIFICATION__NOTIFICATION_ID:
				setNotificationId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RiseAndShopPackage.NOTIFICATION__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case RiseAndShopPackage.NOTIFICATION__NOTIFICATION_ID:
				setNotificationId(NOTIFICATION_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RiseAndShopPackage.NOTIFICATION__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case RiseAndShopPackage.NOTIFICATION__NOTIFICATION_ID:
				return notificationId != NOTIFICATION_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (message: ");
		result.append(message);
		result.append(", notificationId: ");
		result.append(notificationId);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
