.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2023.03 Argon Development

   * - org.opendaylight.odlparent
     - \*
     - 12.0.1

   * - org.opendaylight.infrautils
     - \*
     - 5.0.1

   * - org.opendaylight.yangtools
     - \*
     - 10.0.2

   * - org.opendaylight.mdsal
     - \*
     - 11.0.4

   * - org.opendaylight.controller
     - \*
     - 7.0.2

   * - org.opendaylight.aaa
     - \*
     - 0.17.3

   * - org.opendaylight.netconf
     - \*
     - 5.0.1

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


