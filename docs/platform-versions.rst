.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2023.09 Potassium Development

   * - org.opendaylight.odlparent
     - \*
     - 13.0.3

   * - org.opendaylight.infrautils
     - \*
     - 6.0.1

   * - org.opendaylight.yangtools
     - \*
     - 11.0.0

   * - org.opendaylight.mdsal
     - \*
     - 12.0.0

   * - org.opendaylight.controller
     - \*
     - 8.0.0

   * - org.opendaylight.aaa
     - \*
     - 0.18.0

   * - org.opendaylight.netconf
     - \*
     - 6.0.0

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


