SUMMARY = "A console image for the sam9x60ek dev board"

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us"

inherit image

CORE_OS = " \
    kernel-modules \
    packagegroup-core-boot \
    openssh openssh-keygen openssh-sftp-server \
    tzdata \
"

EXTRA_TOOLS = " \
    bash \
    bzip2 \
    chrony \
    coreutils \
    curl \
    diffutils \
    dosfstools \
    e2fsprogs-mke2fs \
    ethtool \
    file \
    findutils \
    grep \
    htop \
    i2c-tools \
    ifupdown \
    iperf3 \
    iproute2 \
    iptables \
    less \
    lsof \
    ltrace \
    netcat-openbsd \
    parted \
    procps \
    strace \
    sysfsutils \
    tcpdump \
    util-linux \
    util-linux-blkid \
    unzip \
    wget \
    zip \
"

SECURITY_STUFF = " \
    checksec \
    wireguard-tools \
"

SYSTEMD_STUFF = " \
    systemd-analyze \
    systemd-bash-completion \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${EXTRA_TOOLS} \
    ${SECURITY_STUFF} \
    ${SYSTEMD_STUFF} \
"

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/EST5EDT ${IMAGE_ROOTFS}/etc/localtime
    echo 'America/New_York' > ${IMAGE_ROOTFS}/etc/timezone
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
"

export IMAGE_BASENAME = "console-image"
