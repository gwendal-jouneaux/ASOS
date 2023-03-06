/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptive Semantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptiveSemanticsImpl extends MinimalEObjectImpl.Container implements AdaptiveSemantics {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptiveSemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.ADAPTIVE_SEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this,
					AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this,
					AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL, oldModel, newModel);
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
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL,
					newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL:
			return basicSetModel(null, msgs);
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
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS:
			return getImports();
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES:
			return getRules();
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL:
			return getModel();
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
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL:
			setModel((Model) newValue);
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
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS:
			getImports().clear();
			return;
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES:
			getRules().clear();
			return;
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL:
			setModel((Model) null);
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
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__IMPORTS:
			return imports != null && !imports.isEmpty();
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__RULES:
			return rules != null && !rules.isEmpty();
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS__MODEL:
			return model != null;
		}
		return super.eIsSet(featureID);
	}

} //AdaptiveSemanticsImpl
