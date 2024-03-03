/**
 */
package RiseAndShop.impl;

import RiseAndShop.Cart;
import RiseAndShop.CartItem;
import RiseAndShop.Categories;
import RiseAndShop.DatabaseUtils;
import RiseAndShop.Employee;
import RiseAndShop.Event;
import RiseAndShop.Inventory;
import RiseAndShop.Main;
import RiseAndShop.Notification;
import RiseAndShop.Payment;
import RiseAndShop.Product;
import RiseAndShop.Review;
import RiseAndShop.RiseAndShopFactory;
import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.Salary;
import RiseAndShop.Store;

import RiseAndShop.Supplier;
import RiseAndShop.Utils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiseAndShopPackageImpl extends EPackageImpl implements RiseAndShopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseUtilsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RiseAndShop.RiseAndShopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RiseAndShopPackageImpl() {
		super(eNS_URI, RiseAndShopFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RiseAndShopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RiseAndShopPackage init() {
		if (isInited) return (RiseAndShopPackage)EPackage.Registry.INSTANCE.getEPackage(RiseAndShopPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRiseAndShopPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RiseAndShopPackageImpl theRiseAndShopPackage = registeredRiseAndShopPackage instanceof RiseAndShopPackageImpl ? (RiseAndShopPackageImpl)registeredRiseAndShopPackage : new RiseAndShopPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRiseAndShopPackage.createPackageContents();

		// Initialize created meta-data
		theRiseAndShopPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRiseAndShopPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RiseAndShopPackage.eNS_URI, theRiseAndShopPackage);
		return theRiseAndShopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMain_CurrEmployee() {
		return (EAttribute)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_Name() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStore_Address() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStore_Employees() {
		return (EReference)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStore_FullInventory() {
		return (EReference)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStore_Events() {
		return (EReference)storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Name() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Id() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Username() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Password() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmployee_Role() {
		return (EAttribute)employeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmployee_Carts() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmployee_Notifications() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__GetProductLocation() {
		return employeeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__GetStockDetails() {
		return employeeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__UpdateProductQuantity() {
		return employeeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__UpdateCategory() {
		return employeeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__AddNewProduct() {
		return employeeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__UpdateProduct() {
		return employeeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__DeleteProduct() {
		return employeeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__GetSalesDetails() {
		return employeeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEmployee__NotifyLowStock() {
		return employeeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCart() {
		return cartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_CartId() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_CustomerId() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCart_Products() {
		return (EReference)cartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCart_PaymentIssued() {
		return (EReference)cartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCart_Review() {
		return (EReference)cartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCartItem() {
		return cartItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCartItem_Name() {
		return (EAttribute)cartItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCartItem_Quantity() {
		return (EAttribute)cartItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Id() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Method() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Date() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Amount() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_Message() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Message() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_NotificationId() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Category() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategories() {
		return categoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategories_Name() {
		return (EAttribute)categoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategories_Products() {
		return (EReference)categoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Id() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Location() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Quantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Price() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_SupplierInfo() {
		return (EReference)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_Id() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_Name() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_ContactInfo() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_EventName() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Date() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalary() {
		return salaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalary_ChequeId() {
		return (EAttribute)salaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUtils() {
		return utilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUtils__CheckUsername() {
		return utilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUtils__IsValidPassword() {
		return utilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseUtils() {
		return databaseUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__AddEmployee() {
		return databaseUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__UpdateEmployee() {
		return databaseUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__DeleteEmployee() {
		return databaseUtilsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__AddProduct() {
		return databaseUtilsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__DeleteProduct() {
		return databaseUtilsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__AddStore() {
		return databaseUtilsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__UpdateStore() {
		return databaseUtilsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabaseUtils__DeleteStore() {
		return databaseUtilsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiseAndShopFactory getRiseAndShopFactory() {
		return (RiseAndShopFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mainEClass = createEClass(MAIN);
		createEAttribute(mainEClass, MAIN__CURR_EMPLOYEE);

		databaseUtilsEClass = createEClass(DATABASE_UTILS);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___ADD_EMPLOYEE);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___UPDATE_EMPLOYEE);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___DELETE_EMPLOYEE);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___ADD_PRODUCT);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___DELETE_PRODUCT);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___ADD_STORE);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___UPDATE_STORE);
		createEOperation(databaseUtilsEClass, DATABASE_UTILS___DELETE_STORE);

		storeEClass = createEClass(STORE);
		createEAttribute(storeEClass, STORE__NAME);
		createEAttribute(storeEClass, STORE__ADDRESS);
		createEReference(storeEClass, STORE__EMPLOYEES);
		createEReference(storeEClass, STORE__FULL_INVENTORY);
		createEReference(storeEClass, STORE__EVENTS);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__NAME);
		createEAttribute(employeeEClass, EMPLOYEE__ID);
		createEAttribute(employeeEClass, EMPLOYEE__USERNAME);
		createEAttribute(employeeEClass, EMPLOYEE__PASSWORD);
		createEAttribute(employeeEClass, EMPLOYEE__ROLE);
		createEReference(employeeEClass, EMPLOYEE__CARTS);
		createEReference(employeeEClass, EMPLOYEE__NOTIFICATIONS);
		createEOperation(employeeEClass, EMPLOYEE___GET_PRODUCT_LOCATION);
		createEOperation(employeeEClass, EMPLOYEE___GET_STOCK_DETAILS);
		createEOperation(employeeEClass, EMPLOYEE___UPDATE_PRODUCT_QUANTITY);
		createEOperation(employeeEClass, EMPLOYEE___UPDATE_CATEGORY);
		createEOperation(employeeEClass, EMPLOYEE___ADD_NEW_PRODUCT);
		createEOperation(employeeEClass, EMPLOYEE___UPDATE_PRODUCT);
		createEOperation(employeeEClass, EMPLOYEE___DELETE_PRODUCT);
		createEOperation(employeeEClass, EMPLOYEE___GET_SALES_DETAILS);
		createEOperation(employeeEClass, EMPLOYEE___NOTIFY_LOW_STOCK);

		cartEClass = createEClass(CART);
		createEAttribute(cartEClass, CART__CART_ID);
		createEAttribute(cartEClass, CART__CUSTOMER_ID);
		createEReference(cartEClass, CART__PRODUCTS);
		createEReference(cartEClass, CART__PAYMENT_ISSUED);
		createEReference(cartEClass, CART__REVIEW);

		cartItemEClass = createEClass(CART_ITEM);
		createEAttribute(cartItemEClass, CART_ITEM__NAME);
		createEAttribute(cartItemEClass, CART_ITEM__QUANTITY);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__ID);
		createEAttribute(paymentEClass, PAYMENT__METHOD);
		createEAttribute(paymentEClass, PAYMENT__DATE);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__MESSAGE);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
		createEAttribute(notificationEClass, NOTIFICATION__NOTIFICATION_ID);

		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__CATEGORY);

		categoriesEClass = createEClass(CATEGORIES);
		createEAttribute(categoriesEClass, CATEGORIES__NAME);
		createEReference(categoriesEClass, CATEGORIES__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__ID);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__LOCATION);
		createEAttribute(productEClass, PRODUCT__QUANTITY);
		createEAttribute(productEClass, PRODUCT__PRICE);
		createEReference(productEClass, PRODUCT__SUPPLIER_INFO);

		supplierEClass = createEClass(SUPPLIER);
		createEAttribute(supplierEClass, SUPPLIER__ID);
		createEAttribute(supplierEClass, SUPPLIER__NAME);
		createEAttribute(supplierEClass, SUPPLIER__CONTACT_INFO);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__EVENT_NAME);
		createEAttribute(eventEClass, EVENT__DATE);

		salaryEClass = createEClass(SALARY);
		createEAttribute(salaryEClass, SALARY__CHEQUE_ID);

		utilsEClass = createEClass(UTILS);
		createEOperation(utilsEClass, UTILS___CHECK_USERNAME);
		createEOperation(utilsEClass, UTILS___IS_VALID_PASSWORD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_CurrEmployee(), theTypesPackage.getString(), "currEmployee", null, 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(databaseUtilsEClass, DatabaseUtils.class, "DatabaseUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDatabaseUtils__AddEmployee(), null, "addEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__UpdateEmployee(), null, "UpdateEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__DeleteEmployee(), null, "deleteEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__AddProduct(), null, "addProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__DeleteProduct(), null, "deleteProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__AddStore(), null, "addStore", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__UpdateStore(), null, "updateStore", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDatabaseUtils__DeleteStore(), null, "deleteStore", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStore_Name(), theTypesPackage.getString(), "name", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStore_Address(), theTypesPackage.getString(), "address", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Employees(), this.getEmployee(), null, "employees", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_FullInventory(), this.getInventory(), null, "fullInventory", null, 1, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStore_Events(), this.getEvent(), null, "events", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_Name(), theTypesPackage.getString(), "name", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Username(), theTypesPackage.getString(), "username", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Password(), theTypesPackage.getString(), "password", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployee_Role(), theTypesPackage.getString(), "role", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Carts(), this.getCart(), null, "carts", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Notifications(), this.getNotification(), null, "notifications", null, 0, -1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmployee__GetProductLocation(), null, "getProductLocation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__GetStockDetails(), null, "getStockDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__UpdateProductQuantity(), null, "UpdateProductQuantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__UpdateCategory(), null, "updateCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__AddNewProduct(), null, "addNewProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__UpdateProduct(), null, "UpdateProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__DeleteProduct(), null, "DeleteProduct", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__GetSalesDetails(), null, "getSalesDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEmployee__NotifyLowStock(), null, "notifyLowStock", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(cartEClass, Cart.class, "Cart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCart_CartId(), theTypesPackage.getInteger(), "cartId", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCart_CustomerId(), theTypesPackage.getInteger(), "customerId", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCart_Products(), this.getCartItem(), null, "products", null, 0, -1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCart_PaymentIssued(), this.getPayment(), null, "paymentIssued", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCart_Review(), this.getReview(), null, "review", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cartItemEClass, CartItem.class, "CartItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartItem_Name(), theTypesPackage.getString(), "name", null, 1, 1, CartItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCartItem_Quantity(), theTypesPackage.getInteger(), "quantity", null, 1, 1, CartItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPayment_Method(), theTypesPackage.getString(), "method", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPayment_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPayment_Amount(), theTypesPackage.getInteger(), "amount", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_Message(), theTypesPackage.getString(), "message", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Message(), theTypesPackage.getString(), "message", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNotification_NotificationId(), theTypesPackage.getInteger(), "notificationId", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_Category(), this.getCategories(), null, "category", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(categoriesEClass, Categories.class, "Categories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategories_Name(), theTypesPackage.getString(), "name", null, 1, 1, Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCategories_Products(), this.getProduct(), null, "products", null, 1, 1, Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_Name(), theTypesPackage.getString(), "name", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_Location(), theTypesPackage.getString(), "location", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_Quantity(), theTypesPackage.getInteger(), "quantity", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProduct_SupplierInfo(), this.getSupplier(), null, "supplierInfo", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplier_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSupplier_Name(), theTypesPackage.getString(), "name", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSupplier_ContactInfo(), theTypesPackage.getString(), "contactInfo", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_EventName(), theTypesPackage.getString(), "eventName", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEvent_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(salaryEClass, Salary.class, "Salary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalary_ChequeId(), theTypesPackage.getReal(), "chequeId", null, 1, 1, Salary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(utilsEClass, Utils.class, "Utils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getUtils__CheckUsername(), null, "checkUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUtils__IsValidPassword(), null, "isValidPassword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RiseAndShopPackageImpl
