/**
 */
package RiseAndShop.impl;

import RiseAndShop.Categories;
import RiseAndShop.Product;
import RiseAndShop.RiseAndShopPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.CategoriesImpl#getName <em>Name</em>}</li>
 *   <li>{@link RiseAndShop.impl.CategoriesImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriesImpl extends MinimalEObjectImpl.Container implements Categories {
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
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Product products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.CATEGORIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CATEGORIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProducts() {
		if (products != null && products.eIsProxy()) {
			InternalEObject oldProducts = (InternalEObject)products;
			products = (Product)eResolveProxy(oldProducts);
			if (products != oldProducts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiseAndShopPackage.CATEGORIES__PRODUCTS, oldProducts, products));
			}
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducts(Product newProducts) {
		Product oldProducts = products;
		products = newProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CATEGORIES__PRODUCTS, oldProducts, products));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.CATEGORIES__NAME:
				return getName();
			case RiseAndShopPackage.CATEGORIES__PRODUCTS:
				if (resolve) return getProducts();
				return basicGetProducts();
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
			case RiseAndShopPackage.CATEGORIES__NAME:
				setName((String)newValue);
				return;
			case RiseAndShopPackage.CATEGORIES__PRODUCTS:
				setProducts((Product)newValue);
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
			case RiseAndShopPackage.CATEGORIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RiseAndShopPackage.CATEGORIES__PRODUCTS:
				setProducts((Product)null);
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
			case RiseAndShopPackage.CATEGORIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RiseAndShopPackage.CATEGORIES__PRODUCTS:
				return products != null;
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
		result.append(')');
		return result.toString();
	}

} //CategoriesImpl
