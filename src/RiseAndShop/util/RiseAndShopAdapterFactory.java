/**
 */
package RiseAndShop.util;

import RiseAndShop.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RiseAndShop.RiseAndShopPackage
 * @generated
 */
public class RiseAndShopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RiseAndShopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiseAndShopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RiseAndShopPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiseAndShopSwitch<Adapter> modelSwitch =
		new RiseAndShopSwitch<Adapter>() {
			@Override
			public Adapter caseMain(Main object) {
				return createMainAdapter();
			}
			@Override
			public Adapter caseDatabaseUtils(DatabaseUtils object) {
				return createDatabaseUtilsAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseInventory(Inventory object) {
				return createInventoryAdapter();
			}
			@Override
			public Adapter caseCategories(Categories object) {
				return createCategoriesAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseSupplier(Supplier object) {
				return createSupplierAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseCart(Cart object) {
				return createCartAdapter();
			}
			@Override
			public Adapter caseCartItem(CartItem object) {
				return createCartItemAdapter();
			}
			@Override
			public Adapter casePayment(Payment object) {
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseReview(Review object) {
				return createReviewAdapter();
			}
			@Override
			public Adapter caseSalary(Salary object) {
				return createSalaryAdapter();
			}
			@Override
			public Adapter caseUtils(Utils object) {
				return createUtilsAdapter();
			}
			@Override
			public Adapter caseSuperviser(Superviser object) {
				return createSuperviserAdapter();
			}
			@Override
			public Adapter caseTeamLeader(TeamLeader object) {
				return createTeamLeaderAdapter();
			}
			@Override
			public Adapter caseCashier(Cashier object) {
				return createCashierAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Main
	 * @generated
	 */
	public Adapter createMainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Cart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Cart
	 * @generated
	 */
	public Adapter createCartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.CartItem <em>Cart Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.CartItem
	 * @generated
	 */
	public Adapter createCartItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Review
	 * @generated
	 */
	public Adapter createReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Inventory
	 * @generated
	 */
	public Adapter createInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Categories
	 * @generated
	 */
	public Adapter createCategoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Supplier
	 * @generated
	 */
	public Adapter createSupplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Salary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Salary
	 * @generated
	 */
	public Adapter createSalaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Utils <em>Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Utils
	 * @generated
	 */
	public Adapter createUtilsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Superviser <em>Superviser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Superviser
	 * @generated
	 */
	public Adapter createSuperviserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.TeamLeader <em>Team Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.TeamLeader
	 * @generated
	 */
	public Adapter createTeamLeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Cashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Cashier
	 * @generated
	 */
	public Adapter createCashierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiseAndShop.DatabaseUtils <em>Database Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiseAndShop.DatabaseUtils
	 * @generated
	 */
	public Adapter createDatabaseUtilsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RiseAndShopAdapterFactory
