# SPDX-FileCopyrightText: none
# SPDX-License-Identifier: CC0-1.0

require ${PN}.inc
SRC_URI = "https://download.kde.org/stable/frameworks/5.106/baloo-${PV}.tar.xz"

SRC_URI:append:riscv64 = " \
    file://0001-we-cant-mmap-such-a-large-memory-on-riscv64.patch \
"

SRC_URI[sha256sum] = "4e6ae18e7a0a73e7c350c8bed995ece41063c12baab16fbb14d1c08ac48722bd"

