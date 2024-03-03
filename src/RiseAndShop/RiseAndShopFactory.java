/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RiseAndShop.RiseAndShopPackage
 * @generated
 */
public interface RiseAndShopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiseAndShopFactory eINSTANCE = RiseAndShop.impl.RiseAndShopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store</em>'.
	 * @generated
	 */
	Store createStore();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Cart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cart</em>'.
	 * @generated
	 */
	Cart createCart();

	/**
	 * Returns a new object of class '<em>Cart Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cart Item</em>'.
	 * @generated
	 */
	CartItem createCartItem();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Review</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review</em>'.
	 * @generated
	 */
	Review createReview();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory</em>'.
	 * @generated
	 */
	Inventory createInventory();

	/**
	 * Returns a new object of class '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categories</em>'.
	 * @generated
	 */
	Categories createCategories();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier</em>'.
	 * @generated
	 */
	Supplier createSupplier();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Salary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salary</em>'.
	 * @generated
	 */
	Salary createSalary();

	/**
	 * Returns a new object of class '<em>Utils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utils</em>'.
	 * @generated
	 */
	Utils createUtils();

	/**
	 * Returns a new object of class '<em>Database Utils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Utils</em>'.
	 * @generated
	 */
	DatabaseUtils createDatabaseUtils();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RiseAndShopPackage getRiseAndShopPackage();

} //RiseAndShopFactory
