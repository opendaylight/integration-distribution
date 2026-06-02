.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - 2026.03 Chromium GA

   * - org.opendaylight.odlparent
     - \*
     - 14.3.1

   * - org.opendaylight.infrautils
     - \*
     - 7.1.12

   * - org.opendaylight.yangtools
     - \*
     - 15.0.2

   * - org.opendaylight.ietf
     - \*
     - 2.0.2

   * - org.opendaylight.mdsal
     - \*
     - 16.0.3

   * - org.opendaylight.controller
     - \*
     - 13.0.2

   * - org.opendaylight.aaa
     - \*
     - 0.23.2

   * - org.opendaylight.netconf
     - \*
     - 11.0.0

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.
