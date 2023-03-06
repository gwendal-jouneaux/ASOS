/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolRefImpl#getDef <em>Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolRefImpl extends MinimalEObjectImpl.Container implements SymbolRef {
	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected SymbolDef def;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptivesemanticsPackage.Literals.SYMBOL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolDef getDef() {
		if (def != null && def.eIsProxy()) {
			InternalEObject oldDef = (InternalEObject) def;
			def = (SymbolDef) eResolveProxy(oldDef);
			if (def != oldDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptivesemanticsPackage.SYMBOL_REF__DEF,
							oldDef, def));
			}
		}
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolDef basicGetDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(SymbolDef newDef) {
		SymbolDef oldDef = def;
		def = newDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptivesemanticsPackage.SYMBOL_REF__DEF, oldDef,
					def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdaptivesemanticsPackage.SYMBOL_REF__DEF:
			if (resolve)
				return getDef();
			return basicGetDef();
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
		case AdaptivesemanticsPackage.SYMBOL_REF__DEF:
			setDef((SymbolDef) newValue);
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
		case AdaptivesemanticsPackage.SYMBOL_REF__DEF:
			setDef((SymbolDef) null);
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
		case AdaptivesemanticsPackage.SYMBOL_REF__DEF:
			return def != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolRefImpl
