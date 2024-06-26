/**
 */
package semanticadaptation.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import semanticadaptation.Adaptation;
import semanticadaptation.SemanticadaptationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.impl.AdaptationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link semanticadaptation.impl.AdaptationImpl#getAdaptation <em>Adaptation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdaptationImpl extends MinimalEObjectImpl.Container implements Adaptation {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Rule target;

	/**
	 * The cached value of the '{@link #getAdaptation() <em>Adaptation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptation()
	 * @generated
	 * @ordered
	 */
	protected Rule adaptation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticadaptationPackage.Literals.ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Rule) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SemanticadaptationPackage.ADAPTATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Rule newTarget) {
		Rule oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticadaptationPackage.ADAPTATION__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getAdaptation() {
		return adaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptation(Rule newAdaptation, NotificationChain msgs) {
		Rule oldAdaptation = adaptation;
		adaptation = newAdaptation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SemanticadaptationPackage.ADAPTATION__ADAPTATION, oldAdaptation, newAdaptation);
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
	public void setAdaptation(Rule newAdaptation) {
		if (newAdaptation != adaptation) {
			NotificationChain msgs = null;
			if (adaptation != null)
				msgs = ((InternalEObject) adaptation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.ADAPTATION__ADAPTATION, null, msgs);
			if (newAdaptation != null)
				msgs = ((InternalEObject) newAdaptation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.ADAPTATION__ADAPTATION, null, msgs);
			msgs = basicSetAdaptation(newAdaptation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticadaptationPackage.ADAPTATION__ADAPTATION,
					newAdaptation, newAdaptation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SemanticadaptationPackage.ADAPTATION__ADAPTATION:
			return basicSetAdaptation(null, msgs);
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
		case SemanticadaptationPackage.ADAPTATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case SemanticadaptationPackage.ADAPTATION__ADAPTATION:
			return getAdaptation();
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
		case SemanticadaptationPackage.ADAPTATION__TARGET:
			setTarget((Rule) newValue);
			return;
		case SemanticadaptationPackage.ADAPTATION__ADAPTATION:
			setAdaptation((Rule) newValue);
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
		case SemanticadaptationPackage.ADAPTATION__TARGET:
			setTarget((Rule) null);
			return;
		case SemanticadaptationPackage.ADAPTATION__ADAPTATION:
			setAdaptation((Rule) null);
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
		case SemanticadaptationPackage.ADAPTATION__TARGET:
			return target != null;
		case SemanticadaptationPackage.ADAPTATION__ADAPTATION:
			return adaptation != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptationImpl
