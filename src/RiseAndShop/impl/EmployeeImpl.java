/**
 */
package RiseAndShop.impl;

import RiseAndShop.Cart;
import RiseAndShop.Employee;
import RiseAndShop.Notification;
import RiseAndShop.RiseAndShopPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getCarts <em>Carts</em>}</li>
 *   <li>{@link RiseAndShop.impl.EmployeeImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.EMPLOYEE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.EMPLOYEE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, RiseAndShopPackage.EMPLOYEE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cart> getCarts() {
		if (carts == null) {
			carts = new EObjectResolvingEList<Cart>(Cart.class, this, RiseAndShopPackage.EMPLOYEE__CARTS);
		}
		return carts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectResolvingEList<Notification>(Notification.class, this, RiseAndShopPackage.EMPLOYEE__NOTIFICATIONS);
		}
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getProductLocation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStockDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateProductQuantity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateCategory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNewProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DeleteProduct() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getSalesDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyLowStock() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.EMPLOYEE__NAME:
				return getName();
			case RiseAndShopPackage.EMPLOYEE__ID:
				return getId();
			case RiseAndShopPackage.EMPLOYEE__USERNAME:
				return getUsername();
			case RiseAndShopPackage.EMPLOYEE__PASSWORD:
				return getPassword();
			case RiseAndShopPackage.EMPLOYEE__ROLE:
				return getRole();
			case RiseAndShopPackage.EMPLOYEE__CARTS:
				return getCarts();
			case RiseAndShopPackage.EMPLOYEE__NOTIFICATIONS:
				return getNotifications();
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
			case RiseAndShopPackage.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__ID:
				setId((Integer)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__USERNAME:
				setUsername((String)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__PASSWORD:
				setPassword((String)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__ROLE:
				setRole((String)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__CARTS:
				getCarts().clear();
				getCarts().addAll((Collection<? extends Cart>)newValue);
				return;
			case RiseAndShopPackage.EMPLOYEE__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends Notification>)newValue);
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
			case RiseAndShopPackage.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiseAndShopPackage.EMPLOYEE__ID:
				setId(ID_EDEFAULT);
				return;
			case RiseAndShopPackage.EMPLOYEE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case RiseAndShopPackage.EMPLOYEE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case RiseAndShopPackage.EMPLOYEE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case RiseAndShopPackage.EMPLOYEE__CARTS:
				getCarts().clear();
				return;
			case RiseAndShopPackage.EMPLOYEE__NOTIFICATIONS:
				getNotifications().clear();
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
			case RiseAndShopPackage.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RiseAndShopPackage.EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case RiseAndShopPackage.EMPLOYEE__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case RiseAndShopPackage.EMPLOYEE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case RiseAndShopPackage.EMPLOYEE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case RiseAndShopPackage.EMPLOYEE__CARTS:
				return carts != null && !carts.isEmpty();
			case RiseAndShopPackage.EMPLOYEE__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
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
			case RiseAndShopPackage.EMPLOYEE___GET_PRODUCT_LOCATION:
				getProductLocation();
				return null;
			case RiseAndShopPackage.EMPLOYEE___GET_STOCK_DETAILS:
				getStockDetails();
				return null;
			case RiseAndShopPackage.EMPLOYEE___UPDATE_PRODUCT_QUANTITY:
				UpdateProductQuantity();
				return null;
			case RiseAndShopPackage.EMPLOYEE___UPDATE_CATEGORY:
				updateCategory();
				return null;
			case RiseAndShopPackage.EMPLOYEE___ADD_NEW_PRODUCT:
				addNewProduct();
				return null;
			case RiseAndShopPackage.EMPLOYEE___UPDATE_PRODUCT:
				UpdateProduct();
				return null;
			case RiseAndShopPackage.EMPLOYEE___DELETE_PRODUCT:
				DeleteProduct();
				return null;
			case RiseAndShopPackage.EMPLOYEE___GET_SALES_DETAILS:
				getSalesDetails();
				return null;
			case RiseAndShopPackage.EMPLOYEE___NOTIFY_LOW_STOCK:
				notifyLowStock();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
