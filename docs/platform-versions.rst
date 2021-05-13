.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Silicon GA
     - Silicon SR1

   * - org.opendaylight.odlparent
     - \*
     - 8.1.1
     - 8.1.2

   * - org.opendaylight.infrautils
     - \*
     - 1.9.6
     - 1.9.8

   * - org.opendaylight.yangtools
     - \*
     - 6.0.5
     - 6.0.6

   * - org.opendaylight.mdsal
     - \*
     - 7.0.6
     - 7.0.7

   * - org.opendaylight.controller
     - \*
     - 3.0.7
     - 3.0.8

   * - org.opendaylight.aaa
     - \*
     - 0.13.2
     - 0.13.3

   * - org.opendaylight.netconf
     - \*
     - 1.13.1
     - 1.13.2

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


