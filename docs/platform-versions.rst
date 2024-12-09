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
     - 2024.03 Calcium SR2
     - 2024.03 Calcium SR3

   * - org.opendaylight.odlparent
     - \*
     - 13.0.11
     - 13.1.3
     - 13.1.4
     - 13.1.5

   * - org.opendaylight.infrautils
     - \*
     - 6.0.6
     - 6.0.9
     - 6.0.10
     - 6.0.11

   * - org.opendaylight.yangtools
     - \*
     - 13.0.2
     - 13.0.6
     - 13.0.7
     - 13.0.8

   * - org.opendaylight.mdsal
     - \*
     - 13.0.1
     - 13.0.4
     - 13.0.6
     - 13.0.7

   * - org.opendaylight.controller
     - \*
     - 9.0.2
     - 9.0.4
     - 9.0.5
     - 9.0.6

   * - org.opendaylight.aaa
     - \*
     - 0.19.3
     - 0.19.5
     - 0.19.6
     - 0.19.8

   * - org.opendaylight.netconf
     - \*
     - 7.0.4
     - 7.0.7
     - 7.0.10
     - 7.0.11

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


