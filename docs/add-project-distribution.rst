.. _add-proj-dist:

Add Projects to distribution
============================

Managed Projects
----------------

Managed projects must be in the distribution. Follow the next steps below
to add your karaf features to distribution:

#. Download int/dist repository:

.. code-block:: bash

    git clone ssh://<user>@git.opendaylight.org:29418/integration/distribution

#. Make sure the projects you depend are already in the pom file:

.. code-block:: bash

    features/repos/index/pom.xml

#. Check your project version is correct in the file:

.. code-block:: bash

    artifacts/upstream/properties/pom.xml

#. Declare your feature repositories and user-facing features dependencies:

If your project artifacts pom.xml contains your karaf feature repos and features,
just add your project artifacts dependency in:

.. code-block:: bash

    artifacts/upstream/artifacts/pom.xml

Otherwise add your project feature repositories and your user-facing features to:

.. code-block:: bash

    artifacts/upstream/feature-repos/pom.xml
    artifacts/upstream/single-features/pom.xml

.. note:: Always add your maven dependencies in alphabethical order.
          This also applies to the next steps.

#. Add your feature repositories in:

.. code-block:: bash

    features/repos/index/pom.xml

#. Add your user facing features in either:

.. code-block:: bash

    features/singles/odl-integration-compatible-with-all/pom.xml

if your feature is compatible.

.. code-block:: bash

    features/singles/odl-integration-all/pom.xml

if your feature is not compatible.

.. note:: You do not need to add a feature if it is already contained
          in another feature you have already included.

Remember compatible features are those that can co-exist with other features in ODL because:

* They do not interfere with any other feature
* They are not network intrusive (e.g. configure network devices or push flows out-of-the-box)

#. Push changes to int/dist and wait for patch verification and review.

Once the patch is merged your project will be part of the OpenDaylight distribution
and join the distribution-check verification.


Self-Managed Projects
---------------------

Self-Managed projects must only be in the distribution if they want to be packaged in distribution
and released at the same time as the Managed projects do.

Follow the next steps to add your karaf features to the OpenDaylight distribution:

#. Download int/dist repository:

.. code-block:: bash

    git clone ssh://<user>@git.opendaylight.org:29418/integration/distribution

#. Add your feature reporsitory in:

.. code-block:: bash

    opendaylight/pom.xml

.. note:: Always add your maven dependencies in alphabethical order.
          This also applies to the next steps.

#. Download releng/builder repository:

.. code-block:: bash

    git clone ssh://<user>@git.opendaylight.org:29418/releng/builder

#. Add your feature repo and user-facing features in:

.. code-block:: bash

    jjb/releng-defaults.yaml

See this example for the file section:

.. code-block:: bash

    # Self-Managed projects features
    sm-repos: >
        mvn:org.opendaylight.sxp/features-sxp/1.7.0-SNAPSHOT/xml/features

    sm-features: >
        odl-sxp-controller

#. Push changes to int/dist and releng/builder and wait for patch verification and review.

Once the patches are merged your project will be part of the OpenDaylight distribution
and join the distribution-sanity verification.

.. note:: In order to install a Self-Managed feature, you have to first install the feature repository
          in karaf, the example below shows how to install a repository from the karaf console.

.. code-block:: bash

   opendayligt>feature:repo-add mvn:org.opendaylight.sxp/features-sxp/1.7.0-SNAPSHOT/xml/features

.. note:: You can alternatively add the repository in the karaf boot file etc/org.apache.karaf.features.cfg
