/**
 */
package semanticadaptation.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;

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

import semanticadaptation.SemanticAdaptation;
import semanticadaptation.SemanticadaptationPackage;
import semanticadaptation.Semantics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Adaptation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.impl.SemanticAdaptationImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link semanticadaptation.impl.SemanticAdaptationImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link semanticadaptation.impl.SemanticAdaptationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link semanticadaptation.impl.SemanticAdaptationImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticAdaptationImpl extends MinimalEObjectImpl.Container implements SemanticAdaptation {
	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected Semantics semantics;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<semanticadaptation.Module> modules;

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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticAdaptationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticadaptationPackage.Literals.SEMANTIC_ADAPTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semantics getSemantics() {
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemantics(Semantics newSemantics, NotificationChain msgs) {
		Semantics oldSemantics = semantics;
		semantics = newSemantics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS, oldSemantics, newSemantics);
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
	public void setSemantics(Semantics newSemantics) {
		if (newSemantics != semantics) {
			NotificationChain msgs = null;
			if (semantics != null)
				msgs = ((InternalEObject) semantics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject) newSemantics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<semanticadaptation.Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentEList<semanticadaptation.Module>(semanticadaptation.Module.class, this,
					SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES);
		}
		return modules;
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
					SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL, oldModel, newModel);
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
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL,
					newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this,
					SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS:
			return basicSetSemantics(null, msgs);
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES:
			return ((InternalEList<?>) getModules()).basicRemove(otherEnd, msgs);
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL:
			return basicSetModel(null, msgs);
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
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
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS:
			return getSemantics();
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES:
			return getModules();
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL:
			return getModel();
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS:
			return getImports();
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
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS:
			setSemantics((Semantics) newValue);
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES:
			getModules().clear();
			getModules().addAll((Collection<? extends semanticadaptation.Module>) newValue);
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL:
			setModel((Model) newValue);
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
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
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS:
			setSemantics((Semantics) null);
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES:
			getModules().clear();
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL:
			setModel((Model) null);
			return;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS:
			getImports().clear();
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
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__SEMANTICS:
			return semantics != null;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODULES:
			return modules != null && !modules.isEmpty();
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__MODEL:
			return model != null;
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION__IMPORTS:
			return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemanticAdaptationImpl
