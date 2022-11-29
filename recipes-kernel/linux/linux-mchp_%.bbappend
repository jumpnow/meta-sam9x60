FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mchp:"

SRC_URI:append:sam9x60 = "\
    file://ikconfig.cfg \
    file://wireguard.cfg \
"
