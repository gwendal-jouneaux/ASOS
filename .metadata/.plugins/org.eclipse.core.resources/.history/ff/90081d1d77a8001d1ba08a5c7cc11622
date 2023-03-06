/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Domain Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl#getField <em>Field</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl#getReciever <em>Reciever</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticDomainAccessImpl extends MinimalEObjectImpl.Container implements SemanticDomainAccess {
	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected String field = FIELD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReciever() <em>Reciever</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReciever()
	 * @generated
	 * @ordered
	 */
	protected DomainAccessExpression reciever;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticDomainAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.SEMANTIC_DOMAIN_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(String newField) {
		String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAccessExpression getReciever() {
		return reciever;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReciever(DomainAccessExpression newReciever, NotificationChain msgs) {
		DomainAccessExpression oldReciever = reciever;
		reciever = newReciever;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER, oldReciever, newReciever);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReciever(DomainAccessExpression newReciever) {
		if (newReciever != reciever) {
			NotificationChain msgs = null;
			if (reciever != null)
				msgs = ((InternalEObject) reciever).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER, null, msgs);
			if (newReciever != null)
				msgs = ((InternalEObject) newReciever).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER, null, msgs);
			msgs = basicSetReciever(newReciever, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER, newReciever, newReciever));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER:
			return basicSetReciever(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__FIELD:
			return getField();
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER:
			return getReciever();
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
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__FIELD:
			setField((String) newValue);
			return;
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER:
			setReciever((DomainAccessExpression) newValue);
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
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__FIELD:
			setField(FIELD_EDEFAULT);
			return;
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER:
			setReciever((DomainAccessExpression) null);
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
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__FIELD:
			return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS__RECIEVER:
			return reciever != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (field: ");
		result.append(field);
		result.append(')');
		return result.toString();
	}

} //SemanticDomainAccessImpl
