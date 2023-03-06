/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise;
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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getPremises <em>Premises</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected Conclusion conclusion;

	/**
	 * The cached value of the '{@link #getPremises() <em>Premises</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremises()
	 * @generated
	 * @ordered
	 */
	protected EList<Premise> premises;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

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
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConclusion(Conclusion newConclusion, NotificationChain msgs) {
		Conclusion oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AdaptivesemanticsPackage.RULE__CONCLUSION, oldConclusion, newConclusion);
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
	public void setConclusion(Conclusion newConclusion) {
		if (newConclusion != conclusion) {
			NotificationChain msgs = null;
			if (conclusion != null)
				msgs = ((InternalEObject) conclusion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.RULE__CONCLUSION, null, msgs);
			if (newConclusion != null)
				msgs = ((InternalEObject) newConclusion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AdaptivesemanticsPackage.RULE__CONCLUSION, null, msgs);
			msgs = basicSetConclusion(newConclusion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.RULE__CONCLUSION,
					newConclusion, newConclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Premise> getPremises() {
		if (premises == null) {
			premises = new EObjectContainmentEList<Premise>(Premise.class, this,
					AdaptivesemanticsPackage.RULE__PREMISES);
		}
		return premises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					AdaptivesemanticsPackage.RULE__CONDITIONS);
		}
		return conditions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this,
					AdaptivesemanticsPackage.RULE__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, AdaptivesemanticsPackage.RULE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, AdaptivesemanticsPackage.RULE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AdaptivesemanticsPackage.RULE__CONCLUSION:
			return basicSetConclusion(null, msgs);
		case AdaptivesemanticsPackage.RULE__PREMISES:
			return ((InternalEList<?>) getPremises()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.RULE__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.RULE__BINDINGS:
			return ((InternalEList<?>) getBindings()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.RULE__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case AdaptivesemanticsPackage.RULE__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
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
		case AdaptivesemanticsPackage.RULE__CONCLUSION:
			return getConclusion();
		case AdaptivesemanticsPackage.RULE__PREMISES:
			return getPremises();
		case AdaptivesemanticsPackage.RULE__CONDITIONS:
			return getConditions();
		case AdaptivesemanticsPackage.RULE__NAME:
			return getName();
		case AdaptivesemanticsPackage.RULE__BINDINGS:
			return getBindings();
		case AdaptivesemanticsPackage.RULE__OUTPUTS:
			return getOutputs();
		case AdaptivesemanticsPackage.RULE__INPUTS:
			return getInputs();
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
		case AdaptivesemanticsPackage.RULE__CONCLUSION:
			setConclusion((Conclusion) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__PREMISES:
			getPremises().clear();
			getPremises().addAll((Collection<? extends Premise>) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__NAME:
			setName((String) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__BINDINGS:
			getBindings().clear();
			getBindings().addAll((Collection<? extends Binding>) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case AdaptivesemanticsPackage.RULE__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
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
		case AdaptivesemanticsPackage.RULE__CONCLUSION:
			setConclusion((Conclusion) null);
			return;
		case AdaptivesemanticsPackage.RULE__PREMISES:
			getPremises().clear();
			return;
		case AdaptivesemanticsPackage.RULE__CONDITIONS:
			getConditions().clear();
			return;
		case AdaptivesemanticsPackage.RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AdaptivesemanticsPackage.RULE__BINDINGS:
			getBindings().clear();
			return;
		case AdaptivesemanticsPackage.RULE__OUTPUTS:
			getOutputs().clear();
			return;
		case AdaptivesemanticsPackage.RULE__INPUTS:
			getInputs().clear();
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
		case AdaptivesemanticsPackage.RULE__CONCLUSION:
			return conclusion != null;
		case AdaptivesemanticsPackage.RULE__PREMISES:
			return premises != null && !premises.isEmpty();
		case AdaptivesemanticsPackage.RULE__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case AdaptivesemanticsPackage.RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AdaptivesemanticsPackage.RULE__BINDINGS:
			return bindings != null && !bindings.isEmpty();
		case AdaptivesemanticsPackage.RULE__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case AdaptivesemanticsPackage.RULE__INPUTS:
			return inputs != null && !inputs.isEmpty();
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

} //RuleImpl
