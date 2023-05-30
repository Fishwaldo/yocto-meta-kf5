# SPDX-FileCopyrightText: 2023 Justin Hammond <justin@dynam.ac>
#
# SPDX-License-Identifier: MIT

DESCRIPTION = "Kross"
SUMMARY = "Embedding of scripting into applications"
HOMEPAGE = "https://invent.kde.org/frameworks/kross"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"


inherit cmake_plasma
inherit ki18n


DEPENDS = " \
    kiconthemes \
    kio \
    kparts \
    qtscript \
"

