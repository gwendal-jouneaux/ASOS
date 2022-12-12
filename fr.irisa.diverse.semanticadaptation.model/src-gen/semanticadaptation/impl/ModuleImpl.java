/**
 */
package semanticadaptation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import semanticadaptation.Adaptation;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticadaptationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.impl.ModuleImpl#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link semanticadaptation.impl.ModuleImpl#getAdaptations <em>Adaptations</em>}</li>
 *   <li>{@link semanticadaptation.impl.ModuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements semanticadaptation.Module {
	/**
	 * The cached value of the '{@link #getPointcuts() <em>Pointcuts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointcuts()
	 * @generated
	 * @ordered
	 */
	protected EList<Pointcut> pointcuts;

	/**
	 * The cached value of the '{@link #getAdaptations() <em>Adaptations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptations()
	 * @generated
	 * @ordered
	 */
	protected EList<Adaptation> adaptations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticadaptationPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pointcut> getPointcuts() {
		if (pointcuts == null) {
			pointcuts = new EObjectContainmentEList<Pointcut>(Pointcut.class, this,
					SemanticadaptationPackage.MODULE__POINTCUTS);
		}
		return pointcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Adaptation> getAdaptations() {
		if (adaptations == null) {
			adaptations = new EObjectContainmentEList<Adaptation>(Adaptation.class, this,
					SemanticadaptationPackage.MODULE__ADAPTATIONS);
		}
		return adaptations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticadaptationPackage.MODULE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SemanticadaptationPackage.MODULE__POINTCUTS:
			return ((InternalEList<?>) getPointcuts()).basicRemove(otherEnd, msgs);
		case SemanticadaptationPackage.MODULE__ADAPTATIONS:
			return ((InternalEList<?>) getAdaptations()).basicRemove(otherEnd, msgs);
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
		case SemanticadaptationPackage.MODULE__POINTCUTS:
			return getPointcuts();
		case SemanticadaptationPackage.MODULE__ADAPTATIONS:
			return getAdaptations();
		case SemanticadaptationPackage.MODULE__NAME:
			return getName();
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
		case SemanticadaptationPackage.MODULE__POINTCUTS:
			getPointcuts().clear();
			getPointcuts().addAll((Collection<? extends Pointcut>) newValue);
			return;
		case SemanticadaptationPackage.MODULE__ADAPTATIONS:
			getAdaptations().clear();
			getAdaptations().addAll((Collection<? extends Adaptation>) newValue);
			return;
		case SemanticadaptationPackage.MODULE__NAME:
			setName((String) newValue);
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
		case SemanticadaptationPackage.MODULE__POINTCUTS:
			getPointcuts().clear();
			return;
		case SemanticadaptationPackage.MODULE__ADAPTATIONS:
			getAdaptations().clear();
			return;
		case SemanticadaptationPackage.MODULE__NAME:
			setName(NAME_EDEFAULT);
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
		case SemanticadaptationPackage.MODULE__POINTCUTS:
			return pointcuts != null && !pointcuts.isEmpty();
		case SemanticadaptationPackage.MODULE__ADAPTATIONS:
			return adaptations != null && !adaptations.isEmpty();
		case SemanticadaptationPackage.MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
