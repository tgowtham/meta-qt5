SUMMARY = "Qt/C++ wrapper for ZIP/UNZIP package"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=27818cd7fd83877a8e3ef82b82798ef4"
DEPENDS = "qtbase"

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BP}.tar.gz"
SRC_URI[md5sum] = "84163487a4c3470781c93e5f56c4ca43"
SRC_URI[sha256sum] = "91d827fbcafd099ae814cc18a8dd3bb709da6b8a27c918ee1c6c03b3f29440f4"

inherit qmake5

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
EXTRA_QMAKEVARS_POST += "SUBDIRS=${BPN}"