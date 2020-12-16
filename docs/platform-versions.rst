.. _platform-versions:

Platform versions
=================

.. list-table:: Versions
   :widths: auto
   :header-rows: 1

   * - Group
     - Artifact
     - Magnesium GA
     - Magnesium SR1
     - Magnesium SR2
     - Magnesium SR3

   * - org.opendaylight.odlparent
     - \*
     - 6.0.4
     - 6.0.6
     - 6.0.11
     - 6.0.12

   * - org.opendaylight.yangtools
     - yangtools-artifacts
     - 4.0.6
     - 4.0.8
     - 4.0.13
     - 4.0.14

   * - org.opendaylight.mdsal
     - binding-parent
     - 5.0.9
     - 5.0.10
     - 5.0.14
     - 5.0.15

   * - org.opendaylight.mdsal
     - mdsal-artifacts
     - 5.0.9
     - 5.0.10
     - 5.0.14
     - 5.0.16

   * - org.opendaylight.controller
     - mdsal-artifacts
     - 1.11.0
     - 1.11.1
     - 1.11.2
     - 1.11.3

   * - org.opendaylight.aaa
     - aaa-artifacts
     - 0.11.0
     - 0.11.1
     - 0.11.2
     - 0.11.3

   * - org.opendaylight.netconf
     - netconf-artifacts
     - 1.8.0
     - 1.8.1
     - 1.8.2
     - 1.8.3

.. note:: Most projects get their YANG Tools version via MD-SAL.
  ${project}-artifacts are maven `bill of materials <https://howtodoinjava.com/maven/maven-bom-bill-of-materials-dependency/>`__
  (a.k.a. bom or BOM), whose use is strongly recommended to avoid versions
  mismatch across multiple dependencies in poms.

.. note:: the restconf-artifacts BOM present previously Sodium is no more
   available and now part of the netconf-artifacts BOM.
