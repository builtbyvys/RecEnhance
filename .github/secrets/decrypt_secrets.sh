#!/bin/bash
set -e

gpg --quiet --batch --yes --decrypt --passphrase="$IOS_KEYS_SECRET_PASSPHRASE" \
--output .github/secrets/Certificates.p12 .github/secrets/Certificates.p12.gpg

gpg --quiet --batch --yes --decrypt --passphrase="$IOS_KEYS_SECRET_PASSPHRASE" \
--output .github/secrets/RecEnhanced_Ad_Hoc.mobileprovision .github/secrets/RecEnhanced_Ad_Hoc.mobileprovision.gpg

mkdir -p ~/Library/MobileDevice/Provisioning\ Profiles

cp .github/secrets/RecEnhanced_Ad_Hoc.mobileprovision ~/Library/MobileDevice/Provisioning\ Profiles/ProjectName_Ad_Hoc.mobileprovision


security create-keychain -p "$TEMP_KEYCHAIN_PASSWORD" build.keychain
security import .github/secrets/Certificates.p12 -t agg -k ~/Library/Keychains/build.keychain -P "$IOS_CERTIFICATE_PASSWORD" -A

security list-keychains -s ~/Library/Keychains/build.keychain
security default-keychain -s ~/Library/Keychains/build.keychain
security unlock-keychain -p "$TEMP_KEYCHAIN_PASSWORD" ~/Library/Keychains/build.keychain

security set-key-partition-list -S apple-tool:,apple: -s -k "$TEMP_KEYCHAIN_PASSWORD" ~/Library/Keychains/build.keychain