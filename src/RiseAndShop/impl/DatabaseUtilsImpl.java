/**
 */
package RiseAndShop.impl;

import RiseAndShop.DatabaseUtils;
import RiseAndShop.RiseAndShopPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DatabaseUtilsImpl extends MinimalEObjectImpl.Container implements DatabaseUtils {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseUtilsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.DATABASE_UTILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEmployee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateEmployee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteEmployee() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addStore() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateStore() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteStore() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RiseAndShopPackage.DATABASE_UTILS___ADD_EMPLOYEE:
				addEmployee();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___UPDATE_EMPLOYEE:
				UpdateEmployee();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___DELETE_EMPLOYEE:
				deleteEmployee();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___ADD_PRODUCT:
				addProduct();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___DELETE_PRODUCT:
				deleteProduct();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___ADD_STORE:
				addStore();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___UPDATE_STORE:
				updateStore();
				return null;
			case RiseAndShopPackage.DATABASE_UTILS___DELETE_STORE:
				deleteStore();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DatabaseUtilsImpl
