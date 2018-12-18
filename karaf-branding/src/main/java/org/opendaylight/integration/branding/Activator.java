/*
 * Copyright © 2018 Red Hat, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.integration.branding;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {
    private static final Logger LOG = LoggerFactory.getLogger(Activator.class);

    private static final String PROPERTIES_FILENAME = "org/apache/karaf/branding/branding.properties";

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        Properties brandingProps = new Properties();
        try (InputStream brandingInputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(PROPERTIES_FILENAME)) {
            if (brandingInputStream == null) {
                throw new IOException("Resource not found; expected to be present on current thread classloader: "
                    + PROPERTIES_FILENAME);
            }
            brandingProps.load(brandingInputStream);
        }
        LOG.info("Starting OpenDaylight version {}", brandingProps.get("release"));
    }

    @Override
    public void stop(BundleContext bundleContext) {
        LOG.info("Stopping OpenDaylight");
    }
}
