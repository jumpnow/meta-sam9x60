FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mchp-6.1.4:"

SRC_URI:append:sam9x60 = "\
    file://defconfig \
"
