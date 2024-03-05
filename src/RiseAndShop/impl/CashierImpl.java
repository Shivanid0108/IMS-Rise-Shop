/**
 */
package RiseAndShop.impl;

import RiseAndShop.Cart;
import RiseAndShop.Cashier;
import RiseAndShop.RiseAndShopPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.CashierImpl#getCarts <em>Carts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierImpl extends EmployeeImpl implements Cashier {
	/**
	 * The cached value of the '{@link #getCarts() <em>Carts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarts()
	 * @generated
	 * @ordered
	 */
	protected EList<Cart> carts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.CASHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cart> getCarts() {
		if (carts == null) {
			carts = new EObjectResolvingEList<Cart>(Cart.class, this, RiseAndShopPackage.CASHIER__CARTS);
		}
		return carts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyLowStock() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Notitifcation sent to Manger using the Notfication class");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.CASHIER__CARTS:
				return getCarts();
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
			case RiseAndShopPackage.CASHIER__CARTS:
				getCarts().clear();
				getCarts().addAll((Collection<? extends Cart>)newValue);
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
			case RiseAndShopPackage.CASHIER__CARTS:
				getCarts().clear();
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
			case RiseAndShopPackage.CASHIER__CARTS:
				return carts != null && !carts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RiseAndShopPackage.CASHIER___NOTIFY_LOW_STOCK:
				notifyLowStock();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CashierImpl
