/**
 */
package org.mdse.pts.depot.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mdse.pts.depot.util.DepotAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotItemProviderAdapterFactory extends DepotAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.Depot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepotItemProvider depotItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.Depot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepotAdapter() {
		if (depotItemProvider == null) {
			depotItemProvider = new DepotItemProvider(this);
		}

		return depotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.RegionalTrain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalTrainItemProvider regionalTrainItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.RegionalTrain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionalTrainAdapter() {
		if (regionalTrainItemProvider == null) {
			regionalTrainItemProvider = new RegionalTrainItemProvider(this);
		}

		return regionalTrainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.IntercityTrain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercityTrainItemProvider intercityTrainItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.IntercityTrain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntercityTrainAdapter() {
		if (intercityTrainItemProvider == null) {
			intercityTrainItemProvider = new IntercityTrainItemProvider(this);
		}

		return intercityTrainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.Locomotive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocomotiveItemProvider locomotiveItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.Locomotive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocomotiveAdapter() {
		if (locomotiveItemProvider == null) {
			locomotiveItemProvider = new LocomotiveItemProvider(this);
		}

		return locomotiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.DiningCoach} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiningCoachItemProvider diningCoachItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.DiningCoach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiningCoachAdapter() {
		if (diningCoachItemProvider == null) {
			diningCoachItemProvider = new DiningCoachItemProvider(this);
		}

		return diningCoachItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.FirstClassPassengerCoach} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstClassPassengerCoachItemProvider firstClassPassengerCoachItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.FirstClassPassengerCoach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFirstClassPassengerCoachAdapter() {
		if (firstClassPassengerCoachItemProvider == null) {
			firstClassPassengerCoachItemProvider = new FirstClassPassengerCoachItemProvider(this);
		}

		return firstClassPassengerCoachItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mdse.pts.depot.SecondClassPassengerCoach} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondClassPassengerCoachItemProvider secondClassPassengerCoachItemProvider;

	/**
	 * This creates an adapter for a {@link org.mdse.pts.depot.SecondClassPassengerCoach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecondClassPassengerCoachAdapter() {
		if (secondClassPassengerCoachItemProvider == null) {
			secondClassPassengerCoachItemProvider = new SecondClassPassengerCoachItemProvider(this);
		}

		return secondClassPassengerCoachItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (depotItemProvider != null) depotItemProvider.dispose();
		if (regionalTrainItemProvider != null) regionalTrainItemProvider.dispose();
		if (intercityTrainItemProvider != null) intercityTrainItemProvider.dispose();
		if (locomotiveItemProvider != null) locomotiveItemProvider.dispose();
		if (diningCoachItemProvider != null) diningCoachItemProvider.dispose();
		if (firstClassPassengerCoachItemProvider != null) firstClassPassengerCoachItemProvider.dispose();
		if (secondClassPassengerCoachItemProvider != null) secondClassPassengerCoachItemProvider.dispose();
	}

}
