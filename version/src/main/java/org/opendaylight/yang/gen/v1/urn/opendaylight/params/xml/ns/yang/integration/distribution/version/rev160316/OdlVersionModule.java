package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.integration.distribution.version.rev160316;
public class OdlVersionModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.integration.distribution.version.rev160316.AbstractOdlVersionModule {
    public OdlVersionModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public OdlVersionModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.integration.distribution.version.rev160316.OdlVersionModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    public class DummyCloseable implements java.lang.AutoCloseable {
        public DummyCloseable() {
        }

        public void close() {
        }
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        // TODO: Write something to datastore perhaps?
        return new DummyCloseable();
    }

}
