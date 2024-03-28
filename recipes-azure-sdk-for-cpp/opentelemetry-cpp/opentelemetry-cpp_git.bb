DESCRIPTION = "Opentelemetry"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI = "git://github.com/open-telemetry/opentelemetry-cpp.git;protocol=https;branch=main"

SRCREV = "a799f4aed9c94b765dcdaabaeab7d5e7e2310878"
PV = "1.14.2+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS = "gtest googlebenchmark"

inherit cmake

