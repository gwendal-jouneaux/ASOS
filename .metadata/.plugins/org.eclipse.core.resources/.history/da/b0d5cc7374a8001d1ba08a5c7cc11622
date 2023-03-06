/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl#getAssignee <em>Assignee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation operation;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected Assignee assignee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (EOperation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptivesemanticsPackage.INPUT__OPERATION,
							oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(EOperation newOperation) {
		EOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.INPUT__OPERATION,
					oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignee getAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignee(Assignee newAssignee, NotificationChain msgs) {
		Assignee oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.INPUT__ASSIGNEE, oldAssignee, newAssignee);
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
	public void setAssignee(Assignee newAssignee) {
		if (newAssignee != assignee) {
			NotificationChain msgs = null;
			if (assignee != null)
				msgs = ((InternalEObject) assignee).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.INPUT__ASSIGNEE, null, msgs);
			if (newAssignee != null)
				msgs = ((InternalEObject) newAssignee).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.INPUT__ASSIGNEE, null, msgs);
			msgs = basicSetAssignee(newAssignee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.INPUT__ASSIGNEE, newAssignee,
					newAssignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptivesemanticsPackage.INPUT__ASSIGNEE:
			return basicSetAssignee(null, msgs);
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
		case AdaptivesemanticsPackage.INPUT__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case AdaptivesemanticsPackage.INPUT__ASSIGNEE:
			return getAssignee();
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
		case AdaptivesemanticsPackage.INPUT__OPERATION:
			setOperation((EOperation) newValue);
			return;
		case AdaptivesemanticsPackage.INPUT__ASSIGNEE:
			setAssignee((Assignee) newValue);
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
		case AdaptivesemanticsPackage.INPUT__OPERATION:
			setOperation((EOperation) null);
			return;
		case AdaptivesemanticsPackage.INPUT__ASSIGNEE:
			setAssignee((Assignee) null);
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
		case AdaptivesemanticsPackage.INPUT__OPERATION:
			return operation != null;
		case AdaptivesemanticsPackage.INPUT__ASSIGNEE:
			return assignee != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
