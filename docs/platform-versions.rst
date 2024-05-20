.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2024.03 Calcium GA
     - 2024.03 Calcium SR1

   * - org.opendaylight.odlparent
     - \*
     - 13.0.11
     - 13.1.2

   * - org.opendaylight.infrautils
     - \*
     - 6.0.6
     - 6.0.8

   * - org.opendaylight.yangtools
     - \*
     - 13.0.2
     - 13.0.5

   * - org.opendaylight.mdsal
     - \*
     - 13.0.1
     - 13.0.3

   * - org.opendaylight.controller
     - \*
     - 9.0.2
     - 9.0.3

   * - org.opendaylight.aaa
     - \*
     - 0.19.3
     - 0.19.4

   * - org.opendaylight.netconf
     - \*
     - 7.0.4
     - 7.0.5

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


