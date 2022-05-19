.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Phosphorus GA
     - Phosphorus SR1
     - Phosphorus SR2
     - Phosphorus SR3

   * - org.opendaylight.odlparent
     - \*
     - 9.0.6
     - 9.0.8
     - 9.0.13
     - 9.0.15

   * - org.opendaylight.infrautils
     - \*
     - 2.0.6
     - 2.0.8
     - 2.0.13
     - 2.0.15

   * - org.opendaylight.yangtools
     - \*
     - 7.0.8
     - 7.0.9
     - 7.0.14
     - 7.0.17

   * - org.opendaylight.mdsal
     - \*
     - 8.0.5
     - 8.0.7
     - 8.0.11
     - 8.0.15

   * - org.opendaylight.controller
     - \*
     - 4.0.3
     - 4.0.7
     - 4.0.10
     - 4.0.12

   * - org.opendaylight.aaa
     - aaa-artifacts
     - 0.14.3
     - 0.14.7
     - 0.14.10
     - 0.14.13

   * - org.opendaylight.netconf
     - \*
     - 2.0.5
     - 2.0.11
     - 2.0.14
     - 2.0.16

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


