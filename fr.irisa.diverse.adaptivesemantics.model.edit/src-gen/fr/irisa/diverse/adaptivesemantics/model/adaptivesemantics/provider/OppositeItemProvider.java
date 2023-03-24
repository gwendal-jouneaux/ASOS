/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.provider;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsFactory;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite;

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
 * This is the item provider adapter for a {@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OppositeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OppositeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR);
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
	 * This returns Opposite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Opposite"));
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
		return getString("_UI_Opposite_type");
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

		switch (notification.getFeatureID(Opposite.class)) {
		case AdaptivesemanticsPackage.OPPOSITE__EXPR:
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

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createSymbolRef()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createSemanticDomainAccess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createSelf()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createNotEqual()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createLess()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createLessEq()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createMult()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createIntConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createBoolConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createStringConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createDoubleConstant()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createOpposite()));

		newChildDescriptors.add(createChildParameter(AdaptivesemanticsPackage.Literals.OPPOSITE__EXPR,
				AdaptivesemanticsFactory.eINSTANCE.createIs()));
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
