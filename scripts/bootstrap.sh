#!/bin/bash
set -e

# Install Homebrew if not installed
which brew >/dev/null 2>&1 || /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# Install dependencies
brew update
brew install openjdk kotlin gradle node cocoapods fastlane
brew install --cask android-studio
brew install --cask visual-studio

# Install dotnet SDK
brew install --cask dotnet-sdk

# Setup Android SDK
export ANDROID_SDK_ROOT=$HOME/Library/Android/sdk
sdkmanager "platform-tools" "platforms;android-30" "build-tools;30.0.3"

# Setup iOS certificates
fastlane match development --readonly

echo "Bootstrap completed successfully!"