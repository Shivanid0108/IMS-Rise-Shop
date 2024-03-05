/**
 */
package RiseAndShop.impl;

import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.Superviser;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superviser</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SuperviserImpl extends EmployeeImpl implements Superviser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperviserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.SUPERVISER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Product Updated");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNewProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Create a new product");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DeleteProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Product deleted");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStockDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
//		throw new UnsupportedOperationException();
		System.out.println("Display Stock Details");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RiseAndShopPackage.SUPERVISER___UPDATE_PRODUCT:
				UpdateProduct();
				return null;
			case RiseAndShopPackage.SUPERVISER___ADD_NEW_PRODUCT:
				addNewProduct();
				return null;
			case RiseAndShopPackage.SUPERVISER___DELETE_PRODUCT:
				DeleteProduct();
				return null;
			case RiseAndShopPackage.SUPERVISER___GET_STOCK_DETAILS:
				getStockDetails();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SuperviserImpl
