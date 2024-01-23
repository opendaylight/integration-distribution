.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2023.09 Potassium GA
     - 2023.09 Potassium SR1
     - 2023.09 Potassium SR2

   * - org.opendaylight.odlparent
     - \*
     - 13.0.4
     - 13.0.7
     - 13.0.10

   * - org.opendaylight.infrautils
     - \*
     - 6.0.2
     - 6.0.4
     - 6.0.5

   * - org.opendaylight.yangtools
     - \*
     - 11.0.2
     - 11.0.4
     - 11.0.5

   * - org.opendaylight.mdsal
     - \*
     - 12.0.2
     - 12.0.3
     - 12.0.4

   * - org.opendaylight.controller
     - \*
     - 8.0.2
     - 8.0.3
     - 8.0.4

   * - org.opendaylight.aaa
     - \*
     - 0.18.2
     - 0.18.3
     - 0.18.4

   * - org.opendaylight.netconf
     - \*
     - 6.0.4
     - 6.0.5
     - 6.0.6

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


