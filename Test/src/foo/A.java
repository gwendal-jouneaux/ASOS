/**
 */
package foo;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link foo.A#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see foo.FooPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(BigInteger)
	 * @see foo.FooPackage#getA_Age()
	 * @model
	 * @generated
	 */
	BigInteger getAge();

	/**
	 * Sets the value of the '{@link foo.A#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(BigInteger value);

} // A
