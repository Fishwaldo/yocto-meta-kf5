# SPDX-FileCopyrightText: none
# SPDX-License-Identifier: CC0-1.0

require ${PN}.inc
SRC_URI = "https://download.kde.org/stable/frameworks/5.106/kirigami2-${PV}.tar.xz"
SRC_URI[sha256sum] = "f56fd9046a4a6a4053c252c0719a4c8d83d2400e5a8a3d5e299cce5348b7f160"
S = "${WORKDIR}/kirigami2-${PV}"
