FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mchp-6.6:"

SRC_URI:append:sam9x60 = "\
    file://defconfig \
"
