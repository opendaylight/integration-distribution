.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2023.03 Argon GA
     - 2023.03 Argon SR1
     - 2023.03 Argon SR2 Development

   * - org.opendaylight.odlparent
     - \*
     - 12.0.3
     - 12.0.5
     - 12.0.7

   * - org.opendaylight.infrautils
     - \*
     - 5.0.3
     - 5.0.4
     - 5.0.6

   * - org.opendaylight.yangtools
     - \*
     - 10.0.4
     - 10.0.6
     - 10.0.9

   * - org.opendaylight.mdsal
     - \*
     - 11.0.7
     - 11.0.9
     - 11.0.12

   * - org.opendaylight.controller
     - \*
     - 7.0.4
     - 7.0.6
     - 7.0.9

   * - org.opendaylight.aaa
     - \*
     - 0.17.7
     - 0.17.8
     - 0.17.11

   * - org.opendaylight.netconf
     - \*
     - 5.0.4
     - 5.0.6
     - 5.0.7

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


