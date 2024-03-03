/**
 */
package RiseAndShop.impl;

import RiseAndShop.Main;
import RiseAndShop.RiseAndShopPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.MainImpl#getCurrEmployee <em>Curr Employee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main {
	/**
	 * The default value of the '{@link #getCurrEmployee() <em>Curr Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrEmployee()
	 * @generated
	 * @ordered
	 */
	protected static final String CURR_EMPLOYEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrEmployee() <em>Curr Employee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrEmployee()
	 * @generated
	 * @ordered
	 */
	protected String currEmployee = CURR_EMPLOYEE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrEmployee() {
		return currEmployee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrEmployee(String newCurrEmployee) {
		String oldCurrEmployee = currEmployee;
		currEmployee = newCurrEmployee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.MAIN__CURR_EMPLOYEE, oldCurrEmployee, currEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.MAIN__CURR_EMPLOYEE:
				return getCurrEmployee();
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
			case RiseAndShopPackage.MAIN__CURR_EMPLOYEE:
				setCurrEmployee((String)newValue);
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
			case RiseAndShopPackage.MAIN__CURR_EMPLOYEE:
				setCurrEmployee(CURR_EMPLOYEE_EDEFAULT);
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
			case RiseAndShopPackage.MAIN__CURR_EMPLOYEE:
				return CURR_EMPLOYEE_EDEFAULT == null ? currEmployee != null : !CURR_EMPLOYEE_EDEFAULT.equals(currEmployee);
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
		result.append(" (currEmployee: ");
		result.append(currEmployee);
		result.append(')');
		return result.toString();
	}

} //MainImpl
