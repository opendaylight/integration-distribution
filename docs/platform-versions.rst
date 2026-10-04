.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2026.09 Manganese GA

   * - org.opendaylight.odlparent
     - \*
     - 15.0.2

   * - org.opendaylight.infrautils
     - \*
     - 8.0.3

   * - org.opendaylight.yangtools
     - \*
     - 16.1.0

   * - org.opendaylight.ietf
     - \*
     - 3.0.1

   * - org.opendaylight.mdsal
     - \*
     - 17.0.2

   * - org.opendaylight.controller
     - \*
     - 14.0.4

   * - org.opendaylight.aaa
     - \*
     - 0.24.4

   * - org.opendaylight.netconf
     - \*
     - 12.0.2

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.
