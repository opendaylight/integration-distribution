.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Silicon Development

   * - org.opendaylight.odlparent
     - \*
     - 8.1.0

   * - org.opendaylight.infrautils
     - \*
     - 1.9.5

   * - org.opendaylight.yangtools
     - \*
     - 6.0.4

   * - org.opendaylight.mdsal
     - \*
     - 7.0.5

   * - org.opendaylight.controller
     - \*
     - 3.0.6

   * - org.opendaylight.aaa
     - aaa-artifacts
     - 0.13.1

   * - org.opendaylight.netconf
     - \*
     - 1.13.0

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


