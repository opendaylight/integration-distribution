.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Silicon GA
     - Silicon SR1
     - Silicon SR2
     - Silicon SR3 development

   * - org.opendaylight.odlparent
     - \*
     - 8.1.1
     - 8.1.2
     - 8.1.3
     - 8.1.4

   * - org.opendaylight.infrautils
     - \*
     - 1.9.6
     - 1.9.8
     - 1.9.9
     - 1.9.10

   * - org.opendaylight.yangtools
     - \*
     - 6.0.5
     - 6.0.6
     - 6.0.7
     - 6.0.8

   * - org.opendaylight.mdsal
     - \*
     - 7.0.6
     - 7.0.7
     - 7.0.9
     - 7.0.10

   * - org.opendaylight.controller
     - \*
     - 3.0.7
     - 3.0.8
     - 3.0.10
     - 3.0.12

   * - org.opendaylight.aaa
     - \*
     - 0.13.2
     - 0.13.3
     - 0.13.5
     - 0.13.7

   * - org.opendaylight.netconf
     - \*
     - 1.13.1
     - 1.13.2
     - 1.13.4
     - 1.13.5

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


