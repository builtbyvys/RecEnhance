#!/bin/bash

# Initialize submodules
git submodule update --init --recursive

# Setup Git hooks
./scripts/setup-git-hooks.sh