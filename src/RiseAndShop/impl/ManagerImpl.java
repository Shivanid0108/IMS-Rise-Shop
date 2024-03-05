/**
 */
package RiseAndShop.impl;

import RiseAndShop.Manager;
import RiseAndShop.RiseAndShopPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManagerImpl extends EmployeeImpl implements Manager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getProductLocation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Product Location is displayed");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateCategory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Category updated");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSalesDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Sales details displayed i.e. Total sales");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RiseAndShopPackage.MANAGER___GET_PRODUCT_LOCATION:
				getProductLocation();
				return null;
			case RiseAndShopPackage.MANAGER___UPDATE_CATEGORY:
				updateCategory();
				return null;
			case RiseAndShopPackage.MANAGER___GET_SALES_DETAILS:
				getSalesDetails();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagerImpl
