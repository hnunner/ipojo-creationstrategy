package com.adviser.ipojo.creationstrategy;

import org.apache.felix.ipojo.ComponentInstance;
import org.apache.felix.ipojo.IPOJOServiceFactory;
import org.apache.felix.ipojo.InstanceManager;
import org.apache.felix.ipojo.handlers.providedservice.strategy.ConfigurableCreationStrategy;

/**
 * @author h.nunner
 */
public class InstancePerLookupStrategy extends ConfigurableCreationStrategy implements IPOJOServiceFactory {

    /** the instance manager */
    private InstanceManager m_manager;


    /** {@inheritDoc} */
    @Override
    protected IPOJOServiceFactory getServiceFactory(InstanceManager manager) {
        this.m_manager = manager;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Object getService(ComponentInstance instance) {
        Object obj = m_manager.createPojoObject();
        return obj;
    }

    /** {@inheritDoc} */
    @Override
    public void ungetService(ComponentInstance instance, Object svcObject) { }

}
