/**
 */
package RiseAndShop;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Superviser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RiseAndShop.RiseAndShopPackage#getSuperviser()
 * @model
 * @generated
 */
public interface Superviser extends Employee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void UpdateProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addNewProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DeleteProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getStockDetails();

} // Superviser
