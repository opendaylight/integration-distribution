.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Aluminium GA
     - Aluminium SR1 Development

   * - org.opendaylight.odlparent
     - \*
     - 7.0.5
     - 7.0.7

   * - org.opendaylight.infrautils
     - \*
     - 1.8.0
     - 1.8.2

   * - org.opendaylight.yangtools
     - \*
     - 5.0.5
     - 5.0.7

   * - org.opendaylight.mdsal
     - \*
     - 6.0.4
     - 6.0.7

   * - org.opendaylight.controller
     - \*
     - 2.0.3
     - 2.0.6

   * - org.opendaylight.aaa
     - aaa-artifacts
     - 0.12.0
     - 0.12.1-SNAPSHOT

   * - org.opendaylight.netconf
     - netconf-artifacts
     - 1.9.0
     - 1.9.1-SNAPSHOT

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


