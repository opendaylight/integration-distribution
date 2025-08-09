.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2024.09 Scandium GA
     - 2024.09 Scandium SR1
     - 2024.09 Scandium SR2
     - 2024.09 Scandium SR3

   * - org.opendaylight.odlparent
     - \*
     - 14.0.3
     - 14.0.4
     - 14.0.8
     - 14.1.1

   * - org.opendaylight.infrautils
     - \*
     - 7.0.3
     - 7.0.4
     - 7.1.2
     - 7.1.5

   * - org.opendaylight.yangtools
     - \*
     - 14.0.4
     - 14.0.5
     - 14.0.11
     - 14.0.15

   * - org.opendaylight.mdsal
     - \*
     - 14.0.2
     - 14.0.4
     - 14.0.11
     - 14.0.14

   * - org.opendaylight.controller
     - \*
     - 10.0.2
     - 10.0.4
     - 10.0.9
     - 10.0.11

   * - org.opendaylight.aaa
     - \*
     - 0.20.1
     - 0.20.3
     - 0.20.8
     - 0.20.10

   * - org.opendaylight.netconf
     - \*
     - 8.0.2
     - 8.0.3
     - 8.0.7
     - 8.0.8

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


