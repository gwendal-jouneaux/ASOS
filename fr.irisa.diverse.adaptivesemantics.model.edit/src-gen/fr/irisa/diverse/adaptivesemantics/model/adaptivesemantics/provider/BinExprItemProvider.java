/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.provider;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsFactory;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BinExpr;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BinExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinExprItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinExprItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS);
			childrenFeatures.add(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinExpr_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BinExpr.class)) {
		case AdaptivesemanticsPackage.BIN_EXPR__RHS:
		case AdaptivesemanticsPackage.BIN_EXPR__LHS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createSymbolRef()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createSemanticDomainAccess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createSelf()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createLessEq()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createMult()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createIntConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createBoolConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createDoubleConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createOpposite()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS,
				AdaptivesemanticsFactory.eINSTANCE.createIs()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createSymbolRef()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createSemanticDomainAccess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createSelf()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createLessEq()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createMult()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createIntConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createBoolConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createDoubleConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createOpposite()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS,
				AdaptivesemanticsFactory.eINSTANCE.createIs()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == AdaptivesemanticsPackage.Literals.BIN_EXPR__RHS
				|| childFeature == AdaptivesemanticsPackage.Literals.BIN_EXPR__LHS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AdaptivesemanticsEditPlugin.INSTANCE;
	}

}
