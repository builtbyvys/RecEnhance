#!/bin/bash

# Install pre-commit hook
ln -sf "$(pwd)/config/git-hooks/pre-commit" .git/hooks/pre-commit