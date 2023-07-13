FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mchp-5.15.68:"

SRC_URI:append:sam9x60 = "\
    file://ikconfig.cfg \
    file://wireguard.cfg \
"
