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
     - 2022.09 Chlorine SR2
     - 2022.09 Chlorine SR3

   * - org.opendaylight.odlparent
     - \*
     - 11.0.1
     - 11.0.3
     - 11.0.4
     - 11.0.5

   * - org.opendaylight.infrautils
     - \*
     - 4.0.1
     - 4.0.3
     - 4.0.4
     - 4.0.5

   * - org.opendaylight.yangtools
     - \*
     - 9.0.1
     - 9.0.5
     - 9.0.6
     - 9.0.7

   * - org.opendaylight.mdsal
     - \*
     - 10.0.2
     - 10.0.5
     - 10.0.6
     - 10.0.7

   * - org.opendaylight.controller
     - \*
     - 6.0.2
     - 6.0.5
     - 6.0.7
     - 6.0.8

   * - org.opendaylight.aaa
     - \*
     - 0.16.3
     - 0.16.6
     - 0.16.7
     - 0.16.8

   * - org.opendaylight.netconf
     - \*
     - 4.0.2
     - 4.0.4
     - 4.0.5
     - 4.0.6

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


