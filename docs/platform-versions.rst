.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2025.09 Vanadium GA
     - 2025.09 Vanadium SR1

   * - org.opendaylight.odlparent
     - \*
     - 14.1.6
     - 14.3.1

   * - org.opendaylight.infrautils
     - \*
     - 7.1.9
     - 7.1.12

   * - org.opendaylight.yangtools
     - \*
     - 14.0.20
     - 14.0.23

   * - org.opendaylight.ietf
     - \*
     - 1.0.2
     - 1.0.4

   * - org.opendaylight.mdsal
     - \*
     - 15.0.2
     - 15.0.4

   * - org.opendaylight.controller
     - \*
     - 12.0.3
     - 12.0.5

   * - org.opendaylight.aaa
     - \*
     - 0.22.3
     - 0.22.5

   * - org.opendaylight.netconf
     - \*
     - 10.0.2
     - 10.0.3

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


