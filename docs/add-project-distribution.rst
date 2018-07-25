.. _add-proj-dist:

Add Projects to distribution
============================

Managed Projects
----------------

Add features to distribution
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Managed projects must be in the distribution. Follow the steps below
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

Trigger distribution build
~~~~~~~~~~~~~~~~~~~~~~~~~~

Once the project is in the distribution it is recommended to build an publish a new distribution
every time a merge happens in the project. Follow the steps below to add this trigger:

#. Download releng/builder repository:

   .. code-block:: bash

      git clone ssh://<user>@git.opendaylight.org:29418/releng/builder

#. Add your merge job in following file under distribution-managed section:

   .. code-block:: bash

      jjb/integration/distribution/distribution-jobs.yaml

      - project:
          name: distribution-managed
          ...
          stream:
            - fluorine:
                branch: 'master'
                dependencies: >
                    aaa-merge-{stream},
                    bgpcep-merge-{stream},
                    coe-merge-{stream},
          ...

#. Push changes to releng/builder and wait for patch verification and review.

Self-Managed Projects
---------------------

Add features to distribution
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Self-Managed projects must only be in the distribution if they want to be packaged in distribution
and released at the same time as the Managed projects do.

Follow the next steps to add your karaf features to the OpenDaylight distribution:

#. Download int/dist repository:

   .. code-block:: bash

      git clone ssh://<user>@git.opendaylight.org:29418/integration/distribution

#. Add your feature repository in:

   .. code-block:: bash

      opendaylight/pom.xml

   .. note:: Always add your maven dependencies in alphabethical order.
             This also applies to the next steps.

#. Push changes to int/dist and wait for patch verification and review.

   Once the patches are merged your project will be part of the OpenDaylight distribution.

   .. note:: In order to install a Self-Managed feature, you have to first install the feature repository
             in karaf, the example below shows how to install a repository from the karaf console.

   .. code-block:: bash

      opendayligt>feature:repo-add mvn:org.opendaylight.sxp/features-sxp//xml/features

   .. note:: If the feature version is not specified in the URL (see example above), Karaf will use
             the latest version (normally only one stored) in the the system folder.

   .. note:: You can alternatively add the repository in the karaf boot file etc/org.apache.karaf.features.cfg

Add features to sanity test
~~~~~~~~~~~~~~~~~~~~~~~~~~~

Distribution sanity test runs once a day to verify all projects features, managed
and sef-managed, can be installed with no issues. Follow below steps to add your
features to the sanity test.

#. Download releng/builder repository:

   .. code-block:: bash

      git clone ssh://<user>@git.opendaylight.org:29418/releng/builder

#. Add your feature repo and user-facing features in:

   .. code-block:: bash

      jjb/integration/distribution/distribution-jobs.yaml

   See this example for the file section:

   .. code-block:: bash

      # Self-Managed projects features
      sm-repos: >
          mvn:org.opendaylight.sxp/features-sxp//xml/features

      sm-features: >
          odl-sxp-controller

#. Push changes to releng/builder and wait for patch verification and review.

Trigger distribution build
~~~~~~~~~~~~~~~~~~~~~~~~~~

Once the project is in the distribution it is recommended to build an publish a new distribution
every time a merge happens in the project. Follow the steps below to add this trigger:

#. Download releng/builder repository:

   .. code-block:: bash

      git clone ssh://<user>@git.opendaylight.org:29418/releng/builder

#. Add your merge job in following file under distribution-full section:

   .. code-block:: bash

      jjb/integration/distribution/distribution-jobs.yaml

      - project:
          name: distribution-full
          ...
          stream:
            - fluorine:
                branch: 'master'
                dependencies: >
                    sxp-merge-{stream},
           ...

#. Push changes to releng/builder and wait for patch verification and review.

