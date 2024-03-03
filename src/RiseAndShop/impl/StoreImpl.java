/**
 */
package RiseAndShop.impl;

import RiseAndShop.Employee;
import RiseAndShop.Event;
import RiseAndShop.Inventory;
import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.Store;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.StoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.impl.StoreImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link RiseAndShop.impl.StoreImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link RiseAndShop.impl.StoreImpl#getFullInventory <em>Full Inventory</em>}</li>
 *   <li>{@link RiseAndShop.impl.StoreImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreImpl extends MinimalEObjectImpl.Container implements Store {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getFullInventory() <em>Full Inventory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullInventory()
	 * @generated
	 * @ordered
	 */
	protected Inventory fullInventory;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.STORE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.STORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.STORE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectResolvingEList<Employee>(Employee.class, this, RiseAndShopPackage.STORE__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory getFullInventory() {
		if (fullInventory != null && fullInventory.eIsProxy()) {
			InternalEObject oldFullInventory = (InternalEObject)fullInventory;
			fullInventory = (Inventory)eResolveProxy(oldFullInventory);
			if (fullInventory != oldFullInventory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiseAndShopPackage.STORE__FULL_INVENTORY, oldFullInventory, fullInventory));
			}
		}
		return fullInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inventory basicGetFullInventory() {
		return fullInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullInventory(Inventory newFullInventory) {
		Inventory oldFullInventory = fullInventory;
		fullInventory = newFullInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.STORE__FULL_INVENTORY, oldFullInventory, fullInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, RiseAndShopPackage.STORE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.STORE__NAME:
				return getName();
			case RiseAndShopPackage.STORE__ADDRESS:
				return getAddress();
			case RiseAndShopPackage.STORE__EMPLOYEES:
				return getEmployees();
			case RiseAndShopPackage.STORE__FULL_INVENTORY:
				if (resolve) return getFullInventory();
				return basicGetFullInventory();
			case RiseAndShopPackage.STORE__EVENTS:
				return getEvents();
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
			case RiseAndShopPackage.STORE__NAME:
				setName((String)newValue);
				return;
			case RiseAndShopPackage.STORE__ADDRESS:
				setAddress((String)newValue);
				return;
			case RiseAndShopPackage.STORE__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case RiseAndShopPackage.STORE__FULL_INVENTORY:
				setFullInventory((Inventory)newValue);
				return;
			case RiseAndShopPackage.STORE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
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
			case RiseAndShopPackage.STORE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiseAndShopPackage.STORE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case RiseAndShopPackage.STORE__EMPLOYEES:
				getEmployees().clear();
				return;
			case RiseAndShopPackage.STORE__FULL_INVENTORY:
				setFullInventory((Inventory)null);
				return;
			case RiseAndShopPackage.STORE__EVENTS:
				getEvents().clear();
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
			case RiseAndShopPackage.STORE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RiseAndShopPackage.STORE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case RiseAndShopPackage.STORE__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case RiseAndShopPackage.STORE__FULL_INVENTORY:
				return fullInventory != null;
			case RiseAndShopPackage.STORE__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
