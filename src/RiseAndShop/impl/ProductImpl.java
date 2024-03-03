/**
 */
package RiseAndShop.impl;

import RiseAndShop.Product;
import RiseAndShop.RiseAndShopPackage;

import RiseAndShop.Supplier;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link RiseAndShop.impl.ProductImpl#getSupplierInfo <em>Supplier Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupplierInfo() <em>Supplier Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierInfo()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplierInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier getSupplierInfo() {
		if (supplierInfo != null && supplierInfo.eIsProxy()) {
			InternalEObject oldSupplierInfo = (InternalEObject)supplierInfo;
			supplierInfo = (Supplier)eResolveProxy(oldSupplierInfo);
			if (supplierInfo != oldSupplierInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiseAndShopPackage.PRODUCT__SUPPLIER_INFO, oldSupplierInfo, supplierInfo));
			}
		}
		return supplierInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplierInfo() {
		return supplierInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierInfo(Supplier newSupplierInfo) {
		Supplier oldSupplierInfo = supplierInfo;
		supplierInfo = newSupplierInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.PRODUCT__SUPPLIER_INFO, oldSupplierInfo, supplierInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.PRODUCT__ID:
				return getId();
			case RiseAndShopPackage.PRODUCT__NAME:
				return getName();
			case RiseAndShopPackage.PRODUCT__LOCATION:
				return getLocation();
			case RiseAndShopPackage.PRODUCT__QUANTITY:
				return getQuantity();
			case RiseAndShopPackage.PRODUCT__PRICE:
				return getPrice();
			case RiseAndShopPackage.PRODUCT__SUPPLIER_INFO:
				if (resolve) return getSupplierInfo();
				return basicGetSupplierInfo();
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
			case RiseAndShopPackage.PRODUCT__ID:
				setId((Integer)newValue);
				return;
			case RiseAndShopPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case RiseAndShopPackage.PRODUCT__LOCATION:
				setLocation((String)newValue);
				return;
			case RiseAndShopPackage.PRODUCT__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case RiseAndShopPackage.PRODUCT__PRICE:
				setPrice((Integer)newValue);
				return;
			case RiseAndShopPackage.PRODUCT__SUPPLIER_INFO:
				setSupplierInfo((Supplier)newValue);
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
			case RiseAndShopPackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case RiseAndShopPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiseAndShopPackage.PRODUCT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case RiseAndShopPackage.PRODUCT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case RiseAndShopPackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case RiseAndShopPackage.PRODUCT__SUPPLIER_INFO:
				setSupplierInfo((Supplier)null);
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
			case RiseAndShopPackage.PRODUCT__ID:
				return id != ID_EDEFAULT;
			case RiseAndShopPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RiseAndShopPackage.PRODUCT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case RiseAndShopPackage.PRODUCT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case RiseAndShopPackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case RiseAndShopPackage.PRODUCT__SUPPLIER_INFO:
				return supplierInfo != null;
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
		result.append(", location: ");
		result.append(location);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
