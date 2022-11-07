.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2022.09 Chlorine GA
     - 2022.09 Chlorine SR1

   * - org.opendaylight.odlparent
     - \*
     - 11.0.1
     - 11.0.2

   * - org.opendaylight.infrautils
     - \*
     - 4.0.1
     - 4.0.2

   * - org.opendaylight.yangtools
     - \*
     - 9.0.1
     - 9.0.2

   * - org.opendaylight.mdsal
     - \*
     - 10.0.3

   * - org.opendaylight.controller
     - \*
     - 6.0.3

   * - org.opendaylight.aaa
     - \*
     - 0.16.4

   * - org.opendaylight.netconf
     - \*
     - 4.0.3

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


