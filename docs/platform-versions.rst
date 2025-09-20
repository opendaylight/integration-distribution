.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2025.03 Titanium GA
     - 2025.03 Titanium SR1

   * - org.opendaylight.odlparent
     - \*
     - 14.1.0
     - 14.1.3

   * - org.opendaylight.infrautils
     - \*
     - 7.1.4
     - 7.1.7

   * - org.opendaylight.yangtools
     - \*
     - 14.0.14
     - 14.0.17

   * - org.opendaylight.mdsal
     - \*
     - 14.0.13
     - 14.0.18

   * - org.opendaylight.controller
     - \*
     - 11.0.0
     - 11.0.2

   * - org.opendaylight.aaa
     - \*
     - 0.21.0
     - 0.21.2

   * - org.opendaylight.netconf
     - \*
     - 9.0.0
     - 9.0.1

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.


