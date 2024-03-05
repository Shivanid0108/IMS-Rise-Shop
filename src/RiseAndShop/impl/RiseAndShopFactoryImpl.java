/**
 */
package RiseAndShop.impl;

import RiseAndShop.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RiseAndShopFactoryImpl extends EFactoryImpl implements RiseAndShopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiseAndShopFactory init() {
		try {
			RiseAndShopFactory theRiseAndShopFactory = (RiseAndShopFactory)EPackage.Registry.INSTANCE.getEFactory(RiseAndShopPackage.eNS_URI);
			if (theRiseAndShopFactory != null) {
				return theRiseAndShopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RiseAndShopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiseAndShopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RiseAndShopPackage.MAIN: return createMain();
			case RiseAndShopPackage.DATABASE_UTILS: return createDatabaseUtils();
			case RiseAndShopPackage.STORE: return createStore();
			case RiseAndShopPackage.EMPLOYEE: return createEmployee();
			case RiseAndShopPackage.INVENTORY: return createInventory();
			case RiseAndShopPackage.CATEGORIES: return createCategories();
			case RiseAndShopPackage.PRODUCT: return createProduct();
			case RiseAndShopPackage.SUPPLIER: return createSupplier();
			case RiseAndShopPackage.EVENT: return createEvent();
			case RiseAndShopPackage.NOTIFICATION: return createNotification();
			case RiseAndShopPackage.CART: return createCart();
			case RiseAndShopPackage.CART_ITEM: return createCartItem();
			case RiseAndShopPackage.PAYMENT: return createPayment();
			case RiseAndShopPackage.REVIEW: return createReview();
			case RiseAndShopPackage.SALARY: return createSalary();
			case RiseAndShopPackage.UTILS: return createUtils();
			case RiseAndShopPackage.SUPERVISER: return createSuperviser();
			case RiseAndShopPackage.TEAM_LEADER: return createTeamLeader();
			case RiseAndShopPackage.CASHIER: return createCashier();
			case RiseAndShopPackage.MANAGER: return createManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cart createCart() {
		CartImpl cart = new CartImpl();
		return cart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartItem createCartItem() {
		CartItemImpl cartItem = new CartItemImpl();
		return cartItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Review createReview() {
		ReviewImpl review = new ReviewImpl();
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categories createCategories() {
		CategoriesImpl categories = new CategoriesImpl();
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier createSupplier() {
		SupplierImpl supplier = new SupplierImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Salary createSalary() {
		SalaryImpl salary = new SalaryImpl();
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Utils createUtils() {
		UtilsImpl utils = new UtilsImpl();
		return utils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Superviser createSuperviser() {
		SuperviserImpl superviser = new SuperviserImpl();
		return superviser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeamLeader createTeamLeader() {
		TeamLeaderImpl teamLeader = new TeamLeaderImpl();
		return teamLeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cashier createCashier() {
		CashierImpl cashier = new CashierImpl();
		return cashier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseUtils createDatabaseUtils() {
		DatabaseUtilsImpl databaseUtils = new DatabaseUtilsImpl();
		return databaseUtils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiseAndShopPackage getRiseAndShopPackage() {
		return (RiseAndShopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RiseAndShopPackage getPackage() {
		return RiseAndShopPackage.eINSTANCE;
	}

} //RiseAndShopFactoryImpl
