.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Sulfur GA
     - Sulfur SR1

   * - org.opendaylight.odlparent
     - \*
     - 10.0.0
     - 10.0.2

   * - org.opendaylight.infrautils
     - \*
     - 3.0.0
     - 3.0.1

   * - org.opendaylight.yangtools
     - \*
     - 8.0.3
     - 8.0.6

   * - org.opendaylight.mdsal
     - \*
     - 9.0.2
     - 9.0.4

   * - org.opendaylight.controller
     - \*
     - 5.0.3
     - 5.0.5

   * - org.opendaylight.aaa
     - aaa-artifacts
     - 0.15.3
     - 0.15.5

   * - org.opendaylight.netconf
     - \*
     - 3.0.2
     - 3.0.4

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


