/**
 */
package RiseAndShop.impl;

import RiseAndShop.Cart;
import RiseAndShop.CartItem;
import RiseAndShop.Payment;
import RiseAndShop.Review;
import RiseAndShop.RiseAndShopPackage;

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
 * An implementation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiseAndShop.impl.CartImpl#getCartId <em>Cart Id</em>}</li>
 *   <li>{@link RiseAndShop.impl.CartImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link RiseAndShop.impl.CartImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link RiseAndShop.impl.CartImpl#getPaymentIssued <em>Payment Issued</em>}</li>
 *   <li>{@link RiseAndShop.impl.CartImpl#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartImpl extends MinimalEObjectImpl.Container implements Cart {
	/**
	 * The default value of the '{@link #getCartId() <em>Cart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartId()
	 * @generated
	 * @ordered
	 */
	protected static final int CART_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCartId() <em>Cart Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartId()
	 * @generated
	 * @ordered
	 */
	protected int cartId = CART_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected int customerId = CUSTOMER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<CartItem> products;

	/**
	 * The cached value of the '{@link #getPaymentIssued() <em>Payment Issued</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentIssued()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentIssued;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected Review review;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartImpl() {
		
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiseAndShopPackage.Literals.CART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCartId() {
		return cartId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartId(int newCartId) {
		int oldCartId = cartId;
		cartId = newCartId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CART__CART_ID, oldCartId, cartId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerId(int newCustomerId) {
		int oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CART__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CartItem> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<CartItem>(CartItem.class, this, RiseAndShopPackage.CART__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPaymentIssued() {
		if (paymentIssued != null && paymentIssued.eIsProxy()) {
			InternalEObject oldPaymentIssued = (InternalEObject)paymentIssued;
			paymentIssued = (Payment)eResolveProxy(oldPaymentIssued);
			if (paymentIssued != oldPaymentIssued) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiseAndShopPackage.CART__PAYMENT_ISSUED, oldPaymentIssued, paymentIssued));
			}
		}
		return paymentIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPaymentIssued() {
		return paymentIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentIssued(Payment newPaymentIssued) {
		Payment oldPaymentIssued = paymentIssued;
		paymentIssued = newPaymentIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CART__PAYMENT_ISSUED, oldPaymentIssued, paymentIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Review getReview() {
		if (review != null && review.eIsProxy()) {
			InternalEObject oldReview = (InternalEObject)review;
			review = (Review)eResolveProxy(oldReview);
			if (review != oldReview) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiseAndShopPackage.CART__REVIEW, oldReview, review));
			}
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Review basicGetReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReview(Review newReview) {
		Review oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiseAndShopPackage.CART__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RiseAndShopPackage.CART__CART_ID:
				return getCartId();
			case RiseAndShopPackage.CART__CUSTOMER_ID:
				return getCustomerId();
			case RiseAndShopPackage.CART__PRODUCTS:
				return getProducts();
			case RiseAndShopPackage.CART__PAYMENT_ISSUED:
				if (resolve) return getPaymentIssued();
				return basicGetPaymentIssued();
			case RiseAndShopPackage.CART__REVIEW:
				if (resolve) return getReview();
				return basicGetReview();
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
			case RiseAndShopPackage.CART__CART_ID:
				setCartId((Integer)newValue);
				return;
			case RiseAndShopPackage.CART__CUSTOMER_ID:
				setCustomerId((Integer)newValue);
				return;
			case RiseAndShopPackage.CART__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends CartItem>)newValue);
				return;
			case RiseAndShopPackage.CART__PAYMENT_ISSUED:
				setPaymentIssued((Payment)newValue);
				return;
			case RiseAndShopPackage.CART__REVIEW:
				setReview((Review)newValue);
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
			case RiseAndShopPackage.CART__CART_ID:
				setCartId(CART_ID_EDEFAULT);
				return;
			case RiseAndShopPackage.CART__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case RiseAndShopPackage.CART__PRODUCTS:
				getProducts().clear();
				return;
			case RiseAndShopPackage.CART__PAYMENT_ISSUED:
				setPaymentIssued((Payment)null);
				return;
			case RiseAndShopPackage.CART__REVIEW:
				setReview((Review)null);
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
			case RiseAndShopPackage.CART__CART_ID:
				return cartId != CART_ID_EDEFAULT;
			case RiseAndShopPackage.CART__CUSTOMER_ID:
				return customerId != CUSTOMER_ID_EDEFAULT;
			case RiseAndShopPackage.CART__PRODUCTS:
				return products != null && !products.isEmpty();
			case RiseAndShopPackage.CART__PAYMENT_ISSUED:
				return paymentIssued != null;
			case RiseAndShopPackage.CART__REVIEW:
				return review != null;
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
		result.append(" (cartId: ");
		result.append(cartId);
		result.append(", customerId: ");
		result.append(customerId);
		result.append(')');
		return result.toString();
	}

} //CartImpl
