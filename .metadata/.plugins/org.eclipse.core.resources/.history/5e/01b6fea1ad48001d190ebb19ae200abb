/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl#getHead <em>Head</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListRefImpl extends MinimalEObjectImpl.Container implements ListRef {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected SymbolRef head;

	/**
	 * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTail()
	 * @generated
	 * @ordered
	 */
	protected SymbolRef tail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.LIST_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRef getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(SymbolRef newHead, NotificationChain msgs) {
		SymbolRef oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.LIST_REF__HEAD, oldHead, newHead);
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
	public void setHead(SymbolRef newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject) head).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.LIST_REF__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject) newHead).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.LIST_REF__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.LIST_REF__HEAD, newHead,
					newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRef getTail() {
		return tail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTail(SymbolRef newTail, NotificationChain msgs) {
		SymbolRef oldTail = tail;
		tail = newTail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.LIST_REF__TAIL, oldTail, newTail);
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
	public void setTail(SymbolRef newTail) {
		if (newTail != tail) {
			NotificationChain msgs = null;
			if (tail != null)
				msgs = ((InternalEObject) tail).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.LIST_REF__TAIL, null, msgs);
			if (newTail != null)
				msgs = ((InternalEObject) newTail).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.LIST_REF__TAIL, null, msgs);
			msgs = basicSetTail(newTail, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.LIST_REF__TAIL, newTail,
					newTail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptivesemanticsPackage.LIST_REF__HEAD:
			return basicSetHead(null, msgs);
		case AdaptivesemanticsPackage.LIST_REF__TAIL:
			return basicSetTail(null, msgs);
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
		case AdaptivesemanticsPackage.LIST_REF__HEAD:
			return getHead();
		case AdaptivesemanticsPackage.LIST_REF__TAIL:
			return getTail();
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
		case AdaptivesemanticsPackage.LIST_REF__HEAD:
			setHead((SymbolRef) newValue);
			return;
		case AdaptivesemanticsPackage.LIST_REF__TAIL:
			setTail((SymbolRef) newValue);
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
		case AdaptivesemanticsPackage.LIST_REF__HEAD:
			setHead((SymbolRef) null);
			return;
		case AdaptivesemanticsPackage.LIST_REF__TAIL:
			setTail((SymbolRef) null);
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
		case AdaptivesemanticsPackage.LIST_REF__HEAD:
			return head != null;
		case AdaptivesemanticsPackage.LIST_REF__TAIL:
			return tail != null;
		}
		return super.eIsSet(featureID);
	}

} //ListRefImpl
