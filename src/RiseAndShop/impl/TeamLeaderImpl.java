/**
 */
package RiseAndShop.impl;

import RiseAndShop.Notification;
import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.TeamLeader;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Leader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.TeamLeaderImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamLeaderImpl extends EmployeeImpl implements TeamLeader {
	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamLeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.TEAM_LEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectResolvingEList<Notification>(Notification.class, this, RiseAndShopPackage.TEAM_LEADER__NOTIFICATIONS);
		}
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.TEAM_LEADER__NOTIFICATIONS:
				return getNotifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiseAndShopPackage.TEAM_LEADER__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends Notification>)newValue);
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
			case RiseAndShopPackage.TEAM_LEADER__NOTIFICATIONS:
				getNotifications().clear();
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
			case RiseAndShopPackage.TEAM_LEADER__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TeamLeaderImpl
