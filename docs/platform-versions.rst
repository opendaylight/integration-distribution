.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2026.03 Chromium GA
     - 2026.03 Chromium SR1

   * - org.opendaylight.odlparent
     - \*
     - 14.3.1
     - 14.3.7

   * - org.opendaylight.infrautils
     - \*
     - 7.1.12
     - 7.1.14

   * - org.opendaylight.yangtools
     - \*
     - 15.0.2
     - 15.1.5

   * - org.opendaylight.ietf
     - \*
     - 2.0.2
     - 2.0.6

   * - org.opendaylight.mdsal
     - \*
     - 16.0.3
     - 16.0.6

   * - org.opendaylight.controller
     - \*
     - 13.0.2
     - 13.0.4

   * - org.opendaylight.aaa
     - \*
     - 0.23.2
     - 0.23.4

   * - org.opendaylight.netconf
     - \*
     - 11.0.0
     - 11.0.1

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.
