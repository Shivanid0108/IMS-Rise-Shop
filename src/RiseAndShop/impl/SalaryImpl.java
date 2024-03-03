/**
 */
package RiseAndShop.impl;

import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.Salary;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.SalaryImpl#getChequeId <em>Cheque Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalaryImpl extends MinimalEObjectImpl.Container implements Salary {
	/**
	 * The default value of the '{@link #getChequeId() <em>Cheque Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeId()
	 * @generated
	 * @ordered
	 */
	protected static final double CHEQUE_ID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChequeId() <em>Cheque Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeId()
	 * @generated
	 * @ordered
	 */
	protected double chequeId = CHEQUE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.SALARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getChequeId() {
		return chequeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChequeId(double newChequeId) {
		double oldChequeId = chequeId;
		chequeId = newChequeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.SALARY__CHEQUE_ID, oldChequeId, chequeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.SALARY__CHEQUE_ID:
				return getChequeId();
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
			case RiseAndShopPackage.SALARY__CHEQUE_ID:
				setChequeId((Double)newValue);
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
			case RiseAndShopPackage.SALARY__CHEQUE_ID:
				setChequeId(CHEQUE_ID_EDEFAULT);
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
			case RiseAndShopPackage.SALARY__CHEQUE_ID:
				return chequeId != CHEQUE_ID_EDEFAULT;
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
		result.append(" (chequeId: ");
		result.append(chequeId);
		result.append(')');
		return result.toString();
	}

} //SalaryImpl
