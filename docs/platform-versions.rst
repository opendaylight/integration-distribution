.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2024.03 Calcium Development

   * - org.opendaylight.odlparent
     - \*
     - 13.0.11

   * - org.opendaylight.infrautils
     - \*
     - 6.0.6

   * - org.opendaylight.yangtools
     - \*
     - 13.0.2

   * - org.opendaylight.mdsal
     - \*
     - 13.0.1

   * - org.opendaylight.controller
     - \*
     - 9.0.2

   * - org.opendaylight.aaa
     - \*
     - 0.19.3

   * - org.opendaylight.netconf
     - \*
     - 7.0.4

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


