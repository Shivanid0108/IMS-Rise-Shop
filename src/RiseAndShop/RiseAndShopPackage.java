/**
 */
package RiseAndShop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RiseAndShop.RiseAndShopFactory
 * @model kind="package"
 * @generated
 */
public interface RiseAndShopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RiseAndShop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RiseAndShop.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RiseAndShop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiseAndShopPackage eINSTANCE = RiseAndShop.impl.RiseAndShopPackageImpl.init();

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.MainImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 0;

	/**
	 * The feature id for the '<em><b>Curr Employee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__CURR_EMPLOYEE = 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.StoreImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 2;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.EmployeeImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 3;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.CartImpl <em>Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.CartImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCart()
	 * @generated
	 */
	int CART = 4;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.CartItemImpl <em>Cart Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.CartItemImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCartItem()
	 * @generated
	 */
	int CART_ITEM = 5;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.PaymentImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 6;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.ReviewImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 7;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.NotificationImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 8;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.InventoryImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 9;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.CategoriesImpl <em>Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.CategoriesImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 10;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.ProductImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 11;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.SupplierImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 12;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.EventImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 13;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.SalaryImpl <em>Salary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.SalaryImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getSalary()
	 * @generated
	 */
	int SALARY = 14;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.UtilsImpl <em>Utils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.UtilsImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getUtils()
	 * @generated
	 */
	int UTILS = 15;

	/**
	 * The meta object id for the '{@link RiseAndShop.impl.DatabaseUtilsImpl <em>Database Utils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiseAndShop.impl.DatabaseUtilsImpl
	 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getDatabaseUtils()
	 * @generated
	 */
	int DATABASE_UTILS = 1;

	/**
	 * The number of structural features of the '<em>Database Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___ADD_EMPLOYEE = 0;

	/**
	 * The operation id for the '<em>Update Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___UPDATE_EMPLOYEE = 1;

	/**
	 * The operation id for the '<em>Delete Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___DELETE_EMPLOYEE = 2;

	/**
	 * The operation id for the '<em>Add Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___ADD_PRODUCT = 3;

	/**
	 * The operation id for the '<em>Delete Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___DELETE_PRODUCT = 4;

	/**
	 * The operation id for the '<em>Add Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___ADD_STORE = 5;

	/**
	 * The operation id for the '<em>Update Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___UPDATE_STORE = 6;

	/**
	 * The operation id for the '<em>Delete Store</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS___DELETE_STORE = 7;

	/**
	 * The number of operations of the '<em>Database Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_UTILS_OPERATION_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__EMPLOYEES = 2;

	/**
	 * The feature id for the '<em><b>Full Inventory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__FULL_INVENTORY = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ID = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__USERNAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Carts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CARTS = 5;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NOTIFICATIONS = 6;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Product Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_PRODUCT_LOCATION = 0;

	/**
	 * The operation id for the '<em>Get Stock Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_STOCK_DETAILS = 1;

	/**
	 * The operation id for the '<em>Update Product Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___UPDATE_PRODUCT_QUANTITY = 2;

	/**
	 * The operation id for the '<em>Update Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___UPDATE_CATEGORY = 3;

	/**
	 * The operation id for the '<em>Add New Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ADD_NEW_PRODUCT = 4;

	/**
	 * The operation id for the '<em>Update Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___UPDATE_PRODUCT = 5;

	/**
	 * The operation id for the '<em>Delete Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___DELETE_PRODUCT = 6;

	/**
	 * The operation id for the '<em>Get Sales Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___GET_SALES_DETAILS = 7;

	/**
	 * The operation id for the '<em>Notify Low Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___NOTIFY_LOW_STOCK = 8;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Cart Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CART_ID = 0;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CUSTOMER_ID = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Payment Issued</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__PAYMENT_ISSUED = 3;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__REVIEW = 4;

	/**
	 * The number of structural features of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Cart Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cart Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_ITEM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 3;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Notification Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NOTIFICATION_ID = 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__CATEGORY = 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Supplier Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUPPLIER_INFO = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Contact Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONTACT_INFO = 2;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Cheque Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY__CHEQUE_ID = 0;

	/**
	 * The number of structural features of the '<em>Salary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Salary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILS___CHECK_USERNAME = 0;

	/**
	 * The operation id for the '<em>Is Valid Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILS___IS_VALID_PASSWORD = 1;

	/**
	 * The number of operations of the '<em>Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILS_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link RiseAndShop.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see RiseAndShop.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Main#getCurrEmployee <em>Curr Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curr Employee</em>'.
	 * @see RiseAndShop.Main#getCurrEmployee()
	 * @see #getMain()
	 * @generated
	 */
	EAttribute getMain_CurrEmployee();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see RiseAndShop.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Store#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.Store#getName()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Name();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Store#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see RiseAndShop.Store#getAddress()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Address();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Store#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see RiseAndShop.Store#getEmployees()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Employees();

	/**
	 * Returns the meta object for the reference '{@link RiseAndShop.Store#getFullInventory <em>Full Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Full Inventory</em>'.
	 * @see RiseAndShop.Store#getFullInventory()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_FullInventory();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Store#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see RiseAndShop.Store#getEvents()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Events();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see RiseAndShop.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Employee#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RiseAndShop.Employee#getId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Id();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Employee#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see RiseAndShop.Employee#getUsername()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Username();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Employee#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see RiseAndShop.Employee#getPassword()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Password();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Employee#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see RiseAndShop.Employee#getRole()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Role();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Employee#getCarts <em>Carts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carts</em>'.
	 * @see RiseAndShop.Employee#getCarts()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Carts();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Employee#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notifications</em>'.
	 * @see RiseAndShop.Employee#getNotifications()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_Notifications();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#getProductLocation() <em>Get Product Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Product Location</em>' operation.
	 * @see RiseAndShop.Employee#getProductLocation()
	 * @generated
	 */
	EOperation getEmployee__GetProductLocation();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#getStockDetails() <em>Get Stock Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stock Details</em>' operation.
	 * @see RiseAndShop.Employee#getStockDetails()
	 * @generated
	 */
	EOperation getEmployee__GetStockDetails();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#UpdateProductQuantity() <em>Update Product Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Product Quantity</em>' operation.
	 * @see RiseAndShop.Employee#UpdateProductQuantity()
	 * @generated
	 */
	EOperation getEmployee__UpdateProductQuantity();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#updateCategory() <em>Update Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Category</em>' operation.
	 * @see RiseAndShop.Employee#updateCategory()
	 * @generated
	 */
	EOperation getEmployee__UpdateCategory();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#addNewProduct() <em>Add New Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Product</em>' operation.
	 * @see RiseAndShop.Employee#addNewProduct()
	 * @generated
	 */
	EOperation getEmployee__AddNewProduct();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#UpdateProduct() <em>Update Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Product</em>' operation.
	 * @see RiseAndShop.Employee#UpdateProduct()
	 * @generated
	 */
	EOperation getEmployee__UpdateProduct();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#DeleteProduct() <em>Delete Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Product</em>' operation.
	 * @see RiseAndShop.Employee#DeleteProduct()
	 * @generated
	 */
	EOperation getEmployee__DeleteProduct();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#getSalesDetails() <em>Get Sales Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sales Details</em>' operation.
	 * @see RiseAndShop.Employee#getSalesDetails()
	 * @generated
	 */
	EOperation getEmployee__GetSalesDetails();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Employee#notifyLowStock() <em>Notify Low Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Low Stock</em>' operation.
	 * @see RiseAndShop.Employee#notifyLowStock()
	 * @generated
	 */
	EOperation getEmployee__NotifyLowStock();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Cart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart</em>'.
	 * @see RiseAndShop.Cart
	 * @generated
	 */
	EClass getCart();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Cart#getCartId <em>Cart Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart Id</em>'.
	 * @see RiseAndShop.Cart#getCartId()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_CartId();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Cart#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see RiseAndShop.Cart#getCustomerId()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_CustomerId();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Cart#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see RiseAndShop.Cart#getProducts()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_Products();

	/**
	 * Returns the meta object for the reference '{@link RiseAndShop.Cart#getPaymentIssued <em>Payment Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Issued</em>'.
	 * @see RiseAndShop.Cart#getPaymentIssued()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_PaymentIssued();

	/**
	 * Returns the meta object for the reference '{@link RiseAndShop.Cart#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Review</em>'.
	 * @see RiseAndShop.Cart#getReview()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_Review();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.CartItem <em>Cart Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart Item</em>'.
	 * @see RiseAndShop.CartItem
	 * @generated
	 */
	EClass getCartItem();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.CartItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.CartItem#getName()
	 * @see #getCartItem()
	 * @generated
	 */
	EAttribute getCartItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.CartItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see RiseAndShop.CartItem#getQuantity()
	 * @see #getCartItem()
	 * @generated
	 */
	EAttribute getCartItem_Quantity();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see RiseAndShop.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Payment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RiseAndShop.Payment#getId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Id();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Payment#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see RiseAndShop.Payment#getMethod()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Method();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Payment#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see RiseAndShop.Payment#getDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Date();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see RiseAndShop.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see RiseAndShop.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Review#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see RiseAndShop.Review#getMessage()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Message();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see RiseAndShop.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Notification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see RiseAndShop.Notification#getMessage()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Message();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Notification#getNotificationId <em>Notification Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Id</em>'.
	 * @see RiseAndShop.Notification#getNotificationId()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_NotificationId();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see RiseAndShop.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the reference list '{@link RiseAndShop.Inventory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see RiseAndShop.Inventory#getCategory()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Category();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories</em>'.
	 * @see RiseAndShop.Categories
	 * @generated
	 */
	EClass getCategories();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Categories#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.Categories#getName()
	 * @see #getCategories()
	 * @generated
	 */
	EAttribute getCategories_Name();

	/**
	 * Returns the meta object for the reference '{@link RiseAndShop.Categories#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Products</em>'.
	 * @see RiseAndShop.Categories#getProducts()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Products();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see RiseAndShop.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RiseAndShop.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Product#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see RiseAndShop.Product#getLocation()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Location();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Product#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see RiseAndShop.Product#getQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RiseAndShop.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the reference '{@link RiseAndShop.Product#getSupplierInfo <em>Supplier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Info</em>'.
	 * @see RiseAndShop.Product#getSupplierInfo()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SupplierInfo();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see RiseAndShop.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Supplier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RiseAndShop.Supplier#getId()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Id();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Supplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RiseAndShop.Supplier#getName()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Name();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Supplier#getContactInfo <em>Contact Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Info</em>'.
	 * @see RiseAndShop.Supplier#getContactInfo()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_ContactInfo();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see RiseAndShop.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Event#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see RiseAndShop.Event#getEventName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventName();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see RiseAndShop.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Salary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salary</em>'.
	 * @see RiseAndShop.Salary
	 * @generated
	 */
	EClass getSalary();

	/**
	 * Returns the meta object for the attribute '{@link RiseAndShop.Salary#getChequeId <em>Cheque Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cheque Id</em>'.
	 * @see RiseAndShop.Salary#getChequeId()
	 * @see #getSalary()
	 * @generated
	 */
	EAttribute getSalary_ChequeId();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.Utils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utils</em>'.
	 * @see RiseAndShop.Utils
	 * @generated
	 */
	EClass getUtils();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Utils#checkUsername() <em>Check Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Username</em>' operation.
	 * @see RiseAndShop.Utils#checkUsername()
	 * @generated
	 */
	EOperation getUtils__CheckUsername();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.Utils#isValidPassword() <em>Is Valid Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Password</em>' operation.
	 * @see RiseAndShop.Utils#isValidPassword()
	 * @generated
	 */
	EOperation getUtils__IsValidPassword();

	/**
	 * Returns the meta object for class '{@link RiseAndShop.DatabaseUtils <em>Database Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Utils</em>'.
	 * @see RiseAndShop.DatabaseUtils
	 * @generated
	 */
	EClass getDatabaseUtils();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#addEmployee() <em>Add Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Employee</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#addEmployee()
	 * @generated
	 */
	EOperation getDatabaseUtils__AddEmployee();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#UpdateEmployee() <em>Update Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Employee</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#UpdateEmployee()
	 * @generated
	 */
	EOperation getDatabaseUtils__UpdateEmployee();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#deleteEmployee() <em>Delete Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Employee</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#deleteEmployee()
	 * @generated
	 */
	EOperation getDatabaseUtils__DeleteEmployee();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#addProduct() <em>Add Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Product</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#addProduct()
	 * @generated
	 */
	EOperation getDatabaseUtils__AddProduct();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#deleteProduct() <em>Delete Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Product</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#deleteProduct()
	 * @generated
	 */
	EOperation getDatabaseUtils__DeleteProduct();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#addStore() <em>Add Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Store</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#addStore()
	 * @generated
	 */
	EOperation getDatabaseUtils__AddStore();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#updateStore() <em>Update Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Store</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#updateStore()
	 * @generated
	 */
	EOperation getDatabaseUtils__UpdateStore();

	/**
	 * Returns the meta object for the '{@link RiseAndShop.DatabaseUtils#deleteStore() <em>Delete Store</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Store</em>' operation.
	 * @see RiseAndShop.DatabaseUtils#deleteStore()
	 * @generated
	 */
	EOperation getDatabaseUtils__DeleteStore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RiseAndShopFactory getRiseAndShopFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.MainImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Curr Employee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN__CURR_EMPLOYEE = eINSTANCE.getMain_CurrEmployee();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.StoreImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__NAME = eINSTANCE.getStore_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ADDRESS = eINSTANCE.getStore_Address();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__EMPLOYEES = eINSTANCE.getStore_Employees();

		/**
		 * The meta object literal for the '<em><b>Full Inventory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__FULL_INVENTORY = eINSTANCE.getStore_FullInventory();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__EVENTS = eINSTANCE.getStore_Events();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.EmployeeImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ID = eINSTANCE.getEmployee_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__USERNAME = eINSTANCE.getEmployee_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__PASSWORD = eINSTANCE.getEmployee_Password();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ROLE = eINSTANCE.getEmployee_Role();

		/**
		 * The meta object literal for the '<em><b>Carts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__CARTS = eINSTANCE.getEmployee_Carts();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__NOTIFICATIONS = eINSTANCE.getEmployee_Notifications();

		/**
		 * The meta object literal for the '<em><b>Get Product Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___GET_PRODUCT_LOCATION = eINSTANCE.getEmployee__GetProductLocation();

		/**
		 * The meta object literal for the '<em><b>Get Stock Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___GET_STOCK_DETAILS = eINSTANCE.getEmployee__GetStockDetails();

		/**
		 * The meta object literal for the '<em><b>Update Product Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___UPDATE_PRODUCT_QUANTITY = eINSTANCE.getEmployee__UpdateProductQuantity();

		/**
		 * The meta object literal for the '<em><b>Update Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___UPDATE_CATEGORY = eINSTANCE.getEmployee__UpdateCategory();

		/**
		 * The meta object literal for the '<em><b>Add New Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___ADD_NEW_PRODUCT = eINSTANCE.getEmployee__AddNewProduct();

		/**
		 * The meta object literal for the '<em><b>Update Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___UPDATE_PRODUCT = eINSTANCE.getEmployee__UpdateProduct();

		/**
		 * The meta object literal for the '<em><b>Delete Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___DELETE_PRODUCT = eINSTANCE.getEmployee__DeleteProduct();

		/**
		 * The meta object literal for the '<em><b>Get Sales Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___GET_SALES_DETAILS = eINSTANCE.getEmployee__GetSalesDetails();

		/**
		 * The meta object literal for the '<em><b>Notify Low Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE___NOTIFY_LOW_STOCK = eINSTANCE.getEmployee__NotifyLowStock();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.CartImpl <em>Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.CartImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCart()
		 * @generated
		 */
		EClass CART = eINSTANCE.getCart();

		/**
		 * The meta object literal for the '<em><b>Cart Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__CART_ID = eINSTANCE.getCart_CartId();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__CUSTOMER_ID = eINSTANCE.getCart_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__PRODUCTS = eINSTANCE.getCart_Products();

		/**
		 * The meta object literal for the '<em><b>Payment Issued</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__PAYMENT_ISSUED = eINSTANCE.getCart_PaymentIssued();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__REVIEW = eINSTANCE.getCart_Review();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.CartItemImpl <em>Cart Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.CartItemImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCartItem()
		 * @generated
		 */
		EClass CART_ITEM = eINSTANCE.getCartItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ITEM__NAME = eINSTANCE.getCartItem_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_ITEM__QUANTITY = eINSTANCE.getCartItem_Quantity();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.PaymentImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ID = eINSTANCE.getPayment_Id();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__METHOD = eINSTANCE.getPayment_Method();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__DATE = eINSTANCE.getPayment_Date();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.ReviewImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__MESSAGE = eINSTANCE.getReview_Message();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.NotificationImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Notification Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NOTIFICATION_ID = eINSTANCE.getNotification_NotificationId();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.InventoryImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__CATEGORY = eINSTANCE.getInventory_Category();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.CategoriesImpl <em>Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.CategoriesImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getCategories()
		 * @generated
		 */
		EClass CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIES__NAME = eINSTANCE.getCategories_Name();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__PRODUCTS = eINSTANCE.getCategories_Products();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.ProductImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__LOCATION = eINSTANCE.getProduct_Location();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__QUANTITY = eINSTANCE.getProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Supplier Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SUPPLIER_INFO = eINSTANCE.getProduct_SupplierInfo();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.SupplierImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__ID = eINSTANCE.getSupplier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__NAME = eINSTANCE.getSupplier_Name();

		/**
		 * The meta object literal for the '<em><b>Contact Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__CONTACT_INFO = eINSTANCE.getSupplier_ContactInfo();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.EventImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.SalaryImpl <em>Salary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.SalaryImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getSalary()
		 * @generated
		 */
		EClass SALARY = eINSTANCE.getSalary();

		/**
		 * The meta object literal for the '<em><b>Cheque Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALARY__CHEQUE_ID = eINSTANCE.getSalary_ChequeId();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.UtilsImpl <em>Utils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.UtilsImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getUtils()
		 * @generated
		 */
		EClass UTILS = eINSTANCE.getUtils();

		/**
		 * The meta object literal for the '<em><b>Check Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UTILS___CHECK_USERNAME = eINSTANCE.getUtils__CheckUsername();

		/**
		 * The meta object literal for the '<em><b>Is Valid Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UTILS___IS_VALID_PASSWORD = eINSTANCE.getUtils__IsValidPassword();

		/**
		 * The meta object literal for the '{@link RiseAndShop.impl.DatabaseUtilsImpl <em>Database Utils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiseAndShop.impl.DatabaseUtilsImpl
		 * @see RiseAndShop.impl.RiseAndShopPackageImpl#getDatabaseUtils()
		 * @generated
		 */
		EClass DATABASE_UTILS = eINSTANCE.getDatabaseUtils();

		/**
		 * The meta object literal for the '<em><b>Add Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___ADD_EMPLOYEE = eINSTANCE.getDatabaseUtils__AddEmployee();

		/**
		 * The meta object literal for the '<em><b>Update Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___UPDATE_EMPLOYEE = eINSTANCE.getDatabaseUtils__UpdateEmployee();

		/**
		 * The meta object literal for the '<em><b>Delete Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___DELETE_EMPLOYEE = eINSTANCE.getDatabaseUtils__DeleteEmployee();

		/**
		 * The meta object literal for the '<em><b>Add Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___ADD_PRODUCT = eINSTANCE.getDatabaseUtils__AddProduct();

		/**
		 * The meta object literal for the '<em><b>Delete Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___DELETE_PRODUCT = eINSTANCE.getDatabaseUtils__DeleteProduct();

		/**
		 * The meta object literal for the '<em><b>Add Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___ADD_STORE = eINSTANCE.getDatabaseUtils__AddStore();

		/**
		 * The meta object literal for the '<em><b>Update Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___UPDATE_STORE = eINSTANCE.getDatabaseUtils__UpdateStore();

		/**
		 * The meta object literal for the '<em><b>Delete Store</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_UTILS___DELETE_STORE = eINSTANCE.getDatabaseUtils__DeleteStore();

	}

} //RiseAndShopPackage
