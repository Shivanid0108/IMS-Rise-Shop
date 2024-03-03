/**
 */
package RiseAndShop.impl;

import RiseAndShop.RiseAndShopPackage;
import RiseAndShop.Supplier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.SupplierImpl#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.impl.SupplierImpl#getContactInfo <em>Contact Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends MinimalEObjectImpl.Container implements Supplier {
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
	 * The default value of the '{@link #getContactInfo() <em>Contact Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactInfo() <em>Contact Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	protected String contactInfo = CONTACT_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.SUPPLIER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.SUPPLIER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactInfo() {
		return contactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactInfo(String newContactInfo) {
		String oldContactInfo = contactInfo;
		contactInfo = newContactInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.SUPPLIER__CONTACT_INFO, oldContactInfo, contactInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.SUPPLIER__ID:
				return getId();
			case RiseAndShopPackage.SUPPLIER__NAME:
				return getName();
			case RiseAndShopPackage.SUPPLIER__CONTACT_INFO:
				return getContactInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RiseAndShopPackage.SUPPLIER__ID:
				setId((Integer)newValue);
				return;
			case RiseAndShopPackage.SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case RiseAndShopPackage.SUPPLIER__CONTACT_INFO:
				setContactInfo((String)newValue);
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
			case RiseAndShopPackage.SUPPLIER__ID:
				setId(ID_EDEFAULT);
				return;
			case RiseAndShopPackage.SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiseAndShopPackage.SUPPLIER__CONTACT_INFO:
				setContactInfo(CONTACT_INFO_EDEFAULT);
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
			case RiseAndShopPackage.SUPPLIER__ID:
				return id != ID_EDEFAULT;
			case RiseAndShopPackage.SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RiseAndShopPackage.SUPPLIER__CONTACT_INFO:
				return CONTACT_INFO_EDEFAULT == null ? contactInfo != null : !CONTACT_INFO_EDEFAULT.equals(contactInfo);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", contactInfo: ");
		result.append(contactInfo);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
